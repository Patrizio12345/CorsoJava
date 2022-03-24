package srl.neotech.academy.provAstronave;

import java.util.Scanner;

public class Avvio {

	public static void main(String[] args) {

	Astronave interstellar=new Astronave();
	
	
	System.out.println("[Decollo!]");
	
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("[Impostare velocità di decollo]:");
		Integer velocitaDecollo=scan.nextInt();
		interstellar.decolla(velocitaDecollo);
		
		while (velocitaDecollo<0) {
			System.out.println("[ERRORE!!!! IMPOSTARE VALORE POSITIVO]:");
			System.out.println("[Impostare velocità  di decollo]:");
			velocitaDecollo=scan.nextInt();
		}
		
		System.out.println("[Velocità decollo impostata a]:"+velocitaDecollo);
		
		System.out.println("[Digitare n° di manovre]:");
		Integer numeroManovre=scan.nextInt();
		
		
		for(int i=0;i<numeroManovre;i++) {
			System.out.println("[A per accellerare; D per decellerare]:");
				String manovra=scan.next();
				
				while(!(manovra.equals("A")||manovra.equals("D"))) {
					System.out.println("[ERRORE!!!! IMPOSTARE A o D ]:");
					System.out.println("[Impostare velocità manovra]:");
					 manovra=scan.next();
			}
				
				System.out.println("[Impostare velocità manovra]:");
				int velocitaDaImpostare=scan.nextInt();
				
				while (velocitaDaImpostare<0) {
					System.out.println("[ERRORE!!!! IMPOSTARE VALORE POSITIVO]:");
					System.out.println("[Impostare velocità manovra]:");
					 velocitaDaImpostare=scan.nextInt();
				}
				
				
				String risultatoManovra=null;
				
			
				if(manovra.equals("A")) risultatoManovra=interstellar.accelera(velocitaDaImpostare);
				if(manovra.equals("D")) risultatoManovra=interstellar.decellera(velocitaDaImpostare);
				
				System.out.println(risultatoManovra);
			}
	}
	System.out.println("[Velocità finale astronave]:"+interstellar.getVelocita());
	
	}

}
