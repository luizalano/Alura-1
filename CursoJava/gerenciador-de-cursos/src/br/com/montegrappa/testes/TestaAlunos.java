package br.com.montegrappa.testes;

import br.com.montegrappa.modelo.Aluno;
import br.com.montegrappa.modelo.Aula;
import br.com.montegrappa.modelo.Curso;

public class TestaAlunos {

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

		Aluno a1 = new Aluno("Joãozinho", "111.222.333'444-55", 1);
		Aluno a2 = new Aluno("Pedrinho", null, 2);
		Aluno a3 = new Aluno("Mariazinha", null, 3);
		Aluno a4 = new Aluno("Luizinho", null, 4);
		Aluno a5 = new Aluno("Zezinho", null, 5);
		Aluno a6 = new Aluno("Jorgete", null, 6);
		Aluno a7 = new Aluno("Mariana", null, 7);
		Aluno a8 = new Aluno("Claudinha", null, 8);
		Aluno a9 = new Aluno("Huguinho", null, 9);
		Aluno a10 = new Aluno("Sergão", null, 10);
		Aluno a11 = new Aluno("Joãozinho", null, 11);
		Aluno a12 = new Aluno("Afonso", null, 12);
		Aluno a13 = new Aluno("Sebastiana", null, 13);
		Aluno a14 = new Aluno("Cristianny", null, 14);
		Aluno a15 = new Aluno("Hellenn", null, 15);
		Aluno a16 = new Aluno("Dannielly Colla", null, 16);
		Aluno a111 = new Aluno("Joãozinho", "111.222.333'444-55", 1);
		Aluno a1111 = new Aluno("Joãozinho", "1111.222.333'444-55", 1);
		
		javaColecoes.matriculaAluno(a1);
		javaColecoes.matriculaAluno(a2);
		javaColecoes.matriculaAluno(a3);
		javaColecoes.matriculaAluno(a4);
		javaColecoes.matriculaAluno(a5);
		javaColecoes.matriculaAluno(a6);
		
		abobrinhas.matriculaAluno(a16);
		abobrinhas.matriculaAluno(a1);
		abobrinhas.matriculaAluno(a10);
		abobrinhas.matriculaAluno(a11);
		abobrinhas.matriculaAluno(a4);
		
		System.out.println(javaColecoes);
		System.out.println("--------------------");
		System.out.println(abobrinhas);
		
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		System.out.println("O aluno " + a1.getNome() + " está? -> " + javaColecoes.ehAluno(a1));
		System.out.println("O aluno " + a111.getNome() + " está? -> " + javaColecoes.ehAluno(a111));
		System.out.println("O aluno " + a16.getNome() + " está? -> " + javaColecoes.ehAluno(a16));
		
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		System.out.println("O auno " + a1 + " é igual ao " + a11 + "? -> " + a1.equals(a11));
		System.out.println("O auno " + a1 + " é igual ao " + a111 + "? -> " + a1.equals(a111));
		System.out.println("O auno " + a1 + " é igual ao " + a1111 + "? -> " + a1.equals(a1111));
	}

}
