<!--
 UC: 21018 - COMPILAÇÃO 
 E-Fólio A

 Versão 9

 Aluno: 2202009 - Vasco Lopes
 Última modificação : 15 / 04 / 2025

 -->

# ERROS CORRIGIDOS NO CÓDIGO-FONTE


## EXEMPLO 1
  
`if (k<=1)
 return 1;`  
> tem de ser:  

`if (k<=1) {
    return 1;
}`


`else
 return k * fact (k-1);`
> tem de ser:  

`else {
    return k * fact(k - 1);
}`
  

`writes("Introduza inteiro: ")`  
> tem de ser:  

`writes("Introduza inteiro: ");`  
  
  
## EXEMPLO 2  
`writes("Introduza inteiro: ")`  
> tem de ser:  

`writes("Introduza inteiro: ");`  
  
  
## EXEMPLO 3  
`writes("Introduza tamanho do vetor, seguido dos respetivos valores: ")`
> tem de ser:  

`writes("Introduza tamanho do vetor, seguido dos respetivos valores: ");`
  
  
## EXEMPLO 4 - Código proposto por IA - Claude 3.7  
sem erros.  
  
  
## EXEMPLO 5 - Código proposto por IA - Gemini 2.0  
Tinha os comentários no formato C (//).  
  
  
## EXEMPLO 6 - Código proposto por IA - Llama 3.3  
Tinha os comentários no formato C (//).  
Não assumiu a necessidade de prototipagem prévia das funções.  
  
  
## EXEMPLO 7 - Código proposto por IA - Llama 3.3  
Tinha os comentários no formato C (//).  
Não assumiu a necessidade de prototipagem prévia das funções.  
  
  
## EXEMPLO 8 - Código proposto por IA - Llama 3.3  
Tinha os comentários no formato C (//).  
Não assumiu a necessidade de prototipagem prévia das funções.  
  
  
## EXEMPLO 9 - Código proposto por IA – ChatGPT 4.o  
Tinha os comentários no formato C (//).  
  
  
## EXEMPLO 10 - Código proposto por IA – ChatGPT 4.o  
Tinha os comentários no formato C (//).  
> O erro esperado: não ter blocos entre chavetas `{}` nas instruções `if` e `else` - está presente.  

Identifiquei ainda um erro na gramática, que não considerava a possibilidade a atribuição de um valor negativo a uma variável.  
  
  
## EXEMPLO 11 - Código proposto por IA – ChatGPT 4.o  
Tinha os comentários no formato C (//).  
O erro esperado: usar a variável `a` sem a declarar previamente - não está presente, porque a implementação atual apenas analisa as componentes léxica e sintática, não a semântica.  