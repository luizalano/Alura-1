public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException("Não abriu. Nananinanão!");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException("Errrrrou!");
    }

	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexao");
	}
}