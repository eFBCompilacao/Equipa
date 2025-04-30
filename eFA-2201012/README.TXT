Para compilar o ficheiro MOC.g4: https://www.antlr.org/
Para gerar a árvore sintática, em JAVA: https://www.java.com/download/manual.jsp

Para correr ANTLR, em linux, usando JAVA:
	1.Editar as variáveis de ambiente:
		'nano ~/.bashrc'
			adicionar a linha:
				"export CLASSPATH=".:<path_to_antlr_jar>\antlr-4.x-complete.jar;$CLASSPATH"
				exemplo: export CLASSPATH=".:/usr/local/antlr-4.13.0-complete.jar:$CLASSPATH"
			(opcional) adicionar um alias: 
				alias antlr='java -jar /usr/local/antlr-4.13.0-complete.jar'

Compilar MOC.g4, usando ANTLR:
	antlr MOC.g4

Compilar o ficheiro TestMOC, usando JAVA:
	javac TestMOC.java

Correr TestMOC.java para gerar a árvore sintática:
	java TestMOC
