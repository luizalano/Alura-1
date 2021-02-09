
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Administrador adm = new Administrador();
		//g.setSenha(12);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);

	}
}

