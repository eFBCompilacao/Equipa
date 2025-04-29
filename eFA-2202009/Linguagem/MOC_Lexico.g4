//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 2
//
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 13 / 04 / 2025
//
//

lexer grammar MOC_Lexico;

// Tipos de Dados
INTEIRO         : 'int' ;
DUPLO           : 'double' ;

// Main
VAZIO           : 'void' ;
FUNCAOPRINCIPAL	: 'main';

// Instruções Permitidas
SE              : 'if' ;
SENAO           : 'else' ;
ENQUANTO        : 'while' ;
PARA            : 'for' ;
DEVOLVE         : 'return' ;

// Funções conhecidas
LER             : 'read' ;
LERCARACT       : 'readc' ;
LERVETOR        : 'readv' ;
LERCADEIA       : 'reads' ;
ESCREVER        : 'write' ;
ESCREVERCARACT  : 'writec' ;
ESCREVERVETOR   : 'writev' ;
ESCREVERCADEIA  : 'writes' ;

// Operadores aritméticos
MAIS            : '+' ;
MENOS           : '-' ;
MULTIPLICA      : '*' ;
DIVIDE          : '/' ;
RESTO           : '%' ;

// Operadores comparação
MENOR           : '<' ;
MENORIGUAL      : '<=' ;
MAIOR           : '>' ;
MAIORIGUAL      : '>=' ;
IGUAL           : '==' ;
DIFERENTE       : '!=' ;

// Operadores lógicos
ELOGICO         : '&&' ;
OULOGICO        : '||' ;
NAO             : '!' ;

// Parêntises e chavetas
ABREPARENTISES           : '(' ;
FECHAPARENTISES          : ')' ;
ABRECHAVETAS             : '{' ;
FECHACHAVETAS            : '}' ;
ABREPARENTISESRETOS      : '[' ;
FECHAPARENTISESRETOS     : ']' ;

// Assignar variável
ATRIBUICAO      : '=' ;

// Pontuação
PONTOVIRG       : ';' ;
VIRGULA         : ',' ;

// Literais
IDENTIFICADOR   : [a-zA-Z_][a-zA-Z0-9_]* ;
LINTEIRO      	: [0-9]+ ;
LREAL         	: [0-9]+ '.' [0-9]* ;
// REAL : [0-9]+ ('.' [0-9]*)? | '.' [0-9]+ ; // lida melhor com n inteiros
// TEXTO        : '"' (~["\r\n])* '"' ;

// Espaços e quebras de linha (ignorar)
ESPACO          : [ \t\r\n]+ -> skip ;

// Comentários multilinha (estilo C)
COMENTARIO      : '/*' .*? '*/' -> skip ;
