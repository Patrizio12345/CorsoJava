package srl.neotech.academy;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

   
	
  private ArrayList<Libro> listaLibri=new ArrayList<Libro>();
  private ArrayList<Associato> listaAssociati=new ArrayList<Associato>();
  private ArrayList<Integer> listaIdLibripresi=new ArrayList<>();
   
	public Biblioteca() {
		listaLibri=new ArrayList<Libro>();
		listaAssociati=new ArrayList<Associato>();
		listaIdLibripresi=new ArrayList<Integer>();
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


	public ArrayList<Integer> getListaIdLibripresi() {
		return listaIdLibripresi;
	}


	public void setListaIdLibripresi(ArrayList<Integer> listaIdLibripresi) {
		this.listaIdLibripresi = listaIdLibripresi;
	}


	



//	private static void Connection(ArrayList<Libro> fromListaLibri, ArrayList<Libro> toListaLibriPresi) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static Libro toData(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static Libro fromData(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//		


	

	
	
	
	
	
	
	
}
