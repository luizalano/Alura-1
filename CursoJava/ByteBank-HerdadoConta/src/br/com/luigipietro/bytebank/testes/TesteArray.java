package br.com.luigipietro.bytebank.testes;

import br.com.luigipietro.bytebank.modelo.Conta;
import br.com.luigipietro.bytebank.modelo.ContaCorrente;
import br.com.luigipietro.bytebank.modelo.ContaPoupanca;
import br.com.luigipietro.bytebank.modelo.SaldoInsuficienteException;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dimensao = 5;
		
		Conta [] contas = new Conta[dimensao];
		int[] idades = new int [dimensao];
		
		ContaCorrente c1 = new ContaCorrente(11, 111111);
		ContaCorrente c2 = new ContaCorrente(22, 222222);
		ContaCorrente c3 = new ContaCorrente(33, 333333);
		ContaPoupanca cp1 = new ContaPoupanca(44, 444444);
		ContaPoupanca cp2 = new ContaPoupanca(55, 555555);
		
		contas [0] = c1;
		contas [1] = c2;
		contas [2] = c3;
		contas [3] = cp1;
		contas [4] = cp2;
		
		for (int i = 0; i < dimensao; i++) {
			idades[i] = (int)(Math.random()*(91));
		}
		
		c1.deposita(100);
		System.out.println(c1.toString());
		
		contas[0].deposita(4000);
		System.out.println(c1.toString());
		
		try {
			contas[0].transfere(2000, cp2);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(contas[0].toString());
		System.out.println(contas[4].toString());
		
	}

}
