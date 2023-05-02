package Lista_3;

import java.util.Scanner;

public class Atividade_12 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int v, Ho = 0, mu = 0, HomensAcimaDe170 = 0;
			String sexo;
			double altura, soma = 0, media;

			System.out.println("Digite A quantidade de vezer que será ");
			v = sc.nextInt();
			for (int i = 0; i <= v - 1; i++) {

				System.out.println("Qual o sexo da pessoa? ");
				sexo = sc.next();
				System.out.println("qual é a altura da pessoa? ");
				altura = sc.nextDouble();

				if (sexo.equalsIgnoreCase("m")) {
					Ho++;
				}  else if (sexo.equalsIgnoreCase("m") && altura >= 1.70) {
					HomensAcimaDe170++;

				}else {
					mu++;
					soma = soma + altura;

				}
			}
		

		media = soma / mu;
		System.out.println("Foram digitados " + mu + " Molheres e " + Ho + " Homens.");
		System.out.println("Foram digitados " + HomensAcimaDe170 + "acima de 1,70");
		System.out.println("A media da altura das molheres é " + media);
		}
	}
}
