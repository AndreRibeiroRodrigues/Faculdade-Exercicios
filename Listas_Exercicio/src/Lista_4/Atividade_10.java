package Lista_4;

import java.util.Scanner;

public class Atividade_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Digite um numero:");
		int num = sc.nextInt();
		if(ePrimo(num)) {
			System.out.printf("O numero %d é primo",ePrimo(num));
		}else {
			System.out.printf("O numero %d não é primo",ePrimo(num));
		}
	}
	static boolean ePrimo(int numero) {
	    for ( int j = 2; j < numero; j++) {
	        if (numero % j == 0 ) return false;
	    }
	    return true ;
	}
}
