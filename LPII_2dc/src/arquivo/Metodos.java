package arquivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    public static Integer gerarNumeroAleatorio(Integer tamMin, Integer tamMax, ArrayList<Integer> numNaoAceitos) {
        Integer numAleatorio;

        if (numNaoAceitos == null) {
            numNaoAceitos = new ArrayList<Integer>();
        }

        do {
            numAleatorio = Integer.parseInt(String.valueOf(Math.round((Math.random() * tamMax) + tamMin)));
        } while (numNaoAceitos.contains(numAleatorio));

        return numAleatorio;
    }

    public static void escreverArquivoTxt(ArrayList<String> nomes) {
        PrintWriter arquivo = null;

        try {
            FileWriter out = new FileWriter("nomes_completos.txt");
            arquivo = new PrintWriter(out);

            for (Integer i = 0; i < nomes.size(); i++) {
                arquivo.println(nomes.get(i));
            }

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            arquivo.close();
        }
    }

    
    public static ArrayList<String> lerArquivosTxt(String nomeArquivo) {
        Scanner arquivo = null;
        ArrayList<String> listaTexto = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(nomeArquivo);
            arquivo = new Scanner(fr);

            while (arquivo.hasNext()) {
                listaTexto.add(arquivo.next());
            }

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            arquivo.close();
        }

        return listaTexto;
    }
}