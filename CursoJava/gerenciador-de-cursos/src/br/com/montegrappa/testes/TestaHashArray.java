package br.com.montegrappa.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaHashArray {

	private static long arreiliste(long dimensao) {
		Collection<Integer> numeros = new ArrayList<Integer>();
	
		long inicio = System.currentTimeMillis();
	
		for (int i = 1; i <= dimensao; i++) {
			numeros.add(i);
		}
	
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
	
		long fim = System.currentTimeMillis();
	
		return fim - inicio;
	}

	private static long reshi(long dimensao) {
		Collection<Integer> numeros = new HashSet<Integer>();
	
		long inicio = System.currentTimeMillis();
	
		for (int i = 1; i <= dimensao; i++) {
			numeros.add(i);
		}
	
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
	
		long fim = System.currentTimeMillis();
	
		return fim - inicio;
	}

	
	public static void main(String[] args) {

		long dimensao = 0, tempo1 = 0, tempo2 = 0;
		double perc;
		
		dimensao = 5000;
		tempo1 = arreiliste(dimensao);
		tempo2 = reshi(dimensao);
		perc = (double) tempo2 / (double) tempo1 * 100.0;
		
		System.out.format("%10d -> Array: %10d Hash: %10d  - %2.4f %n", dimensao, tempo1, tempo2, perc);

		dimensao = 50000;
		tempo1 = arreiliste(dimensao);
		tempo2 = reshi(dimensao);
		perc = (double) tempo2 / (double) tempo1 * 100.0;
		
		System.out.format("%10d -> Array: %10d Hash: %10d  - %2.4f %n", dimensao, tempo1, tempo2, perc);

		dimensao = 100000;
		tempo1 = arreiliste(dimensao);
		tempo2 = reshi(dimensao);
		perc = (double) tempo2 / (double) tempo1 * 100.0;
		
		System.out.format("%10d -> Array: %10d Hash: %10d  - %2.4f %n", dimensao, tempo1, tempo2, perc);
	
		dimensao = 200000;
		tempo1 = arreiliste(dimensao);
		tempo2 = reshi(dimensao);
		perc = (double) tempo2 / (double) tempo1 * 100.0;
		
		System.out.format("%10d -> Array: %10d Hash: %10d  - %2.4f %n", dimensao, tempo1, tempo2, perc);
	
		dimensao = 500000;
		tempo1 = arreiliste(dimensao);
		tempo2 = reshi(dimensao);
		perc = (double) tempo2 / (double) tempo1 * 100.0;
		
		System.out.format("%10d -> Array: %10d Hash: %10d  - %2.4f %n", dimensao, tempo1, tempo2, perc);
	
	}

}
