package arvorebinariapesquisa;

import java.io.File;
import java.util.Scanner;

public class Arquivo {

    public static String[] ler(String nome) {
        String[] linhas = new String[100];
        int i = 0;

        Scanner sc = null;
        File arquivo = new File(nome);
        if (arquivo.exists()) {
            try {
                sc = new Scanner(arquivo);
                while (sc.hasNextLine() && i < linhas.length) {
                    linhas[i] = sc.nextLine();
                    i++;
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("Erro na leitura.");
            }
        } else {
            System.out.println("Arquivo não encontrado.");
        }

        return linhas;
    }

    public static void gravar(String nome, String conteudo) {
        java.io.File f = new java.io.File(nome);
        java.io.PrintStream ps = null;
        try {
            ps = new java.io.PrintStream(f);
            ps.println(conteudo);
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar.");
        }
    }
}

