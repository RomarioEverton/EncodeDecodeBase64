package br.com.EncodeDecode;

import java.util.Base64;  

public class Base64Example {
	
	public static void main( String[] args )
    {
		String initialString = "test input";
		String encodeString = Base64.getEncoder().encodeToString(initialString.getBytes());
		
		System.out.println(encodeString);
		
		byte[] decodeBytes = Base64.getDecoder().decode(encodeString);
		String decodeString = new String(decodeBytes);
		
		System.out.println(decodeString);
    }
}
