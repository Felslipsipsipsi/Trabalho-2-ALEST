package aula28_arvorebinariapesquisa;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public static String[] ler(String nome) {
        ArrayList<String> linhas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nome));
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + nome);
        }
        return linhas.toArray(new String[0]);
    }

    public static void gravar(String nome, String conteudo) {
        try {
            PrintWriter pw = new PrintWriter(nome);
            pw.println(conteudo);
            pw.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar o arquivo: " + nome);
        }
    }
}