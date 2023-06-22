package arquivo_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        lerArquivo("nomes_completos.txt");
        

    }

    public static void escreverArquivo(ArrayList<Lista> listaNome) {
        PrintWriter pw = null;
        
        try {
            FileWriter fw = new FileWriter("nome_indice.txt");
            pw = new PrintWriter(fw,true);
            
            for(int i = 0; i < listaNome.size(); i++){
                System.out.println(listaNome.get(i));
                pw.println((i+1)+"-"+listaNome.get(i).toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void lerArquivo(String arquivo) {
        Scanner sc = null;
        Lista l = new Lista();
        ArrayList<Lista> listaNome = new ArrayList<Lista>();
        try {
            FileReader fr = new FileReader(arquivo);
            sc=new Scanner(fr);
            while(sc.hasNext()){
                String list[] = sc.nextLine().split(";");
                l.setNome(list[0]);
                l.setIdade(Integer.parseInt(list[1]));
                listaNome.add(l);
                System.out.println(l.getNome()+l.getIdade());                
                
            }
            escreverArquivo(listaNome);

        } catch (Exception e) {
            System.err.print(e);
        }finally{
            sc.close();
        }

    }
}