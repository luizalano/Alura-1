package br.com.montegrappa.modelo;

public class Aula implements Comparable<Aula> {
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		
		return (this.getTitulo() + " com " + this.getTempo() + " minutos");
	}

	@Override
	public int compareTo(Aula outra) {
		
		return this.getTitulo().compareTo(outra.getTitulo());
	}
	

}
