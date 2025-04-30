grammar MOC;

// === TOKENS ===


INT         : 'int';
DOUBLE      : 'double';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
FOR         : 'for';
RETURN      : 'return';
VOID        : 'void';
READ        : 'read';
READC       : 'readc';
READS       : 'reads';
WRITE       : 'write';
WRITEC      : 'writec';
WRITES      : 'writes';
WRITEV      : 'writev';

MAIS        : '+';
MENOS       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';

IGUAL       : '==';
DIFERENTE   : '!=';
MENOR       : '<';
MENORIGUAL  : '<=';
MAIOR       : '>';
MAIORIGUAL  : '>=';

E_LOGICO    : '&&';
OU_LOGICO   : '||';
NAO         : '!';

ATRIB       : '=';

ABREPAR     : '(';
FECHAPAR    : ')';
ABRECHAV    : '{';
FECHACHAV   : '}';
ABRECOL     : '[';
FECHACOL    : ']';
PONTOVIRG   : ';';
VIRG        : ',';

IDENT       : [a-zA-Z_][a-zA-Z0-9_]*;
INTLIT      : [0-9]+;
DOUBLELIT   : [0-9]+ '.' [0-9]+;
STRINGLIT   : '"' .*? '"';

COMENTARIO_BLCO : '/*' .*? '*/' -> skip;
COMENTARIO_LINHA : '//' ~[\r\n]* -> skip;
ESPACO      : [ \t\r\n]+ -> skip;

// === REGRAS DO PARSER ===

programa        : (decl* funcao+)?;

decl            : tipo varList PONTOVIRG;

tipo            : INT | DOUBLE;

varList         : var (VIRG var)*;

var             : IDENT
                | IDENT ATRIB expressao
                | IDENT ABRECOL INTLIT FECHACOL
                | IDENT ATRIB ABRECHAV expressaoLista FECHACHAV;

expressaoLista  : expressao (VIRG expressao)*;

funcao          : tipo IDENT ABREPAR parametros? FECHAPAR bloco
                | VOID IDENT ABREPAR parametros? FECHAPAR bloco;

parametros      : parametro (VIRG parametro)*;

parametro       : tipo IDENT
                | tipo IDENT ABRECOL FECHACOL;

bloco           : ABRECHAV instrucao* FECHACHAV;

instrucao       : bloco
                | decl
                | atribuicao PONTOVIRG
                | chamadaFuncao PONTOVIRG
                | leitura PONTOVIRG
                | escrita PONTOVIRG
                | instrucaoIf
                | instrucaoWhile
                | instrucaoFor
                | RETURN expressao? PONTOVIRG;

instrucaoIf     : IF ABREPAR condicao FECHAPAR bloco (ELSE bloco)?;

instrucaoWhile  : WHILE ABREPAR condicao FECHAPAR bloco;

instrucaoFor    : FOR ABREPAR atribuicao PONTOVIRG condicao PONTOVIRG atribuicao FECHAPAR bloco;

atribuicao      : IDENT ATRIB expressao
                | IDENT ABRECOL expressao FECHACOL ATRIB expressao;

chamadaFuncao   : IDENT ABREPAR argumentos? FECHAPAR;

argumentos      : expressao (VIRG expressao)*;

leitura         : IDENT ATRIB (READ ABREPAR FECHAPAR
                             | READC ABREPAR FECHAPAR
                             | READS ABREPAR FECHAPAR);

escrita         : (WRITE | WRITEC | WRITES | WRITEV) ABREPAR expressao FECHAPAR;

condicao        : expressao
                | expressao operadorCondicional expressao
                | condicao E_LOGICO condicao
                | condicao OU_LOGICO condicao
                | NAO condicao;

operadorCondicional : IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL;

expressao
    : expressao MULT expressao
    | expressao DIV expressao
    | expressao MOD expressao
    | expressao MAIS expressao
    | expressao MENOS expressao
    | ABREPAR expressao FECHAPAR
    | IDENT
    | IDENT ABRECOL expressao FECHACOL
    | INTLIT
    | DOUBLELIT
    | chamadaFuncao;

