//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 1
//
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 13 / 04 / 2025
//
//


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.Token;

public class AnalisadorTokens {
    public static void main(String[] argumentos) throws Exception {
        if (argumentos.length != 1) {
            System.err.println("Forma de Utilizar: java AnalisadorTokens <ficheiro.moc>");
            System.exit(1);
        }

        CharStream entrada = CharStreams.fromFileName(argumentos[0]);
        MOC_Lexico lexico = new MOC_Lexico(entrada);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        tokens.fill();

        for (Token token : tokens.getTokens()) {
            String nome = MOC_Interpretador.VOCABULARY.getSymbolicName(token.getType());
            System.out.printf("Linha %d: %s (%s)%n", token.getLine(), token.getText(), nome);
        }
    }
}
