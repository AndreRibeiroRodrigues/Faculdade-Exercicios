package Lista_1;

import java.util.Scanner;

class Lista_Atividade_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que sera convertido:");
		double c = sc.nextInt();
		sc.close();
		double f = (c * 1.8) + 32;
		System.out.printf("%.0f° Celsius é %.1f° Fahrenheit", c,f);
	}
}