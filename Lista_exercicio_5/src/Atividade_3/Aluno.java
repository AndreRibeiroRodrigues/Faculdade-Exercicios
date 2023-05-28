package Atividade_3;

import java.util.Random;

public class Aluno {

	Random rand = new Random();

	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;

	public Aluno() {
		this.matricula = 0;
		this.nome = "";
		this.nota1 = 0;
		this.nota2 = 0;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double media() {
		return (this.nota1+this.nota2)/2;
	}
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}

}
