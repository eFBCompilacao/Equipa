//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 1
//
// Adaptado de:
// https://stackoverflow.com/questions/48555825/antlr4-is-there-a-simple-example-of-using-the-parsetree-walker
//	
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 13 / 04 / 2025
//
//


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Observar {
    public static void main(String[] argumentos) throws Exception {
        if (argumentos.length != 1) {
            System.err.println("Forma de utilizar: java Observar <ficheiro.moc>");
            return;
        }

        // Carrega o ficheiro MOC
        CharStream entrada = fromFileName(argumentos[0]);

        // Análise léxica
        MOC_Lexico lexico = new MOC_Lexico(entrada);

        // Gera a sequência de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexico);

        // Análise sintática
        MOC_Interpretador sintatico = new MOC_Interpretador(tokens);

        // Obtem árvore sintática a partir da regra inicial 'programa'
        ParseTree arvore = sintatico.programa();

        // Cria o listener personalizado (podes modificar/adaptar este)
        //MOC_InterpretadorListener observador = new MOC_InterpretadorBaseListener();

        // Percorre a árvore sintática com o observador
        // ParseTreeWalker navegar = new ParseTreeWalker();
        // navegar.walk(observador, arvore);
		
		MeuVisitar visitar = new MeuVisitar();
		visitar.visit(arvore);
    }
}
