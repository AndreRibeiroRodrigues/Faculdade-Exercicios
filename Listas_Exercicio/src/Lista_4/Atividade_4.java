package Lista_4;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = sc.next();

		System.out.printf("A palavra tem %d vogais", contarStrint(palavra));
	}

	static int contarStrint(String pav) {
		int count = 0;
		char[] letras = pav.toCharArray();
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == 'a') {
				count++;
			} else if (letras[i] == 'e') {
				count++;
			} else if (letras[i] == 'i') {
				count++;
			} else if (letras[i] == 'o') {
				count++;
			} else if (letras[i] == 'u') {
				count++;
			}
		}
		return count;
	}
}
