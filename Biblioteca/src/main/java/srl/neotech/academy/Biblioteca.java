package srl.neotech.academy;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

   
	
  private ArrayList<Libro> listaLibri=new ArrayList<Libro>();
  private ArrayList<Associato> listaAssociati=new ArrayList<Associato>();
  private ArrayList<LibroPresoDaAssociato> listaLibroPresoDaAssociato =new ArrayList<LibroPresoDaAssociato>();
  
  
  
	public Biblioteca() {
		listaLibri=new ArrayList<Libro>();
		listaAssociati=new ArrayList<Associato>();
		listaLibroPresoDaAssociato =new ArrayList<LibroPresoDaAssociato>();
		
	}

	
	public ArrayList<Libro> getListaLibri() {
		return listaLibri;
	}


	public void setListaLibri(ArrayList<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}





	public ArrayList<Associato> getListaAssociati() {
		return listaAssociati;
	}





	public void setListaAssociati(ArrayList<Associato> listaAssociati) {
		this.listaAssociati = listaAssociati;
	}


	public ArrayList<LibroPresoDaAssociato> getListaLibroPresoDaAssociato() {
		return listaLibroPresoDaAssociato;
	}


	public void setListaLibroPresoDaAssociato(ArrayList<LibroPresoDaAssociato> listaLibroPresoDaAssociato) {
		this.listaLibroPresoDaAssociato = listaLibroPresoDaAssociato;
	}


	
	

	
	
	
	
	
	
	
}
