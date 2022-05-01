package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Utente;

public class ListaUtentiResponse extends ResponseBase{

	
	private ArrayList<Utente>listaUtenti=new ArrayList<Utente>();

	public ArrayList<Utente> getListaUtenti() {
		return listaUtenti;
	}

	public void setListaUtenti(ArrayList<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}
	
	
}
