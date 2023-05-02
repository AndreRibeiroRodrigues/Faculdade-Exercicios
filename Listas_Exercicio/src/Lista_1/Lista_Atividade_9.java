package Lista_1;
import java.util.Scanner;

public class Lista_Atividade_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
		double ipi = sc.nextDouble();

		System.out.print("Digite o código da peça 1: ");
		String codigo1 = sc.next();
		System.out.print("Digite o valor unitário da peça 1: ");
		double valorUnitario1 = sc.nextDouble();
		System.out.print("Digite a quantidade de peças 1: ");
		int quantidade1 = sc.nextInt();

		System.out.print("Digite o código da peça 2: ");
		String codigo2 = sc.next();
		System.out.print("Digite o valor unitário da peça 2: ");
		double valorUnitario2 = sc.nextDouble();
		System.out.print("Digite a quantidade de peças 2: ");
		int quantidade2 = sc.nextInt();

		double valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100 + 1);

		System.out.printf("O valor total a ser pago é de R$ %.2f%n", valorTotal);

		sc.close();

	}

}
