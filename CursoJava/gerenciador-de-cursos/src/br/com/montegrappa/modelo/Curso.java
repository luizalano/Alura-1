package br.com.montegrappa.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List <Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> alunoMatriculado = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	public void setAulas(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tt = 0;
		
		for (Aula aula : aulas) {
			tt += aula.getTempo();
		}
		
		return tt;
	}
	
	public int getNumAlunos() {
		return alunos.size();
	}
	
	@Override
	public String toString() {
		String retorno = "Curso " + this.getNome() + " com " + this.getTempoTotal() + " horas de duração.\n";
		
		for (Aula aula : aulas) {
			retorno += aula.getTitulo() + " com " + aula.getTempo() + "horas\n";
		}
		if (alunos.size() >0) retorno += "Alunos matriculados:\n";
		for (Aluno aluno : alunos) {
			retorno += aluno.getNome() + "\n";
		}
		
		return retorno;
	}

	public void matriculaAluno(Aluno aluno) {
		this.alunos.add(aluno);
		this.alunoMatriculado.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean ehAluno(Aluno a1) {
		return this.alunos.contains(a1);
	}
	
	public Aluno alunoPorMatricula(int matricula) {
		// Antes de implementar o mapa:
		//for (Aluno aluno : alunos) {
		//	if (aluno.getNumeroMatricula() == matricula) return aluno;
		//}
		//throw new NoSuchElementException("Não existe aluno com a matrícula " + matricula + "!");
		//
		// Depois de implementar o mapa:
		return this.alunoMatriculado.get(matricula);
	}
}
