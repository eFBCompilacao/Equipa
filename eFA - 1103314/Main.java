import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "input.moc";
        String outputFile = "arvore_sintatica.txt";

        InputStream is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        MOCLexer lexer = new MOCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MOCParser parser = new MOCParser(tokens);

        ParseTree tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("✅ Compilação bem-sucedida!\n");

            // 1. Imprimir no terminal (versão filtrada)
            printTreeFiltrada(tree, parser, 0, new PrintWriter(System.out, true));

            // 2. Gravar no ficheiro (versão completa com todos os tokens)
            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
                printTreeCompleta(tree, parser, 0, writer);
            }

        } else {
            System.out.println("❌ Erros de sintaxe encontrados.");
        }
    }

    // 🌿 Impressão da árvore no terminal (filtrada)
    public static void printTreeFiltrada(ParseTree tree, Parser parser, int indent, PrintWriter out) {
        String nodeText = Trees.getNodeText(tree, parser);
        String indentStr = "  ".repeat(indent);

        if (!nodeText.matches("[(){};,.<EOF>]")) {
            out.println(indentStr + nodeText);
        }

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTreeFiltrada(tree.getChild(i), parser, indent + 1, out);
        }
    }

    // 🌳 Impressão da árvore no .txt (com todos os tokens)
    public static void printTreeCompleta(ParseTree tree, Parser parser, int indent, PrintWriter out) {
        String nodeText = Trees.getNodeText(tree, parser);
        String indentStr = "  ".repeat(indent);

        out.println(indentStr + nodeText);

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTreeCompleta(tree.getChild(i), parser, indent + 1, out);
        }
    }
}

