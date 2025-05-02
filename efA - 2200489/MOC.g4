grammar MOC;

// Programa principal
program: (declaration | functionDecl | functionDef)* EOF;

// Tipos permitidos para variáveis
varType: 'int' | 'double';

// Tipos permitidos para funções
type: varType | 'void';

// Declaração de variáveis
declaration: varType variableDeclList ';';

variableDeclList: variableDecl (',' variableDecl)*;

variableDecl
    : ID                                     # simpleDecl
    | ID '=' expression                      # initDecl
    | ID '[' INT ']'                         # arrayDecl
    | ID '=' '{' expression (',' expression)* '}'  # arrayInit
    | ID '[]' '=' functionCall               # arrayInitFromCall
    ;

// Declarações e definições de funções
functionDecl: type ID '(' paramList? ')' ';';
functionDef : type ID '(' paramList? ')' block;

paramList
    : (paramDecl (',' paramDecl)*) | 'void'
    ;

paramDecl
    : type (ID)?
    ;

param: type ID;

// Bloco de código
block: '{' statement* '}';

// Instruções
statement
    : declaration                                     #declStmt
    | assignment ';'                                  #assignStmt
    | functionCall ';'                                #callStmt
    | 'if' '(' condition ')' block ('else' block)?    #ifStmt
    | 'while' '(' condition ')' block                 #whileStmt
    | 'for' '(' assignment ';' condition ';' assignment ')' block   #forStmt
    | 'return' expression? ';'                        #returnStmt
    | 'writes' '(' (expression | STRING)? ')' ';'     #writesStmt
    | 'write' '(' expression ')' ';'                  #writeStmt
    | 'writec' '(' expression ')' ';'                 #writecStmt
    | 'writev' '(' ID ')' ';'                         #writevStmt
    ;

// Atribuições (a variáveis ou a elementos de vetor)
assignment: (ID | ID '[' expression ']') '=' expression;

// Chamadas a funções
functionCall
    : ID '(' argumentList? ')'                       # normalFuncCall
    | 'read' '(' ')'                                 # readExpr
    | 'readc' '(' ')'                                # readcExpr
    | 'reads' '(' ')'                                # readsExpr
    ;

argumentList: expression (',' expression)*;

// Condições (incluindo operadores lógicos)
condition
    : expression                            # singleCond
    | expression relop expression           # binaryCond
    | '!' condition                         # notCond
    | condition '&&' condition              # andCond
    | condition '||' condition              # orCond
    ;

relop: '==' | '!=' | '<' | '<=' | '>' | '>=';

// Expressões
expression
    : <assoc=right> expression op=('*'|'/'|'%') expression    # multExpr
    | <assoc=right> expression op=('+'|'-') expression        # addExpr
    | '(' expression ')'                                      # parenExpr
    | cast                                                    # castExpr
    | functionCall                                            # funcCallExpr
    | ID '[' expression ']'                                   # arrayAccessExpr
    | ID                                                      # idExpr
    | INT                                                     # intExpr
    | DOUBLE                                                  # doubleExpr
    ;

cast: '(' type ')' expression;

// IDENTIFICADORES E CONSTANTES
ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
STRING: '"' .*? '"';

// IGNORAR ESPAÇOS E COMENTÁRIOS
WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
