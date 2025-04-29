//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 8
//
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 14 / 04 / 2025
//
//

parser grammar MOC_Interpretador;
options { tokenVocab = MOC_Lexico; }

// === Regras de topo ===
// o programa é constituído por declarações, protótipos e funções
programa
    : (prototipo | declaracao_variaveis | funcao | principal)* EOF ;

 
/*
 * ===  Instruções da linguagem MOC ===
 *
 * if ou if-else
 * While e For
 * leitura e escrita
 * blocos e expressões
 * return
 *
 */
 
instrucao
    : instrucaoSE
    | instrucaoENQUANTO
    | instrucaoPARA
    | instrucaoDEVOLVE
    | instrucaoLEITURA
    | instrucaoESCRITA
    | expressao PONTOVIRG // Removido na versão 3 porque permitia instruções soltas, reintegrado na versão 6 para suportar instruções simples
    | bloco
    ;

// === Instruções condicionais (if, if-else) ===

instrucaoSE
    : instrucaoSEsimples
    | instrucaoSEcompleto
    | instrucaoSEgeral
    ;

instrucaoSEsimples
    : SE ABREPARENTISES expressao FECHAPARENTISES instrucaoSE
    | SE ABREPARENTISES expressao FECHAPARENTISES instrucaoSEcompleto SENAO instrucaoSEsimples
    ;

instrucaoSEcompleto
    : SE ABREPARENTISES expressao FECHAPARENTISES instrucaoSEcompleto SENAO instrucaoSEcompleto
    | instrucaoSEgeral
    ;

instrucaoSEgeral
    : expressao PONTOVIRG                        // expressão terminada com ponto e vírgula
    | bloco                                      // bloco de código entre parêntises { ... }
    ;


// === Instruções de ciclo (while) ===

instrucaoENQUANTO
    : ENQUANTO ABREPARENTISES expressao FECHAPARENTISES instrucao
    ;


// === Instruções de ciclo (for) ===

instrucaoPARA
    : PARA ABREPARENTISES expressao PONTOVIRG expressao PONTOVIRG expressao FECHAPARENTISES instrucao
    ;


// === Instruções de devolução de valor (return) ===

instrucaoDEVOLVE
    : DEVOLVE expressao PONTOVIRG
    ;


// === Instruções de leitura (read, readc, reads) ===

instrucaoLEITURA
    : (LER | LERCARACT | LERCADEIA) ABREPARENTISES FECHAPARENTISES PONTOVIRG
    ;


// === Instruções de escrita (write, writec, writev, writes) ===

instrucaoESCRITA
    : (ESCREVER | ESCREVERCARACT | ESCREVERVETOR | ESCREVERCADEIA) ABREPARENTISES expressao FECHAPARENTISES PONTOVIRG
    ;


// === Bloco de instruções

bloco
    : ABRECHAVETAS (declaracao_variaveis | instrucao)* FECHACHAVETAS // foi adicionada a declaracao_variaveis para funcionar o exemplo 1
    ;


/*
 * Regras para expressões
 * (Ordem de precedência controlada pela ordem das regras)
 */
 
expressao
    : ABREPARENTISES expressao FECHAPARENTISES                                      		# parentises
    | ABREPARENTISES tipo FECHAPARENTISES expressao                                 		# casting
    | IDENTIFICADOR ABREPARENTISESRETOS expressao FECHAPARENTISESRETOS ATRIBUICAO expressao # atribuicao_vetor
    | IDENTIFICADOR ATRIBUICAO expressao                                            		# atribuicao
    | IDENTIFICADOR ABREPARENTISES argumentos? FECHAPARENTISES                      		# chamada_funcao
    | IDENTIFICADOR ABREPARENTISESRETOS expressao FECHAPARENTISESRETOS             			# acesso_vetor
    | IDENTIFICADOR                                                                 		# variavel_simples
// ordem de precedências
    | NAO expressao                                                                 		# negacao 
    | MENOS expressao                                                               		# unitario_negativo // Adicionado na versão 8, para lidar com variavel negativa do exemplo 10
    | MAIS expressao                                                                		# unitario_positivo // Adicionado na versão 8
    | expressao MULTIPLICA expressao                                                		# multiplicacao
    | expressao DIVIDE expressao                                                    		# divisao
    | expressao RESTO expressao                                                    			# resto
    | expressao MAIS expressao                                                     			# adicao
    | expressao MENOS expressao                                                    			# subtraccao
    | expressao op=(MENOR | MENORIGUAL | MAIOR | MAIORIGUAL | IGUAL | DIFERENTE) expressao 	# comparacao
    | expressao ELOGICO expressao                                                  			# conjuncao
    | expressao OULOGICO expressao                                                 			# disjuncao
// Literais
    | LINTEIRO                                                                     	 		# literal_inteiro
    | LREAL                                                                        			# literal_real
    | ABRECHAVETAS expressao (VIRGULA expressao)* FECHACHAVETAS                    			# literal_vetor
// chamadas das funções conhecidas - leitura e escrita
    | LER ABREPARENTISES FECHAPARENTISES                                            		# chamada_read
    | LERCARACT ABREPARENTISES FECHAPARENTISES                                      		# chamada_readc
	| LERVETOR ABREPARENTISES FECHAPARENTISES          										# chamada_readv
    | LERCADEIA ABREPARENTISES FECHAPARENTISES                                      		# chamada_reads
    | ESCREVER ABREPARENTISES FECHAPARENTISES                                       		# chamada_write
    | ESCREVERCARACT ABREPARENTISES FECHAPARENTISES                                 		# chamada_writec
	| ESCREVERVETOR ABREPARENTISES FECHAPARENTISES          								# chamada_writev
    | ESCREVERCADEIA ABREPARENTISES FECHAPARENTISES                                 		# chamada_writes	
    ;




/*
 * Declarações de variáveis
 *
 * Exemplos dados pelo enunciado MOC 
 * int m, n=2, v[10];
 * double x = 3.14;
 * int s[] = reads();
 *
 * Tipo de dados: int ou double
 *
 * Lista separada por vírgulas: m, n=2, v[10]
 *
 * Variáveis possíveis:
 * simples: m
 * inicializadas: n = 2
 * vetor com tamanho: v[10]
 * vetor sem tamanho com leitura: s[] = reads();
 * 
 */


declaracao_variaveis
    : tipo lista_variaveis PONTOVIRG
    ;


tipo
    : INTEIRO
    | DUPLO
	| VAZIO // Adicionado na versão 7, para correr o exemplo 4
//    | INTEIRO ABREPARENTISESRETOS FECHAPARENTISESRETOS // Reintroduzido na versão 5 e Removido na versão 6
//    | DUPLO ABREPARENTISESRETOS FECHAPARENTISESRETOS // Reintroduzido na versão 5 e Removido na versão 6
//    | INTEIRO ABREPARENTISESRETOS FECHAPARENTISESRETOS // Removido na versão 4
//    | DUPLO ABREPARENTISESRETOS FECHAPARENTISESRETOS // Removido na versão 4
    ;


lista_variaveis
    : variavel (VIRGULA variavel)*
    ;


variavel
    : IDENTIFICADOR
    | IDENTIFICADOR ATRIBUICAO expressao
    | IDENTIFICADOR ABREPARENTISESRETOS expressao FECHAPARENTISESRETOS
    | IDENTIFICADOR ABREPARENTISESRETOS FECHAPARENTISESRETOS ATRIBUICAO expressao
    ;

	
	
	

/*
 * Protótipos de função
 * Ex: int f(int);
 *     double soma(double, double);
 *
 * Lista de parâmetros formais: int, double x
 * Cada parâmetro pode ter apenas o tipo, ou tipo + nome
 * 
 */

prototipo
    : tipo IDENTIFICADOR ABREPARENTISES parametros? FECHAPARENTISES PONTOVIRG
	| VAZIO FUNCAOPRINCIPAL ABREPARENTISES VAZIO FECHAPARENTISES PONTOVIRG // V6 - permite void main(void);
    ;

parametros
    : parametro (VIRGULA parametro)*
    ;

parametro
    : tipo IDENTIFICADOR ABREPARENTISESRETOS FECHAPARENTISESRETOS // Removido na versão 4; V6 - vetor nomeado: double v[]
    | tipo ABREPARENTISESRETOS FECHAPARENTISESRETOS                // V6 - vetor sem nome: double []
    | tipo IDENTIFICADOR                                           // Removido na versão 3, para resolver o erro do exemplo 3; V6 - parâmetro normal
    | tipo // Removido na versão 3, para resolver o erro do exemplo 3 e reintegrado na versão 6, para resolver erros do exemplo2
    ;
//    : tipo IDENTIFICADOR? // Removido na versão 4, para resolver o erro do exemplo 3, atualizado na versão 5: aceita parâmetros com ou sem nome e Removido na versão 6



argumentos
    : expressao (VIRGULA expressao)*
    ;	
	
	

/*
 * Definições de funções
 * Ex: int f(int x, double y) { ... }
 *
 */

funcao
    : tipo IDENTIFICADOR ABREPARENTISES parametros? FECHAPARENTISES bloco
    ;




/*
 * Função principal (main)
 * A função main é reconhecida de forma rígida pela gramática -> void main(void).
 * Ex: void main(void) { ... }
 */

principal
    : VAZIO FUNCAOPRINCIPAL ABREPARENTISES VAZIO FECHAPARENTISES bloco
    ;

