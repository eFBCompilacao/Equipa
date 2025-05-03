grammar MOC;

// ----------- Regras sintáticas (Parser) -----------
program: (declaration | function)* EOF;

declaration: varDecl;

function: type ID '(' (paramList | 'void')? ')' block;

paramList: param (',' param)*;

param: type ID ('[' ']')?;

varDecl: type varList ';';

varList: var (',' var)*;

var:
	ID ('[' expr? ']')? ('=' (expr | functionCall | arrayInit))?;

arrayInit: '{' expr (',' expr)* '}';

type: 'int' | 'double' | 'void';

block: '{' statement* '}';

statement:
	varDecl
	| assignment
	| ifStatement
	| whileStatement
	| forStatement
	| functionCall ';'
	| 'write' '(' expr ')' ';'
	| 'writes' '(' (STRING | ID) ')' ';'
	| 'writec' '(' expr ')' ';'
	| 'writev' '(' ID ')' ';'
	| 'return' expr? ';'
	| block;

assignment: (ID | ID '[' expr ']') '=' expr ';';

ifStatement: 'if' '(' expr ')' block ('else' block)?;

whileStatement: 'while' '(' expr ')' block;

forStatement:
	'for' '(' assignment expr ';' assignment ')' block;

functionCall:
	ID '(' argList? ')' // chamadas a funções normais
	| 'read' '(' ')' // read()
	| 'readc' '(' ')' // readc()
	| 'reads' '(' ')' ; // reads()

argList: expr (',' expr)*;

expr:
	expr op = ('*' | '/') expr
	| expr op = ('+' | '-') expr
	| expr op = ('<' | '>' | '<=' | '>=' | '==' | '!=') expr
	| expr op = '&&' expr
	| expr op = '||' expr
	| '!' expr
	| '(' expr ')'
	| ID '[' expr ']' // acesso a vetor
	| ID
	| INT
	| DOUBLE
	| functionCall;

// ----------- Regras léxicas (Lexer) -----------

ID: [a-zA-Z_][a-zA-Z_0-9]*;

INT: [0-9]+;

DOUBLE: [0-9]+ '.' [0-9]+;

STRING: '"' (~["\r\n])* '"';

WS: [ \t\r\n]+ -> skip;

COMMENT: '/*' .*? '*/' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;