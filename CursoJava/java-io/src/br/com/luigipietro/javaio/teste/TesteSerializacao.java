package br.com.luigipietro.javaio.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.luigipietro.bytebank.modelo.Cliente;

public class TesteSerializacao {

	private static void testaString() throws FileNotFoundException, IOException, ClassNotFoundException {
		String nome = "Luiz Alberto Alano";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\tmp\\objeto.bin"));
		oos.writeObject(nome);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\tmp\\objeto.bin"));
		String nomeIn = (String)  ois.readObject();
		System.out.println(nomeIn);
		ois.close();
	}
	
	private static void testaCliente() throws FileNotFoundException, IOException, ClassNotFoundException {
		Cliente cliente = new Cliente();
		cliente.setNome("Alano");
		cliente.setProfissao("Picareta de qualquer coisa");
		cliente.setCpf("555.666.666-99");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\tmp\\cliente.bin"));
		/*
		 * Um objeto para ser serializado, precisa herdar a interface Serializable na classe
		 * Não precisa implementar nada, o declarar -> implements Serializable
		 */
		oos.writeObject(cliente);
		oos.close();
				
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\tmp\\cliente.bin"));
		Cliente clienteIn = (Cliente)  ois.readObject();
		System.out.println(clienteIn.toString());
		ois.close();

	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		//testaString();
		testaCliente();
		
	}

}
