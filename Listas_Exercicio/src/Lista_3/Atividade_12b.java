package Lista_3;

import java.util.Scanner;

public class Atividade_12b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			double altura, media = 0, alturaMaior = 0, somaM = 0;
			String sexo;
			int homem = 0, mulher = 0;

			System.out.println("digite a quantidade de pessoas: ");
			int numero = sc.nextInt();

			for (int i = 0; i <= numero - 1; i++) {
				System.out.println("digite o sexo M/F: ");
				sexo = sc.next();

				while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
					System.out.println("digite o sexo M/F: ");
					sexo = sc.next();
				}

				System.out.println("digite a altura: ");
				altura = sc.nextDouble();

				if (sexo.equalsIgnoreCase("M")) {
					homem = homem + 1;
					if (altura > 1.70) {
						alturaMaior = alturaMaior + 1;

					}

				} else if (sexo.equalsIgnoreCase("F")) {
					mulher = mulher + 1;
					somaM = somaM + altura;
					media = somaM / mulher;
				}

			
			System.out.println("Foram medidos " + homem + " homens" + "e foram medidas " + mulher + " mulheres");

			System.out.println("tem " + alturaMaior + " homens acima de 1.70");
			System.out.println("A media da altura das mulheres é " + media);
		}
	}
}