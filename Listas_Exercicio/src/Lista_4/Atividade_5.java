package Lista_4;

import java.util.Scanner;

public class Atividade_5 {
	public static void main(String[] args) {
		System.out.println("Iniciando o sistema");
		int[] valores = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10;i++) {
			System.out.printf("Digite o %dº valor:", (i+1));
			valores[i] = sc.nextInt();
		}
		for(int i =0;i < par(valores).length;i++) {
			System.out.printf("o valor %d do indice %d é par \n", par(valores)[i], i);
		}
		
	}

	public static int[] par(int[] vet) {
		int pares[] = new int[10];
		int count = 0;
		for(int i=0;i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				pares[count] = vet[i];
				count++;
			}
		}
		return pares;
	}
}
