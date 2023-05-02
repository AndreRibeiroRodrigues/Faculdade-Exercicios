package Lista_1;

import java.util.Scanner;

public class Lista_Atividade_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		double d, dR;
		System.out.println("Informe o plano de X1 e Y1:");
		System.out.print("X1: ");
		x1 = sc.nextInt();
		System.out.print("Y1: ");
		y1 = sc.nextInt();
		System.out.println("Informe o plano de X1 e Y1:");
		System.out.print("X2: ");
		x2 = sc.nextInt();
		System.out.print("Y2: ");
		y2 = sc.nextInt();
		sc.close();

		dR = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);

		d = Math.sqrt(dR);

		System.out.println("A distancia entre x1 y1 e x2 y2 é de " + d);

	}

}
