
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		
		joao.setNome("Jo�o das Couves");
		joao.setCpf("14");
		joao.setSalario(254000);
		
		System.out.println("Bonifica��o de " + joao.getNome() + " ser� de " + joao.getBonificacao());
	}

}
