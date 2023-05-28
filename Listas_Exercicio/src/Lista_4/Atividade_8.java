package Lista_4;

import java.util.Scanner;

public class Atividade_8 {
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("Digite o valor de comparação: ");
		int valor = sc.nextInt();
		for (int i = 0; i < maior(num, valor).length; i++) {
			System.out.printf("O numero %d e maior que %d",maior(num, valor)[i],valor);
		}
	}

	static int[] maior(int[] num, int set) {
		int[] maior = new int[num.length];
		for(int i=0;i<maior.length;i++) {
			if(maior[i]>set) {
				maior[i]= num[i];
			}
		}
		return maior;
	}

}
