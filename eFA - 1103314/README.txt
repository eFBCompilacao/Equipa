README - MOCC - Compilador da linguagem MOCC
============================================

Este projeto implementa um analisador léxico e sintático para a linguagem **MOCC (My Own C)**, usando a ferramenta **ANTLR 4**. 
A gramática foi definida com base nas especificações fornecidas no enunciado do e-fólio A da UC de Compilação.

Autor: Paulo Couto  
Número de aluno: 1103314  
Data: Abril de 2025  
Unidade Curricular: Compilação (21018) – e-fólio A

---

📦 Estrutura do Projeto
-----------------------

- `MOC.g4` → Gramática da linguagem MOCC, escrita em ANTLR.
- `Main.java` → Programa principal que analisa um ficheiro `.moc` e gera a árvore sintática.
- `input.moc` → Ficheiro de entrada utilizado pelo `Main.java` (pode ser substituído por qualquer exemplo).
- `exemplo1.moc`, `exemplo2.moc`, `exemplo3.moc` → Exemplos de programas MOCC válidos e sem erros.
- `original_1.moc`, `original_2.moc`, `original_3.moc` → Versões com erros, usadas para testes negativos.
- `arvore_exemploX.txt` → Árvores sintáticas completas geradas.
- `parser/` → Pasta com os ficheiros Java gerados automaticamente pelo ANTLR.
- `README.txt` → Este documento.

---

⚙️ Requisitos
-------------

- Java JDK 11 ou superior
- ANTLR 4.13.1
- Terminal bash (Windows WSL - Ubuntu)
- Visual Studio Code

---

🚀 Como usar
------------

1. Abrir o terminal e navegar até à pasta `efolioa/.

2. Gerar o parser (se ainda não estiver gerado):
   ```bash
   antlr4 -Dlanguage=Java -o parser MOC.g4

3. Compilar o projeto

   javac -cp ".:antlr-4.13.1-complete.jar" parser/*.java Main.java

4.Testar um exemplo:

   cp exemplo1.moc input.moc
   java -cp ".:antlr-4.13.1-complete.jar:parser" Main


5. O programa imprime no terminal a árvore sintática simplificada e gera o ficheiro arvore_sintatica.txt com a versão completa (incluindo todos os tokens).

-----------------------

* Este trabalho contou com o apoio do modelo de linguagem ChatGPT (OpenAI). 
* O uso da IA foi feito com sentido crítico e serviu de apoio ao desenvolvimento autónomo do projeto.

