package br.com.luigipietro.javaio.teste;

import java.io.UnsupportedEncodingException;

public class TesteUnicode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "zéâoó";
		System.out.format("%03d %03d %03d %03d %03d %n", str.codePointAt(0), str.codePointAt(1), str.codePointAt(2),
				str.codePointAt(3), str.codePointAt(4));
		
		byte[] bytesW1252 = str.getBytes("windows-1252");
		String strW1252 = new String(bytesW1252, "windows-1252");
		System.out.println(bytesW1252.length + " - " + strW1252);
	
		byte[] bytesUtf16 = str.getBytes("UTF-16");
		String strUtf16 = new String(bytesUtf16, "UTF-16");
		System.out.println(bytesUtf16.length + " - " + strUtf16);
	
		byte[] bytesUtf8 = str.getBytes("UTF-8");
		String strUtf8 = new String(bytesUtf8, "UTF-8");
		System.out.println(bytesUtf8.length + " - " + strUtf8);
	}
	
	

}
