package srl.neotech.academy;

public interface IAereo {

	
	String inPartenza(Integer distanzaDallAreoporto,Integer velocita);
	String decollato(Integer distanzaDallAreoporto,Integer velocita);
	String inAvvicinamento(Integer distanzaDallAreoporto,Integer velocita);
	String atterrato(Integer distanzaDallAreoporto,Integer velocita);
	
	
}
