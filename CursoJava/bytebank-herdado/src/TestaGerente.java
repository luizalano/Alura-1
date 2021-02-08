
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente pedro = new Gerente();
		pedro.setNome("Pedro de Alcantara");
		pedro.setSalario(15000);

		Gerente paulo = new Gerente();
		paulo.setNome("Paulo de Alcantara");
		paulo.setSalario(25000);

		EditorVideo wesley = new EditorVideo();
		wesley.setNome("Wesley de Alcantara");
		wesley.setSalario(4000);

		Funcionario joao = new Funcionario();
		joao.setNome("João das Couves");
		joao.setCpf("14");
		joao.setSalario(2000);
		

		if (!pedro.autentica(123456)) System.out.println("Senha do " + pedro.getNome() + " não é essa!");
		else System.out.println("Senha do " + pedro.getNome() + " está correta!");
		
		System.out.println("A bonificacao do " + pedro.getNome() + " é " + pedro.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(pedro);
		System.out.println("A bonificacao é " + controle.getSoma());
		
		controle.registra(paulo);
		System.out.println("A bonificacao é " + controle.getSoma());

		controle.registra(wesley);
		System.out.println("A bonificacao é " + controle.getSoma());

		controle.registra(joao);
		System.out.println("A bonificacao é " + controle.getSoma());
	}

}
