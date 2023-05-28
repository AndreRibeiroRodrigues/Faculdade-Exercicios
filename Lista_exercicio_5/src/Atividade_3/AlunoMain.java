package Atividade_3;

import java.util.Scanner;

public class AlunoMain {
	static Alunos alunos = new Alunos();
	static Aluno aluno = new Aluno();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int escolha;
		do {
			System.out.println("Iniciando prorama");

			System.out.println("[1] Incluir dados:");
			System.out.println("[2] Consultar o nome de todos os alunos pela nota:");
			System.out.println("[3] Calcular e mostrar a média aritmética e o nome de cada alunos cadastrados");
			System.out.println("O que deseja fazer:");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				incluirAluno();
				escolha = 5;
				break;
			case 2:
				BuscarAlunoByNota();
				escolha = 5;
				break;
			case 3:
				calcularMedia();
				escolha = 5;
				break;
			case 4:
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("Opção Invalida");
				escolha = 5;
				break;
			}
		} while (escolha == 4 || escolha > 4);
	}

	static void incluirAluno() {
		System.out.println("Iniciando inclusão de aluno.");
		System.out.println("Digite a matricula do aluno:");
		aluno.setMatricula(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite o nome do aluno:");
		aluno.setNome(sc.nextLine());
		System.out.println("Digite a primeira nota do aluno:");
		aluno.setNota1(sc.nextDouble());
		System.out.println("Digite a segunda nota do aluno:");
		aluno.setNota2(sc.nextDouble());
		System.out.println(alunos.InseriAluno(aluno));;

	}

	static void BuscarAlunoByNota() {
		System.out.println("Iniciando busca por nota");
		System.out.print("digite o valor minimo da nota: ");
		alunos.ConsultaNota(sc.nextDouble());
	}

	static void calcularMedia() {

	}
}
