package arquivo;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite a quantidade de nomes a ser gerado: ");
        int qtdNomes = Integer.parseInt(sc.nextLine());

        sc.close();

        ArrayList<String> nomes = Metodos.lerArquivosTxt("nomes.txt");
        ArrayList<String> sobrenomes = Metodos.lerArquivosTxt("sobrenomes.txt");
        ArrayList<String> nomesCompletos = new ArrayList<String>();
        ArrayList<Integer> sobrenomesEscolhidos = new ArrayList<Integer>();


        for (Integer i = 0; i < qtdNomes; i++) {

            Integer idade = Metodos.gerarNumeroAleatorio(0, 100, null);
            Integer tamNomeMeio = Metodos.gerarNumeroAleatorio(0, 2, null);
            String nome = nomes.get(Metodos.gerarNumeroAleatorio(0, nomes.size() - 1, null));
            Integer sobrenomePosition = Metodos.gerarNumeroAleatorio(0, sobrenomes.size() - 1, null);
            String sobrenome = sobrenomes.get(sobrenomePosition);
            sobrenomesEscolhidos.add(sobrenomePosition);

            String nomeMeio = null;
            // GERA UM "SOBRENOME UNICO" PARA O NOME DO MEIO.
            for (Integer j = 0; j < tamNomeMeio; j++) {
                Integer nomeMeioPosition = Metodos.gerarNumeroAleatorio(0, sobrenomes.size() - 1, sobrenomesEscolhidos);
                sobrenomesEscolhidos.add(nomeMeioPosition);

                if (nomeMeio == null || nomeMeio.equals("")) {
                    nomeMeio = sobrenomes.get(nomeMeioPosition);
                } else {
                    nomeMeio += " " + sobrenomes.get(nomeMeioPosition);
                }
            }
            
            String nomeCompleto;
            if (nomeMeio == null) {
                nomeCompleto = nome + " " + sobrenome + ";" + idade + ";";
            } else {
                nomeCompleto = nome + " " + nomeMeio.charAt(0)+"." + " " + sobrenome + ";" + idade + ";";
            }
            nomesCompletos.add(nomeCompleto);
        }
        Metodos.escreverArquivoTxt(nomesCompletos);
        //esa função printa na tela o que foi digitado
        System.out.println(qtdNomes + " nomes gerados com sucesso!");
        System.out.println("Foram salvos no arquivo \'nomes_completo\'!");
    }

    

    

    
}