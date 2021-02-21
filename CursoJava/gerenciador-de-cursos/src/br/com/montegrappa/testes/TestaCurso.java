package br.com.montegrappa.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.montegrappa.modelo.Aula;
import br.com.montegrappa.modelo.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
		Curso abobrinhas = new Curso("Aprendendo a falar sem dizer nada", "Qualquer político de qualquer lugar");
		
		javaColecoes.setAulas(new Aula("Revisando as ArrayLists", 21));
		javaColecoes.setAulas(new Aula("Listas de Objetos", 15));
		javaColecoes.setAulas(new Aula("Relacionamentos de listas e objetos", 9));
		
		
		abobrinhas.setAulas(new Aula ("Controlando o tom de voz", 8));
		abobrinhas.setAulas(new Aula ("Chingar a mãe com elegância", 12));
		abobrinhas.setAulas(new Aula ("Aprendendo a controlar o tempo", 15));
		abobrinhas.setAulas(new Aula("Mudando de argumento sem que o públco perceba", 25));
		abobrinhas.setAulas(new Aula("Ganhando a discussão sem se posicionar", 88));
		abobrinhas.setAulas(new Aula("Transferindo a Culpa ao Coleguinha", 7));
		/*
		
		Desta maneira (abaixo), a lisa recebe o endereço da lista do objeto.
		Assim as alterações na lista acarretam em alteraçoes ns lista do objeto
		
		Para resolver, a classe Curso deve devolver um objeto imutável.
		
		List<Aula> aulasColecoes = javaColecoes.getAulas();
		List<Aula> aulasAbobrinhas = abobrinhas.getAulas();
		
		aulasColecoes.add(new Aula("Revisando as ArrayLists", 21));
		aulasColecoes.add(new Aula("Listas de Objetos", 15));
		aulasColecoes.add(new Aula("Relacionamentos de listas e objetos", 9));

		aulasAbobrinhas.add(new Aula("Controlando o tom de voz", 8));
		aulasAbobrinhas.add(new Aula("Chingar a mãe com elegância", 12));
		aulasAbobrinhas.add(new Aula("Aprendendo a controlar o tempo", 15));
		aulasAbobrinhas.add(new Aula("Mudando de argumento sem que o públco perceba", 25));
		aulasAbobrinhas.add(new Aula("Ganhando a discussão sem se posicionar", 88));
		aulasAbobrinhas.add(new Aula("Transferindo a Culpa ao Coleguinha", 7));
		*/
		System.out.println(javaColecoes.getNome());
		javaColecoes.getAulas().forEach(aula ->{
			System.out.println(aula);
		});
		System.out.println(javaColecoes);
		
		// Recebe a refeência para a listo do objeto, mas não consegue mudar nada
		List <Aula> aulasImutaveis = javaColecoes.getAulas();
		
		// A linha abaixo cria uma lista recebendo os valores da listo do objeto
		List <Aula> aulas = new ArrayList<>(javaColecoes.getAulas());
		
		System.out.println("-------------------------");
		System.out.println("jacaColections Ordenado com total de " + javaColecoes.getTempoTotal() + " horas");
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("-------------------------");
		
		System.out.println(abobrinhas.getNome());
		abobrinhas.getAulas().forEach(aula ->{
			System.out.println(aula);
		});
	}

}
