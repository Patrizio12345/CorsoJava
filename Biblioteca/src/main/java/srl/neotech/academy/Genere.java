package srl.neotech.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Genere {

	HORROR,
	FANTASY,
	GIALLO,
	ROSA,
	LetteraturaClassica,
	POEMA,
	FANTASCIENZA,
	DISTOPICO,
	BIOGRAFIA_AUTOBIOGRAFIA;
	
	

	public static Genere generateRandomGenere() {
	 Genere[]values=Genere.values();
	 int length=values.length;
	 int randIndex=new Random().nextInt(length);
	 return values [randIndex];
	
	}
	
}




