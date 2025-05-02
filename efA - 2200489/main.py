from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from antlr_gen.MOCParser import MOCParser
from antlr_gen.MOCLexer import MOCLexer
from antlr_gen.MOCListener import MOCListener

# -----------------------------------------------------------------------------
# Tabela de símbolos global (reiniciada antes de cada análise)
# -----------------------------------------------------------------------------
def reset_symbol_table():
    return {
        "variables": {},            # nome -> {type: 'int'|'double', initialized: bool, is_array: bool}
        "function_prototypes": {},  # nome -> True
        "function_definitions": {}, # nome -> True
        "has_main": False
    }

symbol_table = reset_symbol_table()

# -----------------------------------------------------------------------------
# Listener personalizado de erro para capturar erros sintáticos
# -----------------------------------------------------------------------------
class CountingErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.syntax_errors_found = False

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.syntax_errors_found = True
        print(f"[Erro de parsing] Linha {line}:{column} {msg}")


# -----------------------------------------------------------------------------
# Funções auxiliares para inferir tipo de expressão e saber se var é array
# -----------------------------------------------------------------------------
def infer_expr_type(expr_ctx):
    """
    Deduz de forma simples se a expressão é 'int', 'double' ou desconhecida:
      - Se for um intExpr => 'int'
      - Se for um doubleExpr => 'double'
      - Se for um idExpr => retorna o tipo da variável, se existir na tabela
      - Caso contrário => None

    Não trata subexpressões mais complexas (+, -, etc.) para manter simples.
    """
    if expr_ctx is None:
        return None

    # Se a expressão for algo mais complexo, getChildCount() será > 1
    if expr_ctx.getChildCount() == 1:
        child = expr_ctx.getChild(0)
        text = child.getText()

        if isinstance(child, ParserRuleContext):
            rule_index = child.getRuleIndex()
            rule_name = child.parser.ruleNames[rule_index]
            if rule_name == "intExpr":
                return "int"
            if rule_name == "doubleExpr":
                return "double"
            if rule_name == "idExpr":
                if text in symbol_table["variables"]:
                    return symbol_table["variables"][text]["type"]
                # se não estiver na tabela, já se reportou noutro local
                return None
    return None

def is_array_var(var_name):
    """ Retorna True se var_name foi declarada como array. """
    if var_name in symbol_table["variables"]:
        return symbol_table["variables"][var_name].get("is_array", False)
    return False


# -----------------------------------------------------------------------------
# Listener principal para verificação semântica
# -----------------------------------------------------------------------------
class MOCSemanticListener(MOCListener):

    def enterFunctionDecl(self, ctx):
        name = ctx.ID().getText()
        symbol_table["function_prototypes"][name] = True
        if name == "main":
            symbol_table["has_main"] = True
        print(f"[Info] Protótipo da função '{name}' declarado.")

    def enterFunctionDef(self, ctx):
        name = ctx.ID().getText()
        symbol_table["function_definitions"][name] = True
        if name not in symbol_table["function_prototypes"]:
            print(f"[Erro semântico] Protótipo da função '{name}' não declarado antes da definição.")
        if name == "main":
            symbol_table["has_main"] = True
        print(f"[Info] Função definida: '{name}'.")

    def enterEveryRule(self, ctx):
        """
        Útil para depuração e debugging.
        """
        ruleIndex = ctx.getRuleIndex()
        ruleName = ctx.parser.ruleNames[ruleIndex]
        # print(f"[DEBUG] enterEveryRule: {ruleName}")

    # -------------------------------------------------------------------------
    # Nova regra: paramDecl (adiciona o parâmetro à tabela de símbolos)
    # -------------------------------------------------------------------------
    def enterParamDecl(self, ctx):
        """
        Se existir ID, adicionamos à tabela de variáveis para
        evitar erro de 'variável não declarada' em parâmetros (ex.: k).
        """
        tipo_ctx = ctx.type_()
        var_type = tipo_ctx.getText() if tipo_ctx else "int"

        maybe_id = ctx.ID()
        if maybe_id:
            param_name = maybe_id.getText()
            child_texts = [c.getText() for c in ctx.children]
            is_array = ('[' in child_texts and ']' in child_texts)

            if param_name not in symbol_table["variables"]:
                symbol_table["variables"][param_name] = {
                    "type": var_type,
                    "initialized": True,
                    "is_array": is_array
                }
                print(f"[Info] Parâmetro '{param_name}' do tipo '{var_type}' registado.")
            else:
                print(f"[Aviso] Parâmetro '{param_name}' já existe na tabela de símbolos (escopo simplificado).")

    def enterDeclaration(self, ctx):
        var_type = ctx.varType().getText()
        decls = ctx.variableDeclList().variableDecl()

        for decl in decls:
            var_name = decl.ID().getText()
            children_texts = [c.getText() for c in decl.children]
            is_array = ('[' in children_texts and ']' in children_texts)

            if var_name in symbol_table["variables"]:
                print(f"[Aviso] Variável '{var_name}' já declarada anteriormente.")
            else:
                expr_ctx = decl.expression() if hasattr(decl, "expression") else None
                initialized = (expr_ctx is not None)
                symbol_table["variables"][var_name] = {
                    "type": var_type,
                    "initialized": initialized,
                    "is_array": is_array
                }
                if not initialized:
                    print(f"[Info] Variável '{var_name}' não inicializada: valor 0 por omissão.")

            print(f"[Info] Variável declarada: '{var_name}'.")

    def enterAssignment(self, ctx):
        """
        assignment: (ID | ID '[' expression ']') '=' expression;
        Ex.: x = 3;  ou  v[2] = y+1;
        """
        var_name = ctx.ID().getText()
        if var_name not in symbol_table["variables"]:
            print(f"[Erro semântico] Variável '{var_name}' usada antes de ser declarada.")
        else:
            symbol_table["variables"][var_name]["initialized"] = True
            print(f"[Info] Atribuição à variável '{var_name}'.")

            # Se for array e o lado direito for read(...) => erro
            if is_array_var(var_name):
                rhs_text = ctx.getChild(ctx.getChildCount() - 1).getText()
                if rhs_text.startswith("read(") or rhs_text.startswith("readc(") or rhs_text.startswith("reads("):
                    print(f"[Erro semântico] Tentativa de ler array '{var_name}' sem usar ciclo for.")

    def exitAssignment(self, ctx):
        """
        Verificação mínima de tipos:
          int x=3.14 -> conversão implícita
        assignment pode ter 3 children (x=expr) ou 6 (x[expr]=expr).
        """
        var_name = ctx.ID().getText()
        if var_name not in symbol_table["variables"]:
            return

        child_count = ctx.getChildCount()
        if child_count == 3:
            rhs_expr_ctx = ctx.expression(0)
        elif child_count == 6:
            rhs_expr_ctx = ctx.expression(1)
        else:
            rhs_expr_ctx = None

        var_type = symbol_table["variables"][var_name]["type"]
        expr_type = infer_expr_type(rhs_expr_ctx)
        if expr_type is not None and expr_type != var_type:
            pair = {var_type, expr_type}
            if pair == {"int", "double"}:
                print(f"[Aviso] Conversão implícita de {expr_type} para {var_type} em '{var_name}'.")

    def enterFunctionCall(self, ctx):
        """
        Verifica se a função foi declarada.
        """
        if ctx.ID() is not None:
            name = ctx.ID().getText()
            builtins = {"read", "readc", "reads", "write", "writec", "writev", "writes"}
            if name not in builtins and name not in symbol_table["function_prototypes"]:
                print(f"[Aviso] Chamada à função '{name}' sem protótipo declarado.")

        # Se for writec(...), assumimos que o valor é ASCII
        if ctx.getText().startswith("writec"):
            print("[Info] Função writec utilizada: assumindo que o valor é código ASCII.")

    def enterIdExpr(self, ctx):
        """
        Se um ID surge como expressão sozinha (ex.: y no x=y+1),
        verifica se y está declarado.
        """
        var_name = ctx.ID().getText()
        if var_name not in symbol_table["variables"]:
            print(f"[Erro semântico] Variável '{var_name}' usada em expressão antes de ser declarada.")

    def enterArrayAccessExpr(self, ctx):
        """
        v[3] => arrayAccessExpr
        Verifica se 'v' é declarado e se é array
        """
        var_name = ctx.ID().getText()
        if var_name not in symbol_table["variables"]:
            print(f"[Erro semântico] Variável '{var_name}' usada em expressão antes de ser declarada.")
            return
        if not symbol_table["variables"][var_name].get("is_array", False):
            print(f"[Erro semântico] Variável '{var_name}' não é array, mas usada como tal.")


# -----------------------------------------------------------------------------
# Função recursiva para imprimir a árvore de análise de forma indentada
# -----------------------------------------------------------------------------
def print_tree(node, rule_names, indent=0):
    espacos = "  " * indent
    linhas = []

    if isinstance(node, TerminalNode):
        token_text = node.getText()
        linhas.append(f"{espacos}{token_text}")
    elif isinstance(node, ParserRuleContext):
        rule_name = rule_names[node.getRuleIndex()]
        linhas.append(f"{espacos}({rule_name}")
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            linhas.append(print_tree(child, rule_names, indent=indent+1))
        linhas.append(f"{espacos})")
    else:
        linhas.append(f"{espacos}<?> {str(node)}")

    return "\n".join(linhas)

# -----------------------------------------------------------------------------
# parse_file: Função principal de parsing + verificação semântica + impressão
# -----------------------------------------------------------------------------
def parse_file(filename):
    global symbol_table
    symbol_table = reset_symbol_table()

    with open(filename, 'r', encoding='utf-8-sig') as f:
        content = f.read()

    # Cria o fluxo de entrada para o ANTLR
    input_stream = InputStream(content)
    lexer = MOCLexer(input_stream)
    stream = CommonTokenStream(lexer)
    stream.fill()

    # Configuramos o parser
    parser = MOCParser(stream)
    parser.removeErrorListeners()

    # Adicionamos o nosso ErrorListener
    error_listener = CountingErrorListener()
    parser.addErrorListener(error_listener)

    # Fazemos o parse
    try:
        tree = parser.program()
    except Exception as e:
        print(f"[Erro de parsing] {e}")
        return

    if error_listener.syntax_errors_found:
        print("\n[Erro] Foram detetados erros sintáticos. A árvore não será exibida.")
        return

    # Percorremos a árvore com o nosso listener semântico
    walker = ParseTreeWalker()
    listener = MOCSemanticListener()
    walker.walk(listener, tree)

    # Verificamos se 'main' foi encontrada
    if not symbol_table["has_main"]:
        print("[Erro semântico] A função 'main' não está definida.")
    else:
        print("[Sucesso] A função 'main' foi definida.")

    # Por fim, imprimimos a árvore de análise
    print("\n----- Árvore de Análise (Indentada) -----")
    arvore_str = print_tree(tree, parser.ruleNames)
    print(arvore_str)


# Ponto de entrada principal
if __name__ == '__main__':
    parse_file("exemplo_valido.moc")
