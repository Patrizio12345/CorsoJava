package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Prodotto;

public class ListaProdottiResponse extends ResponseBase{

	private ArrayList<Prodotto>listaProdotti=new ArrayList<Prodotto>();

	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}

	
	
	
}
