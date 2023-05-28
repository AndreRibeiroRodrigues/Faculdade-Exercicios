package Atividade_3;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
	private List<Aluno> alunos;

	public Alunos() {
		this.alunos = new ArrayList<>();
	}

	private void setAlunos(Aluno aluno) {
		alunos.add(aluno);
	}

	private Aluno getAlunos(int indice) {
		return alunos.get(indice);
	}

	public String InseriAluno(Aluno aluno) {
		for (int i = 0; i < alunos.size(); i++) {
			if (this.getAlunos(i).getMatricula() == aluno.getMatricula()) {
				return "Erro: Matricula já existente";
			}
		}

		this.setAlunos(aluno);
		return "Cadastrado com sucesso";
	}

	public void ConsultaNota(double nota) {
		if (alunos.size() == 0) {
			System.out.println("Não há alunos cadastrados");
		} else {
			System.out.println("Os alunos que esta com as notas abaixo das informadas são:");
			for (int i = 0; i < alunos.size(); i++) {
				if (getAlunos(i).getNota1() < nota || getAlunos(i).getNota2() < nota) {
					getAlunos(i).toString();
				}
			}
		}
	}

	public void CalcularMedia() {
		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf("O aluno %dtem a media de %.2f", getAlunos(i).getNome(), getAlunos(i).media());
		}
	}
}
