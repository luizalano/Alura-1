package br.com.luigipietro.bytebank.testes;
import br.com.luigipietro.bytebank.modelo.ContaCorrente;
import br.com.luigipietro.bytebank.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 313131);
		cc.deposita(1200);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
		
	}

}
