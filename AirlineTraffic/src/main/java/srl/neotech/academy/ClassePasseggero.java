package srl.neotech.academy;

import java.util.Random;

public enum ClassePasseggero {

	BUISNESS,
	EXCELSIOR,
	TURISTA;
	
	
	
	public static ClassePasseggero generateRandomClassePasseggero() {
		 ClassePasseggero[]values=ClassePasseggero.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
	
	
	
	
	}
	
	
	
	
	
	
}
