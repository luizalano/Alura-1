package br.com.montegrappa.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.montegrappa.modelo.Aula;

public class TestaListaAulas {

	public static void main(String[] args) {
		ArrayList <Aula> aulas = new ArrayList <>();
		
		Aula a1 = new Aula("Revisando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de Objetos", 15);
		Aula a3 = new Aula("Relacionamentos de listas e objetos", 9);
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);

		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));

	}

}
