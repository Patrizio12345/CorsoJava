package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Ordine;

public class ListaOrdiniResponse extends ResponseBase{

	private ArrayList<Ordine>listaOrdini=new ArrayList<Ordine>();

	public ArrayList<Ordine> getListaOrdini() {
		return listaOrdini;
	}

	public void setListaOrdini(ArrayList<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}
	
	
	
	
}
