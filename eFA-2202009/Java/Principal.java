//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 3
//
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 15 / 04 / 2025
//
//


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.Trees;


/*
public class Principal {
    public static void main(String[] argumentos) throws Exception {
        MOC_Lexico lexico = new MOC_Lexico(CharStreams.fromFileName(argumentos[0]));
        MOC_Interpretador interpretador = new MOC_Interpretador(new CommonTokenStream(lexico));
        interpretador.programa();
    }
}


Esta versão é mto simples, não gera nenhum output em caso de sucesso.

*/


public class Principal {
    public static void main(String[] argumentos) throws Exception {
        if (argumentos.length != 1) {
            System.err.println("Forma de utilizar: java Principal <ficheiro.moc>");
            return;
        }

        MOC_Lexico lexico = new MOC_Lexico(CharStreams.fromFileName(argumentos[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        MOC_Interpretador interpretador = new MOC_Interpretador(tokens);

        ParseTree arvore = interpretador.programa();

        // Mostrar a árvore sintática graficamente
        Trees.inspect(arvore, java.util.Arrays.asList(interpretador.getRuleNames()));

        System.out.println("Compilação léxica e sintática concluída com sucesso.");
    }
}