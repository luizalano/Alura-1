
public class SistemaInterno {
	
	private int senha = 123456;
	
	public void autentica (Autenticavel g) {
		boolean autenticou = g.autentica(senha);
		
		if (autenticou) {
			System.out.println("Autenticado");
		}
		else System.out.println("Desautenticado");
	}
}
