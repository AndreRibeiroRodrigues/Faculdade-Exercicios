package Lista_2;

import java.util.Scanner;

public class Atividade_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try (Scanner entrada = new Scanner(System.in)) {
			int idade;
			String sexo;
			
			System.out.println ("Qual a sua idade?");
			idade = entrada.nextInt();
			
			System.out.println ("Qual seu sexo?");
			sexo = entrada.next();
			
			if (sexo.equals("M") && idade >= 21) {
				System.out.println ("Seu sexo é masculino e você é maior de idade.");
				
			}else if (sexo.equals("F") && idade >= 18) {
				System.out.println ("Seu sexo é feminino e você é maior de idade.");
			
			}
			else if (sexo.equals("F")&& idade <= 18) {
				System.out.println ("Seu sexo é feminino e você é menor de idade");
			}
				
			else if (sexo.equals("M") && idade <= 21) {
				System.out.println ("Seu sexo é masculino e você é menor de idade");
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		

	}

}
