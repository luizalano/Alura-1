package br.com.luigipietro.bytebank.testes;
import br.com.luigipietro.bytebank.modelo.ContaCorrente;
import br.com.luigipietro.bytebank.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(11, 111111);
		
		String nome = "Alano";
		nome = "Luiz";
		System.out.println(nome);
		
		try {
			cc.saca(4000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		cc.deposita(15000);

		ContaPoupanca cp = new ContaPoupanca(11, 1212120);
		cp.deposita(25000);
		
		try {
			cc.transfere(80000, cp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println("Conta corrente " + cc.getAgencia() + " - " + cc.getNumero() + ""
				+ " tem um saldo de " + cc.getSaldo());
		System.out.println("Conta poupança " + cp.getAgencia() + " - " + cp.getNumero() + ""
				+ " tem um saldo de " + cp.getSaldo());

	}

}
