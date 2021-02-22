package br.com.montegrappa.testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.montegrappa.modelo.Aluno;
import br.com.montegrappa.modelo.Aula;
import br.com.montegrappa.modelo.Curso;

public class TestaAlunos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
		Curso abobrinhas = new Curso("Aprendendo a falar sem dizer nada", "Qualquer político de qualquer lugar");
		Curso cuoco = new Curso("Cozinha Italiana para brasileiros", "Seu Nono");
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(javaColecoes);
		cursos.add(abobrinhas);
		cursos.add(cuoco);
		
		javaColecoes.setAulas(new Aula("Revisando as ArrayLists", 21));
		javaColecoes.setAulas(new Aula("Listas de Objetos", 15));
		javaColecoes.setAulas(new Aula("Relacionamentos de listas e objetos", 9));
		
		
		abobrinhas.setAulas(new Aula ("Controlando o tom de voz", 8));
		abobrinhas.setAulas(new Aula ("Chingar a mãe com elegância", 12));
		abobrinhas.setAulas(new Aula ("Aprendendo a controlar o tempo", 15));
		abobrinhas.setAulas(new Aula("Mudando de argumento sem que o públco perceba", 25));
		abobrinhas.setAulas(new Aula("Ganhando a discussão sem se posicionar", 88));
		abobrinhas.setAulas(new Aula("Transferindo a Culpa ao Coleguinha", 7));
		
		cuoco.setAulas(new Aula("Aprendendo a cortar cebola", 2));
		cuoco.setAulas(new Aula("Ligando o fogão", 4));
		cuoco.setAulas(new Aula("Qual a panela a usar", 57));
		cuoco.setAulas(new Aula("Queimou o risoto, e agora?", 8));

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
		
		cuoco.matriculaAluno(a16);
		cuoco.matriculaAluno(a5);
		cuoco.matriculaAluno(a8);
		cuoco.matriculaAluno(a12);
		cuoco.matriculaAluno(a9);
		cuoco.matriculaAluno(a6);
		cuoco.matriculaAluno(a14);
		
		
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
		
		
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println(cursos);
		cursos.sort(Comparator.comparing(Curso::getNumAlunos));
		System.out.println("--------------------");
		System.out.println(cursos);
		
		System.out.println("###########################");
		cursos.stream()
			.filter(c -> c.getTempoTotal() > 70)
			.forEach(c -> System.out.println(c.getNome() + " com " + c.getTempoTotal() + " horas!"));
		
		cursos.stream()
			.filter(c -> c.getTempoTotal() > 70)
			.map(c -> c.getNumAlunos())
			.forEach(total -> System.out.println(total));
		
		int soma = cursos.stream()
		.filter(c -> c.getTempoTotal() > 70)
		.mapToInt(Curso::getTempoTotal)
		.sum();
		
		System.out.println("Soma dos tempo de aula resultante do filter: " + soma);

		// Optional por que pode receber un nulo
		Optional<Curso> cursoOpcional = cursos.stream()
		.filter(c -> c.getTempoTotal() > 70)
		.findAny();

		// devole o curso que o filtro anterior devolveu ou nulo, se não recebeu nada
		Curso curso = cursoOpcional.orElse(null);
		System.out.println(curso.getNome());
		

		// Faz a mesma coisa do anterior
		cursos.stream()
		.filter(c -> c.getTempoTotal() > 70)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));

		// Pelo método collect, devolve uma coleção de elementos filtrados
		List<Curso> cursosFiltrados = cursos.stream()
		.filter(c -> c.getTempoTotal() > 70)
		.collect(Collectors.toList());
		
		// Devole um mapa (chave, valor)
		Map<String, Curso> mapaCursos = cursos.stream()
		.filter(c -> c.getTempoTotal() > 70)
		.collect(Collectors.toMap(c -> c.getNome(), c -> c));
		
		System.out.println(mapaCursos);
		
		cursos.stream()
		.filter(c -> c.getTempoTotal() > 70)
		.collect(Collectors.toMap(c -> c.getNome(), c -> c))
		.forEach((nome, c1) -> System.out.println("Chave:" + nome + " valor: " + c1.getTempoTotal()));

	}
}
