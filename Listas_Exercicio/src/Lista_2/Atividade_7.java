package Lista_2;

import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			int salário;
			int financiamento;

			System.out.println("Insira seu salário:");
			salário = entrada.nextInt();

			System.out.println("Insira o valor do financiamento pretendido:");
			financiamento = entrada.nextInt();

			if (financiamento <= 5 * salário) {
				System.out.println("Financiamento concedido.");

			} else
				System.out.println("Financiamento negado.");
		System.out.println("Obrigado por nos consultar");
	}

	

}