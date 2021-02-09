
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente joao = new Gerente();
		
		joao.setNome("João das Couves");
		joao.setCpf("14");
		joao.setSalario(254000);
		
		System.out.println("Bonificação de " + joao.getNome() + " será de " + joao.getBonificacao());
	}

}
