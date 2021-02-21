package br.com.montegrappa.modelo;

public class Aluno {
	private String nome;
	private String cpf;
	private int numeroMatricula;
	
	public Aluno(String nome, String cpf, int numeroMatricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		
		if (this.getNome() != a.getNome()) return false;
		if (this.getCpf() != a.getCpf()) return false;
		if (this.getNumeroMatricula() != a.getNumeroMatricula()) return false;
		
		return true;
	}
	
	/*
	  Sempre que alterar o mpetodo equals, devemos alterar o mpetodo hashcode,
	  para garantir que a igualdede sepre seja grantida 
	 */
	@Override
	public int hashCode() {
		String palavra = this.getNome() + this.getCpf() + this.getNumeroMatricula();
		return palavra.hashCode();
	}
	
	@Override
	public String toString() {
		return this.nome + ", " + this.cpf + ", " + this.numeroMatricula;
	}
}
