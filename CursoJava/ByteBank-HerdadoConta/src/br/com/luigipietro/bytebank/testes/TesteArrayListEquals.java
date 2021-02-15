package br.com.luigipietro.bytebank.testes;

import java.util.ArrayList;

import br.com.luigipietro.bytebank.modelo.Conta;
import br.com.luigipietro.bytebank.modelo.ContaCorrente;
import br.com.luigipietro.bytebank.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(11, 111111);
		ContaCorrente cc2 = new ContaCorrente(22, 222222);
		ContaCorrente cc3 = new ContaCorrente(33, 333333);
		ContaPoupanca cp1 = new ContaPoupanca(111, 1111110);
		ContaPoupanca cp2 = new ContaPoupanca(222, 2222220);
		ContaPoupanca cp3 = new ContaPoupanca(333, 3333330);

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cp1);
		lista.add(cp2);
		lista.add(cp2);
		
		System.out.println(lista.get(0).toString());
		System.out.println(lista.get(5).toString());
		
		System.out.println(lista.contains(cp3));
		
		
		
		for (Object o : lista){
			System.out.println(o);
		}
		
		lista.forEach((o) -> System.out.println(o.equals(cp2)));
	}

}
