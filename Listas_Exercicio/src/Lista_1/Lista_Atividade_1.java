package Lista_1;

import java.util.Scanner;

public class Lista_Atividade_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite primeiro numero:");
		int n1 = sc.nextInt();
		System.out.println("Digite segudo numero:");
		int n2 = sc.nextInt();
		System.out.println("Digite terceiro numero:");
		int n3 = sc.nextInt();
		media(n1, n2, n3);
		sc.close();
	}

	static void media(int n1, int n2, int n3) {
		double media = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5);
		System.out.printf("A media ponderada é"+ media);
		
	}
	
}
