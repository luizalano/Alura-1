package br.com.luigipietro.bytebank.testes;
import br.com.luigipietro.bytebank.modelo.Tributavel;

public class CalculadorDeImposto {
	
	public double totalImposto;
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	public double getTotalImposto() {
		return this.totalImposto ;
	}
}
