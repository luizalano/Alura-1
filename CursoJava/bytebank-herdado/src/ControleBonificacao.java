
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario g) {
		this.soma += g.getBonificacao();
	}
	
	public double getSoma() {
		return this.soma;
	}
}
