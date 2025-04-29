::
:: UC: 21018 - COMPILAÇÃO 
:: E-Fólio A
::
:: Versão 1
::
:: Aluno: 2202009 - Vasco Lopes
::
:: Última modificação : 14 / 04 / 2025
::
::

@echo off
cls
:: ajuda a lidar com os nossos carateres em PT
chcp 65001 >nul 
setlocal ENABLEDELAYEDEXPANSION
set P='Pode fechar esta janela.'

:: Caminhos base do projeto
set ANTLR=H:\Program Files\Java\jdk-24\lib\antlr-4.13.2-complete.jar
set BASE=H:\TRABALHOS\UAB\LEI\COMPILAÇÃO\eFA\MOCC\eFACompilacao
set LINGUAGEM=%BASE%\Linguagem
set JAVA=%BASE%\Java
set EXEMPLOS=%BASE%\Exemplos
set LEXICO=MOC_Lexico.g4
set PARSER=MOC_Interpretador.g4

:: Solicita o nome do exemplo
set /p EXEMPLO=Introduz o nome do exemplo (sem .moc): 


:: Apaga ficheiros em Linguagem (exceto .g4)
echo.
echo A eliminar ficheiros em %LINGUAGEM% (exceto .g4)...
for %%f in (%LINGUAGEM%\*) do (
    if /I not "%%~xf"==".g4" del "%%f"
)

:: Apaga os ficheiros em Java (exceto .java) já existentes
echo.
echo A eliminar ficheiros em %JAVA% (exceto .java)...
for %%f in (%JAVA%\*) do (
    if /I not "%%~xf"==".java" del "%%f"
)

:: Gera os ficheiros do ANTLR
echo.
echo A gerar ficheiros do ANTLR...
cd /d %LINGUAGEM%
java -jar "%ANTLR%" -no-listener -visitor %LEXICO%
java -jar "%ANTLR%" -no-listener -visitor %PARSER%

:: Compilar todos os ficheiros Java (Linguagem e Java)
echo.
echo A compilar os ficheiros Java...
javac -cp "%LINGUAGEM%;%ANTLR%" %LINGUAGEM%\*.java %JAVA%\*.java

:: Pré-analisar o exemplo
echo.
echo A executar o PreAnalisador...
cd /d %JAVA%
java PreAnalisador %EXEMPLOS%\%EXEMPLO%.moc %EXEMPLOS%\%EXEMPLO%_proc.moc

:: Executar a Função Observar, para percorrer a árvore
echo.
echo A correr a Função Observar com %EXEMPLO%_proc.moc...
java -cp "%JAVA%;%LINGUAGEM%;%ANTLR%" Observar %EXEMPLOS%\%EXEMPLO%_proc.moc

endlocal
pause
