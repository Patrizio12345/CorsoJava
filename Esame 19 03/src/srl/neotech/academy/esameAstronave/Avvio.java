package srl.neotech.academy.esameAstronave;

import java.util.Scanner;

public class Avvio {

	public static void main(String[] args) {
		
		Astronave astronave=new Astronave();
		
	
		
		//chiedere ad utente d'impostare la velocità di decollo
		Scanner scanner=new Scanner(System.in);
		System.out.println("Impostare velocità decollo:");
		Integer s=scanner.nextInt();
	//chiedere quante manovre si vogliono fare
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Digitare n° manovre da effettuare:");
		Integer numeroManovre=scanner1.nextInt();
		//per ogni manovra chiedere se si vuole accelerare o decelerare
		
		for(int i=0;i<numeroManovre;i++) {
			if(numeroManovre.equals(astronave.accelera())) {
				System.out.println("A");
			}else if(numeroManovre.equals(astronave.decelera())) {
				System.out.println("D");
			}
			System.out.println(astronave.accelera()+astronave.getVelocita());
			
		}
		
		
//		System.out.println(astronave.accelera()+"A");
//		//System.out.println(astronave.decelera()+"D");
//		
		
		
		
		
		

	}

}
