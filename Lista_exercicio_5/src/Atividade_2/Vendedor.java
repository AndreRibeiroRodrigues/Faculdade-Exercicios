package Atividade_2;

public class Vendedor {
	private int codigo;
	private String nome;
	private char tipoMercadoria;
	
	public Vendedor() {
		this.codigo = 0;
		this.nome = " ";
		this.tipoMercadoria= ' ';
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(char tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}

}
