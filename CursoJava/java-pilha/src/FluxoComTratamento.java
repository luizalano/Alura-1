
public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
		/*} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Deu pau na matemática " + ae.getMessage());
			ae.printStackTrace();
		/*} catch (NullPointerException npe) {
			// TODO: handle exception
			System.out.println("Deu pau nos nulo " + npe.toString());
			npe.printStackTrace();*/
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Deu pau geral " + e.toString());
			e.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            i = i / 0;
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}