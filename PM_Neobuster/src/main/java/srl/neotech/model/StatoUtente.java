package srl.neotech.model;

import java.util.Random;

public enum StatoUtente {

	ATTIVO,
	BANNATO,
	NON_ATTIVO;
	
	
	
	public static StatoUtente generateRandomStato() {
		StatoUtente[]values=StatoUtente.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
	
	
	
	
	
}
