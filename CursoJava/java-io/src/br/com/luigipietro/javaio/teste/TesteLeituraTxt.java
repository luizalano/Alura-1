package br.com.luigipietro.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class TesteLeituraTxt {

	public static void main(String[] args) {
		String fileNameIn = "C:\\Users\\luiza\\Google Drive\\MonteGrappa\\Dicas de Ferramentas\\Git Hub.txt";
		String fileNameOut = "C:\\tmp\\Git Hub.saida.txt";
		int int1 = 34, int2 = 7665;
		double d1 = 1324564789.654, d2 = 78.33;
		
		//String saida = String.format(Locale.ITALY, "%06d %10.2f %d %010.2f", int1, d1, int2, d2);
		
		System.out.format(new Locale("pt", "br"), "%06d %10.2f %d %010.2f %n", int1, d1, int2, d2);
		
		FileInputStream fileIn = null;
		InputStreamReader isr = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedWriter bw2 = null;
		
		try {
			fileIn = new FileInputStream(fileNameIn);
			isr = new InputStreamReader(fileIn);
			br1 = new BufferedReader(isr);
			br2 = new BufferedReader(new FileReader(fileNameIn));
	
			bw2 = new BufferedWriter(new FileWriter(fileNameOut));
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			String linhaLida = null;
			
			linhaLida  = br1.readLine();
			
			while (linhaLida != null) {
				System.out.println(linhaLida);
				bw2.write(linhaLida);
				bw2.newLine();
				linhaLida = br1.readLine();
			}
			
			bw2.close();
			br1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n---------------------------\n");
		
		

	}

}
