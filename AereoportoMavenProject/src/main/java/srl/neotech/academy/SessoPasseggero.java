package srl.neotech.academy;

import java.util.Random;

public enum SessoPasseggero {

	MASCHIO,
	FEMMINA;
	
	
	
	public static SessoPasseggero generateRandomSesso() {
		 SessoPasseggero[]values=SessoPasseggero.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
	
	
	
	
	
	
	
	}	
	
	
	
	
}
