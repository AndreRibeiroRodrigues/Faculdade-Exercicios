package Lista_4;

import java.util.Scanner;

public class Atividade_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Seu primeiro nome é " + primeiroNome(nome));
	}

	static String primeiroNome(String nome) {
		String[] nomeVet = nome.split(" ");
		String primeiroNome = nomeVet[0];
		return primeiroNome;
	}
}
