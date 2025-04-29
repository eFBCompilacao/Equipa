//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 2
//
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 13 / 04 / 2025
//
//

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;
import java.util.*;

public class PreAnalisador {

    private static int contadorTemporarios = 0;

    public static void main(String[] argumentos) throws IOException {
        if (argumentos.length != 2) {
            System.err.println("Utilização: java PreAnalisador <entrada.moc> <saida.moc>");
            return;
        }

        Path caminhoEntrada = Paths.get(argumentos[0]);
        Path caminhoSaida = Paths.get(argumentos[1]);

        List<String> linhasOriginais = Files.readAllLines(caminhoEntrada);
        List<String> linhasTransformadas = new ArrayList<>();

        // Armazena as declarações a inserir antes de cada writes(...)
        Map<String, String> declaracoes = new LinkedHashMap<>();

        Pattern padrao = Pattern.compile("writes\\(\"([^\"]*)\"\\)");

        for (String linha : linhasOriginais) {
            Matcher correspondencia = padrao.matcher(linha);
            String linhaTransformada = linha;

            while (correspondencia.find()) {
                String texto = correspondencia.group(1);
                String nomeVariavel = "__tmp__" + contadorTemporarios++;

                // Converte cada carácter para código ASCII
                StringBuilder vetor = new StringBuilder("{");
                for (char c : texto.toCharArray()) {
                    vetor.append((int) c).append(",");
                }
                vetor.append("0}");

                // Criar a declaração da variável temporária
                String declaracao = "int " + nomeVariavel + "[] = " + vetor.toString() + ";";

                // Guardar a declaração para inserir antes da linha atual
                declaracoes.put(nomeVariavel, declaracao);

                // Substituir writes("...") por writes(__tmp__N)
                linhaTransformada = linhaTransformada.replaceFirst(
                    Pattern.quote(correspondencia.group(0)),
                    "writes(" + nomeVariavel + ")"
                );
            }

            // Inserir as declarações imediatamente antes da linha transformada
            for (String declaracao : declaracoes.values()) {
                linhasTransformadas.add(declaracao);
            }
            declaracoes.clear(); // reiniciar por linha

            linhasTransformadas.add(linhaTransformada);
        }

        Files.write(caminhoSaida, linhasTransformadas);
        System.out.println("Carateres ASCII transformados com sucesso: " + caminhoSaida);
    }
}

