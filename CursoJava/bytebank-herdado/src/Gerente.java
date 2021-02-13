
public class Gerente extends Funcionario implements Autenticavel {
	
	AutenticaTools autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaTools();
		this.autenticador.setSenha(123456);
	}	
	
	public double getBonificacao() {
		return super.salario + 250;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}


	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
