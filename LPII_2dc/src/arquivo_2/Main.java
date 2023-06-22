package arquivo_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = lerArquivo("nomes_completos.txt");
        for(int i = 0; i< listaNomes.size();i++){
            System.out.println(listaNomes.get(i));
        }
        escreverArquivo(listaNomes);

    }

    public static void escreverArquivo(ArrayList<String> listaNome) {
        PrintWriter pw = null;
        
        try {
            FileWriter fw = new FileWriter("nome_indice.txt");
            pw = new PrintWriter(fw,true);
            
            for(int i = 0; i < listaNome.size(); i++){
                System.out.println(listaNome.get(i));
                pw.println((i+1)+"-"+listaNome.get(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static ArrayList<String> lerArquivo(String arquivo) {
        Scanner sc = null;
        ArrayList<String> listaNome = new ArrayList<>();
        try {
            FileReader fr = new FileReader(arquivo);
            sc=new Scanner(fr);
            while(sc.hasNext()){
                listaNome.add(sc.nextLine());
            }

        } catch (Exception e) {
            System.err.print(e);
        }finally{
            sc.close();
        }

        return listaNome;
    }
}