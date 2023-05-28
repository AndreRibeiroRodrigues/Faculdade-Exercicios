package Atividade_1;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Filme filme = new Filme();
	static Filmes filmes = new Filmes();

	public static void main(String[] args) {
		int escolha;
		int escolha2 = 1;

		System.out.println("iniciando o programa");
		do {
			System.out.println("O que deseja fazer");
			System.out.println("[1] Cadastrar um novo filme");
			System.out.println("[2] Consultar o total de filmes de um determinado gênero");
			System.out.println("[3] Excluir um filme");
			escolha = sc.nextInt();
			sc.nextLine();

			switch (escolha) {
			case 1:
				incluirFilme();
				System.out.println("Deseja continuar? [1:sim/2:Não]");
				escolha2 = sc.nextInt();
				break;
			case 2:
				totalFilmes();
				System.out.println("Deseja continuar? [1:sim/2:Não]");
				escolha2 = sc.nextInt();
				break;
			case 3:
				excluirFilme();
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

	static void incluirFilme() {
		System.out.println("informe o nome do filme:");
		filme.setNome(sc.nextLine());
		System.out.println("Informe o genero do filme (A – ação, T – terror, D – drama)");
		filme.setGenero(sc.nextLine().toUpperCase().charAt(0));
		filmes.setFilme(filme);
	}

	static void totalFilmes() {
		char genero;
		System.out.println("Qual genero voce deseja receber o total?");
		System.out.println("Opções \n (A – ação, T – terror, D – drama)");
		System.out.print("Digite: ");
		genero = sc.nextLine().toUpperCase().charAt(0);
			switch(genero) {
			case 'A':
				System.out.printf("há %d filmes do genero Terror", filmes.getTotalByGenero(genero));
				break;
			case 'T':
				System.out.printf("há %d filmes do genero Terror", filmes.getTotalByGenero(genero));
				break;
			case 'D':
				System.out.printf("há %d filmes do genero Terror", filmes.getTotalByGenero(genero));
				break;
			default:
				System.out.println("opção Invelida");
			}
		
		
	}

	static void excluirFilme() {
		String nome;
		System.out.println("Digite o nome do filme que deseja deletar:");
		nome = sc.nextLine();
		
		if(filmes.deletByName(nome)) {
			System.out.println("Filme deletado com sucesso.");
		}else {
			System.out.println("Nao foi possivel deletar.");
		}
	}
}
