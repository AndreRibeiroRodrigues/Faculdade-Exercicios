package Lista_1;

import java.util.Scanner;

public class Lista_Atividade_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o nome di piloto");
		String nome = sc.nextLine();
		System.out.println("Digite o km  percorrido");
		double km = sc.nextDouble();
		System.out.println("digite o o tempo de duração da viagem");
		int duracao = sc.nextInt();
		double media = km / duracao;
		System.out.printf("A velocidade média de %S foi de %.2f km/h", nome, media);
		sc.close();

	}

}
