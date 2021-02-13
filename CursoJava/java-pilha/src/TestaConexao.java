
public class TestaConexao {

	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		
		//
		//    Antes do java 1.7 deveria ser como  está abaixo.
		//
//		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			if (con != null) {
//				con.close();
//			}
//		}

	}

}
