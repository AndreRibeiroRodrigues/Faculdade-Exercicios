package Atividade_2;

import java.util.ArrayList;
import java.util.List;

public class Vendedores {
	private List<Vendedor> vendedores;

	public Vendedores() {
		super();
		this.vendedores = new ArrayList<>();

	}
	
	public Vendedor getVendedores(int indice) {
		return vendedores.get(indice);
	}


	public void setVendedores (Vendedor vendas) {
		this.vendedores.add(vendas);
	}
	
	public boolean cadastro(Vendedor vendedor) {
		for(int i = 0; i<vendedores.size();i++) {
			if(vendedores.get(i).getCodigo()==vendedor.getCodigo()) {
				return false;				
			}
		}
		return true;
	}

	public int getTotalByTipo(char tipo) {
		int count = 0;
		for (int i = 0; i < this.vendedores.size(); i++) {
			if (this.vendedores.get(i).getTipoMercadoria() == tipo) {
				count++;
			}
		}

		return count;

	}

	public boolean deletByName(String name) {
		for (int i = 0; i < vendedores.size(); i++) {
			if (vendedores.size() == 1 && vendedores.get(i).getNome().toLowerCase().equals(name.toLowerCase())) {
				vendedores.remove(i);
				return true;
			} else {
				if (vendedores.get(i).getNome().equals(name)) {
					vendedores.get(i).setCodigo(vendedores.get(-1).getCodigo());
					vendedores.get(i).setNome(vendedores.get(-1).getNome());
					vendedores.get(i).setTipoMercadoria(vendedores.get(-1).getTipoMercadoria());
					return true;
				}
			}
		}
		return false;
	}

}
