package srl.neotech.model;

import java.util.Random;


public enum TipologiaMovimento {

	PRELIEVO,
	VERSAMENTO;
	
	
	public static TipologiaMovimento generateRandomOperazione() {
		TipologiaMovimento[]values=TipologiaMovimento.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
	
	
	
	
}
