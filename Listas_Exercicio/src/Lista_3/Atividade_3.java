package Lista_3;

import java.util.Scanner;

public class Atividade_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		int media = 0;
		int cont = 0;

		while (numero != -1) {
			System.out.print("digite um numero para parar digite -1: ");
			numero = sc.nextInt();
			cont = cont + 1;
			if (numero != -1) {

				soma = soma + numero;

			}
		}
		media = soma / (cont - 1);
		System.out.println("a media dos numeros foi " + media);
		sc.close();
	}
		
}
