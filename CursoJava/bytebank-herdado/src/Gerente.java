
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public Gerente() {
		this.senha = 123456;
	}
	
	
	public double getBonificacao() {
		return super.salario + 250;
	}


	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}


	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) return true;
		return false;
	}
}
