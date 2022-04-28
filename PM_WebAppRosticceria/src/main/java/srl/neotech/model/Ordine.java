package srl.neotech.model;

import java.security.Timestamp;
import java.util.ArrayList;


public class Ordine {

	private String id;
	private String dataEora;
	private ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	private Double totale;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public Timestamp getDataEora() {
//		return dataEora;
//	}
//	public void setDataEora(Timestamp dataEora) {
//		this.dataEora = dataEora;
//	}
	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	public Double getTotale() {
		return totale;
	}
	public void setTotale(Double totale) {
		this.totale = totale;
	}
	public String getDataEora() {
		return dataEora;
	}
	public void setDataEora(String dataEora) {
		this.dataEora = dataEora;
	}
	
	
	
	
	
}
