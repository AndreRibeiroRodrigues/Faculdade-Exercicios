package Lista_3;

import java.util.Scanner;

public class Atividade_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura;
		double maior1 = 0;
		double maior2 = 0;
		int cont = 0;

		System.out.println("Digite a altura para parar digite 0: ");
		altura = sc.nextDouble();

		while (altura != 0) {
			cont = cont + 1;
			if (altura > maior1) {
				maior2 = maior1;
				maior1 = altura;

			} else if (altura > maior2 && altura != maior1) {
				maior2 = altura;

			}
			System.out.println("Digite a altura para parar digite 0: ");
			altura = sc.nextDouble();

		}
		if (cont == 0) {
			System.out.println("ninguem se inscreveu");

		} else if (cont == 1) {
			System.out.println("apenas uma pessoa se inscreveu, maior é " + maior1);

		} else {
			System.out.println("a primeira maior é " + maior1 + " a segunda maior é " + maior2);

		}
		sc.close();

	}

}
