package br.com.luigipietro.bytebank.testes;

import br.com.luigipietro.bytebank.modelo.ContaCorrente;
import br.com.luigipietro.bytebank.modelo.ContaPoupanca;
import br.com.luigipietro.bytebank.modelo.SaldoInsuficienteException;

public class Teste {

	public static void main(String[] args) {
		System.out.println();

		ContaCorrente cc = new ContaCorrente(15, 2555);
		cc.deposita(50000);
		
		ContaPoupanca cp = new ContaPoupanca(222, 288888);
		try {
			cc.transfere(2500, cp);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
	}
	
}
