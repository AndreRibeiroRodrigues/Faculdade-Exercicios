package Lista_4;

import java.util.Scanner;

public class Atividade_3 {
	public static void main(String[] args) {
		int vet[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Iniciando o programa");
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite o %dº numero: ", (i + 1));
			vet[i] = sc.nextInt();
		}
		System.out.println(maior(vet));
		sc.close();
	}

	static public int maior(int vet[]) {
		int maior = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == maior) {
				maior = vet[i];
			} else if (vet[i] > maior) {
				maior = vet[i];
			}
		}
		return maior;
	}
}
