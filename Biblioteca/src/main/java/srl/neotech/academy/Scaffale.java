package srl.neotech.academy;

import java.util.Random;

public enum Scaffale {


	LETTERATURA,
	FOLCLORE,
	SCIENZE_E_SISTEMI,
	SCIENZA,
	STORIA,
	RETORICA_E_CRITICA,
	SOCIOLOGIA_E_ANTROPOLOGIA;
	
	

	public static Scaffale generateRandomScaffale() {
		 Scaffale[]values=Scaffale.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
	
	
	
	}
	
	
}
