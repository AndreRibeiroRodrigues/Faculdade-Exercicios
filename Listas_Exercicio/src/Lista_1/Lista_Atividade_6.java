package Lista_1;

import java.util.Scanner;

class Lista_Atividade_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double num = sc.nextInt();
		sc.close();

		double triplo = num * 3;
		double metade = num / 2;
		double raizCubica = num * num * num;
		double potencia = Math.pow(num, (2 / 3));
		System.out.printf("O triplo de %.2f é %.2f", num, triplo);
		System.out.printf("O metade de %.2f é %.2f", num, metade);
		System.out.printf("O raiz Cubica de %.2f é %.2f", num, raizCubica);
		System.out.printf("O Potecia Fracionária de %.2f é %.2f", num, potencia);
	}
}