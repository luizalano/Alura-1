
public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(11, 111111);
		cc.deposita(15000);
		
		ContaPoupanca cp = new ContaPoupanca(11, 1212120);
		cp.deposita(25000);
		
		cc.transfere(8000, cp);
		
		System.out.println("Conta corrente " + cc.getAgencia() + " - " + cc.getNumero() + ""
				+ " tem um saldo de " + cc.getSaldo());
		System.out.println("Conta poupança " + cp.getAgencia() + " - " + cp.getNumero() + ""
				+ " tem um saldo de " + cp.getSaldo());

	}

}
