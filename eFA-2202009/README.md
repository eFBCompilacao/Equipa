
# eFACompilacao
<!--
 UC: 21018 - COMPILAÇÃO 
 E-Fólio A

 Versão 4

 Aluno: 2202009 - Vasco Lopes
 Última modificação : 15 / 04 / 2025

 -->


## Pré-requisitos
  
### Software
- JAVA JDK Instalado

- ANTLR v4 Instalado

- CLASSPATH definidas
  
  
### Instalação
  
****`Versão Windows`****
  
A aplicação não necessita de instalação prévia (requere que o software necessário esteja previamente instalado e funcional), apenas necessitando duas pequenas configurações prévias (em cada ficheiro .bat):

1 - Deve editar a variável BASE, para o caminho completo da diretoria raíz.

    `set BASE=H:\TRABALHOS\UAB\LEI\COMPILAÇÃO\eFA\MOCC\eFACompilacao

2 - Deve editar a variável ANTLR, para o caminho completo onde está o ANTLR.

    `set ANTLR=H:\Program Files\Java\jdk-24\lib\antlr-4.13.2-complete.jar

  
  
## Instruções de Utilização
  
### ANALISAR A ÁRVORE DE SINTAXE
 1. Executar o ficheiro `testar.bat`. 
 2. Escrever o nome do ficheiro que pretende testar (sem a extensão). 
 3. Utilize a Árvore de Sintaxe ANTLR para analisar a linguagem MOC. 
 4. Fechar a Árvore de Sintaxe ANTLR, antes de encerrar a execução.
 5. Clique em qualquer tecla para terminar a aplicação.
  

### ANALISAR OS TOKENS
 1. Executar o ficheiro `analisartokens.bat`. 
 2. Escrever o nome do ficheiro que pretende analisar (sem a extensão). 
 3. Será apresentado no ecrã a lista de todos os tokens da linguagem MOC. 
 4. Clique em qualquer tecla para terminar a aplicação.
  

<!-- ### ANALISAR AS ESTRUTURAS DAS INSTRUÇÕES
> 1. Executar o ficheiro `observar.bat`. 
> 2. Escrever o nome do ficheiro que pretende analisar (sem a extensão). 
> 3. Será apresentado no ecrã a lista de todas as instruções `SE`, `ENQUANTO` e `PARA` reconhecidas pela linguagem MOC. 
> 4. Clique em qualquer tecla para terminar a aplicação. -->

  
    
  
## Modo de Funcionamento
> NOTA: Qualquer ficheiro de código a testar nesta aplicação de compilação deve ser colocado previamente na diretoria *"Exemplos"*, com a extensão `.moc`.  Os ficheiros de código devem seguir as regras da linguagem MOC (ver tabelas em `LinguagemMOC.md`), sendo escritos em C, num único ficheiro.  
  
  
`TESTAR.BAT`  
O ficheiro fonte do código selecionado passa por um pré-analisador, escrito em Java, que analisa todas as saídas do código e converte todos os carateres nos seus respetivos códigos numéricos ASCII, uma vez que a linguagem apenas suporta três tipos de dados: inteiros, reais e vazios. O Pré-analisador guarda então o ficheiro fonte num novo ficheiro, com o mesmo nome, adicionando `_proc`.  
O novo ficheiro fonte é então analisado pelo ANTLR, com base em `MOC_Lexico.g4`, onde são identificados os tokens da linguagem.  
Os tokens são enviados ao parser (`MOC_Interpretador.g4`) que verifica se o código está estruturado de acordo com as regras gramaticais da linguagem MOC. Se forem detetados erros, são apresentados com a respetiva linha e tipo de erro.  
Se a análise tiver sucesso, é gerada uma árvore sintática do ANTLR, visualizada graficamente.  
  
`ANALISARTOKENS.BAT`  
O ficheiro fonte do código passa por um pré-analisador, escrito em Java, que converte todas as cadeias de texto para vetores de inteiros, correspondentes aos códigos ASCII dos respetivos carateres. O ficheiro resultante é guardado com o sufixo `_proc`.  
O novo ficheiro fonte é então analisado pelo ANTLR, com base em `MOC_Lexico.g4`, onde são identificados os tokens da linguagem.  
Os tokens detetados são apresentados no ecrã, com a seguinte informação: número da linha onde o token aparece; token; nome simbólico do token.  
Esta análise ajuda a detetar erros no léxico e a confirmar se os tokens estão a ser bem gerados.
  
  
## LISTA DE EXEMPLOS
  
### EXEMPLO1
Irá gerar múltiplos erros sintáticos e léxicos.
Este exemplo contém várias violações das regras obrigatórias da linguagem MOC, nomeadamente:
> “todos os blocos devem estar entre chavetas, mesmo quando têm uma só instrução”  
> “todas as instruções devem terminar com ponto e vírgula ;”  

No fim do ficheiro, disponibilizo uma versão corrigida do código.  
  
### EXEMPLO2
Irá gerar um erro sintático.  
>   “todas as instruções devem terminar com ponto e vírgula ;”  

No fim do ficheiro, disponibilizo uma versão corrigida do código.  
  
### EXEMPLO3
Irá gerar um erro sintático.  
>   “todas as instruções devem terminar com ponto e vírgula ;”  

No fim do ficheiro, disponibilizo uma versão corrigida do código.  
  
### EXEMPLO4
Este código calcula o fatorial de um número e exibe alguns exemplos de uso das características da linguagem.
Não gera erros.
  
### EXEMPLO5
Este código demonstra algumas das funcionalidades da linguagem, como declaração de variáveis, operações aritméticas, condicionais, ciclos e funções de entrada/saída.
Não gera erros.
  
### EXEMPLO6
Este código declara uma função f que recebe um int e retorna o seu dobro e uma função main que chama f com o valor 5 e imprime o resultado usando writes e write.
Não gera erros.  
  
### EXEMPLO7
Este código declara um vetor v com três elementos e imprime cada um deles usando um ciclo for. 
Não gera erros.  
  
### EXEMPLO8
Este código tem uma estrutura de controle de fluxo complexa, com:
> um for externo que itera sobre i de 0 a 4  
> um while que itera enquanto i for menor que 3  
> um if que verifica se o elemento v[i] é maior que 1  
> um for interno que itera sobre j de 0 a 2 e imprime os elementos do vetor v.  

Não gera erros.   
  
### EXEMPLO9
Este código lê dois inteiros do utilizador, calcula a sua soma e imprime o resultado. Usa as funções read, writes e write.
Não gera erros. 
    
### EXEMPLO10
Irá gerar erro sintático.  
Violação de uma regra sintática obrigatória da linguagem MOC, conforme descrito no ficheiro `MOCC.txt​`:  
> “todos os blocos devem estar entre chavetas, mesmo quando têm uma só instrução”  

A estrutura instrucaoSEsimples e instrucaoSEcompleto impõem que as ações do if e else sejam uma instrucaoSE, que acaba sempre por ser um bloco ou expressao PONTOVIRG.  
  
### EXEMPLO11
Irá gerar erro sintático. 
  
  
  
# DEFINIÇÕES
> Uma linguagem de programação, de acordo com Menezes (2000), pode ser vista de duas formas. Primeiro, como uma entidade livre, ou seja, sem qualquer significado associado. Segundo, como uma entidade juntamente com uma interpretação do seu significado.<br>
> A sintaxe trata das propriedades livres da linguagem como a verificação gramatical de programas. A semântica objetiva dar uma interpretação para a linguagem como um significado ou valor para um determinado programa. Consequentemente, a sintaxe basicamente manipula símbolos sem considerar os seus correspondentes significados.<br>
> Enquanto que a sintaxe cuida do modo de como a informação é transmitida (estrutura) e a semântica zela pelo significado das palavras, o léxico é responsável por verificar o acervo de palavas pertencentes a determinada linguagem. Tendo em vista que toda língua tem como característica básica a mutabilidade, o léxico de um idioma não é finito.<br>
> Sintaticamente falando, não existe uma noção de programa "errado". Neste caso, simplesmente não é um programa. Por outro lado, um programa sintaticamente válido, pode ser o programa que o programador esperava escrever. Assim, a questão de considerar um programa "correto" ou "errado" deve considerar se o mesmo modela adequadamente o comportamento desejado.<br>
>  Nem sempre os limites entre a sintaxe e a semântica são claros. Um exemplo é a ocorrência de um nome em um programa o qual pode ser tratado de forma igualmente fácil como um problema sintático ou semântico.<br>
  
*Fonte: Linguagens Formais e Autômatos - Léxico, Sintaxe e Semântica (https://autociencia.blogspot.com/2019/03/automatos-lexico-sintaxe-semantica.html), consultado a 06/04/2025*