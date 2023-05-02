package Lista_2;

import java.util.Scanner;

public class Atividade_10 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double n1, n2, n3;

			System.out.println("Digite o primeiro o segundo e o terceiro numero");
			n1 = scan.nextDouble();
			n2 = scan.nextDouble();
			n3 = scan.nextDouble();
			
			if(n1 > n2) {
				System.out.println(n1 + " é o maior");
			}else if (n2 > n3) {
					System.out.println(n2+ " é o maior");
			}else if (n3 > n1) {
						System.out.println(n3 + " é o maior");
					}
				}
			}
		

	}

