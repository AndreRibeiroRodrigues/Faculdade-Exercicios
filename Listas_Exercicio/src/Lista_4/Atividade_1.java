package Lista_4;

import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {
		System.out.println("Iniciando o programa");
		System.out.println("Digite um numero");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(par(num)) {
			System.out.printf("O numero %d é par",num);
		}else {
			System.out.printf("O numero %d é impar",num);
		}

	}
	
	static public boolean par(int num) {
		if(num %2 == 0) {
			return true;
		}
		return false;
	}
}
