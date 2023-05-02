package Lista_1;

import java.util.Scanner;

public class equação_2grau {

	public static void main() {

		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o valor de A");
		a = sc.nextInt();
		System.out.println("informe o valor de B");
		b = sc.nextInt();
		System.out.println("informe o valor de C");
		c = sc.nextInt();

		double delta = (Math.pow(b, 2)) - (4 * a * c);
		if(delta > 0) {
			double x1 = b + (Math.sqrt(delta)) / (2 * a);
			double x2 = b - (Math.sqrt(delta) )/ (2 * a);

			System.out.printf("O valor de x1 é %.2f e x2 é %.2f", x1, x2);
		}else if(delta == 0) {
			double x1 = b + (Math.sqrt(delta)) / (2 * a);
			double x2 = b - (Math.sqrt(delta) )/ (2 * a);

			System.out.printf("O valor de x1 é %.2f e x2 é %.2f", x1, x2);
		}else {
			System.out.println("Não tem raiz");
		}
		
		sc.close();
	}

}
