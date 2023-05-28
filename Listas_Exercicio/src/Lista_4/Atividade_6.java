package Lista_4;

import java.util.Scanner;

public class Atividade_6 {
	public static void main(String[] args) {
		System.out.println("Iniciando o sistema");
		Scanner sc = new Scanner(System.in);
		double[] matrix = new double[3];
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("Digite %dº numero", (i + 1));
			matrix[i] = sc.nextInt();
		}
		media(matrix);
	}

	static public void media(double[] matrix) {
		double soma = 0;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			soma += matrix[i];
			count++;
		}
		double media = (soma / count);
		System.out.println("A media da matriz é "+ media);
	}

}
