import java.time.DateTimeException;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			// TODO: handle exception
			System.out.println("Deu pau nos nulo ou nas matemática " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Deu pau geral " + e.getMessage());
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
        
        //ArithmeticException e = new ArithmeticException(null);
        //DateTimeException e = new DateTimeException("Erro de essessão!");
        
        int i = 0;
        if (i ==0) throw new MinhaExcecao("Erro de essessão!");
        
        
        System.out.println("Fim do metodo2");
    }
}