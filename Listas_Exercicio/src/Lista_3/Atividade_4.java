package Lista_3;
/*
 * 4) Faça um algoritmo para somar os restos da divisão por 3 de 200 números inteiros.
 */
public class Atividade_4 {
	public static void main(String[] args) {
		int resto, soma = 0, num;
		
		for(num=0; num<=200; num++) {
			resto = num % 3;
			soma = soma + ((num+1)%3);
			System.out.println("o resto é " + resto + " e a soma é " + soma);
		}
		
	}

}
