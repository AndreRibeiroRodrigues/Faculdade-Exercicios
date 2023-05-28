package Atividade_2;

import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	static Vendedores vendedores = new Vendedores();
	static Vendedor vendedor = new Vendedor();
	
	public static void main(String[] args) {
		int escolha;
		int escolha2 = 1;

		System.out.println("iniciando o programa");
		do {
			System.out.println("O que deseja fazer");
			System.out.println("[1] Incluir vendedores no arquivo");
			System.out.println("[2] Consultar o total de vendedor de um determinado tipo mercadoria");
			System.out.println("[3] Excluir um vendedor do arquivo procurando pelo nome");
			escolha = sc.nextInt();
			sc.nextLine();

			switch (escolha) {
			case 1:
				inlcuirVendedor();
				System.out.println("Deseja continuar? [1:sim/2:Não]");
				escolha2 = sc.nextInt();
				break;
			case 2:
				totalVendedor();
				System.out.println("Deseja continuar? [1:sim/2:Não]");
				escolha2 = sc.nextInt();
				break;
			case 3:
				excluirVendedor();
				System.out.println("Deseja continuar? [1:sim/2:Não]");
				escolha2 = sc.nextInt();
				break;
			case 4:
				System.out.println("Fim do programa");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while (escolha > 4 || escolha2 == 1);
	}
	static void inlcuirVendedor() {
		System.out.println("Cadastro de vendedor");
		System.out.print("Digite o Codigo do Vendedor:");
		vendedor.setCodigo(sc.nextInt());
		System.out.print("Digite o nome do Vendedor:");
		vendedor.setNome(sc.nextLine());
		sc.nextLine();
		System.out.print("Digite o topo de mercadori que esse vendedor vende:");
		System.out.println("(P – perecível, N – não perecível)");
		vendedor.setTipoMercadoria(sc.nextLine().toUpperCase().charAt(0));
		if(vendedores.cadastro(vendedor)) {
			System.out.println("usuario ja existe");
		}else {
			System.out.println("cadastro reslizado com sucesso");
		}
	}
	static void totalVendedor() {
		System.out.println("Qual tipo de vendedor voce deseja \n (P – perecível, N – não perecível)");
		char tipo = sc.nextLine().toUpperCase().charAt(0);
		if(vendedores.getTotalByTipo(tipo) == 0) {
			System.out.println("Não há vendedores cadastrados com este tipo");
		}else if(vendedores.getTotalByTipo(tipo)== 1){
			System.out.printf("há apenas um vendedor cadastrado com o tipo "+ tipo);			
		}else {
			System.out.printf("há %i vendedores cadastrados com o tipo "+ tipo, vendedores.getTotalByTipo(tipo));
		}
		
	}
	static void excluirVendedor() {
		System.out.print("Digite o nome do venededor que deseja excluir: ");
		String nome = sc.nextLine();		
		if(vendedores.deletByName(nome)) {
			System.out.println("Vendedor deletado com sucesso");
		}else {
			System.err.println("Vendedor não encontrado");
		}
	}
}
