package Lista_2;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int número;

			System.out.println("Escolha um número: ");
			número = entrada.nextInt();

			if (número % 2 == 0) {
				System.out.println("Número Par");

			} else if (número == 0) {
				System.out.println("O número é zero.");
			}

			else
				System.out.println("Número Ímpar");
		}

	}

}
