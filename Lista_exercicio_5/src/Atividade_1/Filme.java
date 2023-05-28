package Atividade_1;

public class Filme {
	private String nome;
	private char genero;
	
	
	public Filme(String nome, char genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}


	public Filme() {
		super();
		this.nome = "";
		this.genero = ' ';
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	
}
