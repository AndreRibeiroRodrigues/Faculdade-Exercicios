package Atividade_1;

import java.util.ArrayList;
import java.util.List;

public class Filmes {
	private List<Filme> filmes;

	public Filmes() {
		super();
		this.filmes = new ArrayList<>();

	}

	public Filme getVetor(int indice) {
		return this.filmes.get(indice);
	}

	public void setFilme(Filme novo) {
		this.filmes.add(novo);
	}

	public int getTotalByGenero(char genero) {
		int count = 0;
		for (int i = 0; i < this.filmes.size(); i++) {
			if (this.filmes.get(i).getGenero() == genero) {
				count++;
			}
		}

		return count;

	}

	public boolean deletByName(String name) {
		for (int i = 0; i < filmes.size(); i++) {
			if (filmes.size() == 1 && filmes.get(i).getNome().equals(name)) {
				filmes.remove(i);
				return true;
			} else {
				if (filmes.get(i).getNome().equals(name)) {
					filmes.get(i).setNome(filmes.get(-1).getNome());
					filmes.get(i).setGenero(filmes.get(-1).getGenero());
					return true;
				}
			}
		}
		return false;
	}

}
