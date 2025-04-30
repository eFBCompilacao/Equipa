import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestMOC {
    public static void main(String[] args) throws Exception {
    
        // Pede ao utilizador o nome do ficheiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduz o nome do ficheiro (ex: exemplo1.txt): ");
        String fileName = scanner.nextLine();

        // Lê o conteúdo do ficheiro
        StringBuilder inputBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                inputBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
            return;
        }

        String inputCode = inputBuilder.toString();

        // Cria input stream a partir do conteúdo lido
        CharStream input = CharStreams.fromString(inputCode);

        // Instancia o lexer
        MOCLexer lexer = new MOCLexer(input);

        // Cria um fluxo de tokens a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Instancia o parser
        MOCParser parser = new MOCParser(tokens);

        // Gera a árvore sintática a partir da regra inicial 'programa'
        ParseTree tree = parser.programa();

        // Mostra a árvore sintática com janela Swing
        JFrame frame = new JFrame("Árvore de Derivação MOC");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.2); // zoom
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}

