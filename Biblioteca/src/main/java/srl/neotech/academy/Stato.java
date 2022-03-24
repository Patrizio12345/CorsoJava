package srl.neotech.academy;

import java.util.Random;

public enum Stato {

	
	ATTIVO,
	DISATTIVO,
	SOSPESO,
	BANNATO;
	
	
	public static Stato generateRandomStato() {
		 Stato[]values=Stato.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
	
}
