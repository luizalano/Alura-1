package br.com.luigipietro.bytebank.testes.util;

import java.util.ArrayList;
import java.util.List;


public class Teste001 {

	public static void main(String[] args) {
		
		/*
		 * Integer � uma classe constru�da apenas para permitir Autoboxing
		 * Para criar um objeto, n�o se usa new(), mas valueOf
		 */
		Integer idadeRef = Integer.valueOf(29);
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(idadeRef);
		// Quanto add um int (tipo primitivo) o compilador faz um Autoboxing
		numeros.add(45);

	}

}
