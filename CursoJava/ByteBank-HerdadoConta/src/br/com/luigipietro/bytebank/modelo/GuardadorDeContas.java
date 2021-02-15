package br.com.luigipietro.bytebank.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int proxmoItem = 0;
	
	public GuardadorDeContas(int dimensao) {
		this.referencias = new Conta[dimensao];
	}
	
	public void addConta(Conta c) {
		this.referencias[this.proxmoItem] = c;
		this.proxmoItem++;
	}
	
	public int getNumElementos() {
		return this.proxmoItem;
	}

	public Conta buscaContaPorAgenciaConta(int ag, int nc) {
		
		for (int i =0; i < this.proxmoItem; i++) {
			if (this.referencias[i].getAgencia() == ag && 
					this.referencias[i].getNumero() == nc) {
				return this.referencias[i]; 
			}
		}
		return null;
	}
}
