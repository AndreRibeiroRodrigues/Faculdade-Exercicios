package Lista_1;

import java.util.Scanner;

class Lista_Atividade_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos chops foram pedidos?");
		int chops = sc.nextInt();
		System.out.println("Quantas pessoas iram pagar?");
		int pessoas = sc.nextInt();
		System.out.println("quantos tipos de coberturas foram pedidos?");
		int coberturas = sc.nextInt();
		sc.close();
		double conta = (1.80 * chops) + (25.00 + (3.50 * coberturas));
		double garcom = conta * 0.10;
		double contapPessoa = conta + garcom / pessoas;
		System.out.printf("%.2f pessoas foram no restalrante cada uma pagou %2.f", pessoas, contapPessoa);

	}

}