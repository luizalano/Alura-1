import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> coisas = new ArrayList<>();
		
		coisas.add("Luiz Alberto Alano");
		coisas.add("Bundãozinho");
		coisas.add("Bundaozinho");
		coisas.add("Qualquer coisa serve");
		
		System.out.println(coisas);
		
		// Primeira opção de sort, com classe anônima
		coisas.sort(new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        if(s1.length() < s2.length()) return -1;
		        if(s1.length() > s2.length()) return 1;
		        return 0;
		    }
			
		});
		
		// Segunda opção, com lambda
		coisas.sort((s1, s2) -> {
		        if(s1.length() < s2.length()) return -1;
		        if(s1.length() > s2.length()) return 1;
		        return 0;
		});
		
		// Terceira opção
		coisas.sort(Comparator.comparing(s -> s.length()));
		
		System.out.println("---------------------------------------");
		System.out.println(coisas);

		System.out.println("---------------------------------------");
		
		coisas.forEach(coisa ->  System.out.println(coisa));
	}

}

class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
}
