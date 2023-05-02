package Lista_1;

import java.util.Scanner;

public class Lista_Atividade_8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite un numero:");
	int num = sc.nextInt();
	int ant= num -1;
	int suc = num + 1;
	
	System.out.printf("O antecessor de %d é %d e seu sucessor é %d", num, ant, suc);
	sc.close();
	}
	
}
