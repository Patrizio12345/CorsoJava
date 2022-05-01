package srl.neotech.model;

import java.util.Random;

public enum TipoGenere {

	ADULTI,
	HORROR,
	FANTASY,
	DRAMMATICO,
	COMMEDIA,
	THRILLER,
	CINEPANETTONE,
	GIALLO,
	ROMANTICO,
	TRUE_CRIME,
	ACTION;
	
	public static TipoGenere generateRandomTipoGenere() {
		TipoGenere[]values=TipoGenere.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
	
}
