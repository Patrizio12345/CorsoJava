package srl.neotech.academy.java08;

import java.util.Scanner;

public class StringaAlContrario {

	public static void main(String[] args) {
		//chiedere stringa a utente, restituire stringa al contrario

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.print("Inserire Stringa:");
		String s=scanner.next();
		System.out.println(s);
		StringBuilder str=new StringBuilder(s);
		s=str.reverse().toString();
		System.out.println(s);

	}
}
