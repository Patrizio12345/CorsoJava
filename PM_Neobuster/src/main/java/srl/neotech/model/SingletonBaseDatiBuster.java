package srl.neotech.model;

import java.util.ArrayList;

public class SingletonBaseDatiBuster {

	private static SingletonBaseDatiBuster instance;
	
	private ArrayList<Video>listaVideo=new ArrayList<Video>();
	private ArrayList<Utente>listaUtenti=new ArrayList<Utente>();
	
	
	
	public ArrayList<Video> getListaVideo() {
		return listaVideo;
	}


	public void setListaVideo(ArrayList<Video> listaVideo) {
		this.listaVideo = listaVideo;
	}


	public ArrayList<Utente> getListaUtenti() {
		return listaUtenti;
	}


	public void setListaUtenti(ArrayList<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}


	public SingletonBaseDatiBuster() {
		
	}
	
	
	public static SingletonBaseDatiBuster getInstance() {
		if(instance == null) {
			instance = new SingletonBaseDatiBuster();
		}
		return instance;
	}
	
	
	
}
