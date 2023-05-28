package Lista_4;

import java.util.Scanner;

public class Atividade_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Digite o primeiro numero:");
		int num = sc.nextInt();
		System.out.print("Digite o segundo numero:");
		int num2 = sc.nextInt();
		System.out.println(mdc(num, num2));
		
	}
	public static int mdc(int a, int b) {
	    if (b == 0) {
	        return a;
	    } else {
	        return mdc(b, a % b);
	    }
	}
}
