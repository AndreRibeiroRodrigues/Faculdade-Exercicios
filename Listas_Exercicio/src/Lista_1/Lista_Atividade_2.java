package Lista_1;

import java.util.Scanner;

public class Lista_Atividade_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a contagem da velocimetro no Inicio da viagem:");
		double kmI = sc.nextInt();
		System.out.println("Informe a contagem da velocimetro no Fim da viagem:");
		double kmF = sc.nextInt();
		System.out.println("Digite o quanto de gasolina comprou:");
		int gasolina = sc.nextInt();
		System.out.printf("Voce andou %f km \n", kilometragem(kmI, kmF));
		System.out.printf("Voce gastou %f litros de gasolina por KM rodado", gasosa(kilometragem(kmI, kmF), gasolina));
		sc.close();
		System.out.println();

	}

	static double kilometragem(double kmI, double kmF) {
		double km = kmF - kmI;
		return km;
	}

	static double gasosa(double km, int gasolina) {
		double LPkm = gasolina/km;
		return LPkm;
	}
}
