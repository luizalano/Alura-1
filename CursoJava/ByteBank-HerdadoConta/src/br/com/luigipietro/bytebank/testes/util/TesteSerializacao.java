package br.com.luigipietro.bytebank.testes.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.luigipietro.bytebank.modelo.Cliente;
import br.com.luigipietro.bytebank.modelo.ContaCorrente;

public class TesteSerializacao {

	private static void serializa() throws FileNotFoundException, IOException { 
		Cliente cliente = new Cliente();
		cliente.setNome("Luiz Alberto Alano");
		cliente.setProfissao("Engenheiro do ócio");
		cliente.setCpf("55.666.777.88");
		
		ContaCorrente cc = new ContaCorrente(222, 333333);
		cc.deposita(45000.65);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\tmp\\cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}
	
	private static void deSerializa() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\tmp\\cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(cc.toString());
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		serializa();
		deSerializa();
		
	}
	
}
