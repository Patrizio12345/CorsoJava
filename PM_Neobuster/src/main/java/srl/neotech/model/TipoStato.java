package srl.neotech.model;

import java.util.Random;

public enum TipoStato {

	PUBBLICATO,
	NON_DISPONIBILE,
	ESAURITO;
	
	
	public static TipoStato generateRandomStatoVideo() {
		TipoStato[]values=TipoStato.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
	
}
