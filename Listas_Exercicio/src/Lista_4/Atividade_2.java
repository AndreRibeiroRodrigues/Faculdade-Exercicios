package Lista_4;

import java.util.Scanner;

public class Atividade_2 {
	public static void main(String[] args) {
		System.out.println("Iniciando o programa");
		System.out.println("Digite um numero");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("O fatorial de %d é %d", num, calcularFatorial(num));
	}

	public static int calcularFatorial(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}
}
