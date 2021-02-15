package br.com.luigipietro.bytebank.testes;

import br.com.luigipietro.bytebank.modelo.Conta;
import br.com.luigipietro.bytebank.modelo.ContaCorrente;
import br.com.luigipietro.bytebank.modelo.ContaPoupanca;
import br.com.luigipietro.bytebank.modelo.GuardadorDeContas;

public class TesteClasseContainer {

	public static void main(String[] args) {
		GuardadorDeContas gc = new GuardadorDeContas(10); 
		
		ContaCorrente cc1 = new ContaCorrente(11, 111111);
		ContaCorrente cc2 = new ContaCorrente(22, 222222);
		ContaCorrente cc3 = new ContaCorrente(33, 333333);
		ContaPoupanca cp1 = new ContaPoupanca(111, 1111110);
		ContaPoupanca cp2 = new ContaPoupanca(222, 2222220);
		ContaPoupanca cp3 = new ContaPoupanca(333, 3333330);
		gc.addConta (cc1);
		gc.addConta (cc3);
		gc.addConta (cp1);
		gc.addConta (cp2);
		gc.addConta (cp3);
		gc.addConta (cc2);
		
		System.out.println(gc.getNumElementos() + " contas guardadas");
		
		Conta ref = gc.buscaContaPorAgenciaConta (33, 333333);
		System.out.println(ref.toString());

		ref = gc.buscaContaPorAgenciaConta (222, 2222220);
		System.out.println(ref.toString());
	}

}
