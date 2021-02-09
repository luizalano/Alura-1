
public class Gerente extends Funcionario{
	private int senha;
	
	public Gerente() {
		this.senha = 123456;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) return true;
		return false;
	}

	
	public double getBonificacao() {
		return super.salario + 250;
	}
}
