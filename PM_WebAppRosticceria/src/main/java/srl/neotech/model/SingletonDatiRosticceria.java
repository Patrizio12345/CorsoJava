package srl.neotech.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

public class SingletonDatiRosticceria {

	private static SingletonDatiRosticceria instance=null;
	
	private  ArrayList<Ordine>ordini=new ArrayList<Ordine>();
	private  ArrayList<Prodotto>listino=new ArrayList<Prodotto>();
	
	
	
	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}


	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}


	public ArrayList<Prodotto> getListino() {
		return listino;
	}


	public void setListino(ArrayList<Prodotto> listino) {
		this.listino = listino;
	}


	private SingletonDatiRosticceria() {
		
	}
	
	
	public static SingletonDatiRosticceria getInstance() {
		if(instance == null) {
			instance = new SingletonDatiRosticceria();
		}
		return instance;
	}
	
}
