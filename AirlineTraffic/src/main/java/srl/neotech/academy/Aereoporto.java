package srl.neotech.academy;

import java.util.ArrayList;

public class Aereoporto {

	private ArrayList<Aereo>listaAerei=new ArrayList<Aereo>();
	private ArrayList<Passeggero>listaPasseggeri=new ArrayList<Passeggero>();
	private Integer raggioDiAzione;//da 1 a 100 km
	
	public Aereo atterraggio(Aereo aereo) {
		aereo.setStatoAereo(StatoAereo.ATTERRATO);
		return aereo;
	}
	public Aereo decollo(Aereo aereo) {
		aereo.setStatoAereo(StatoAereo.DECOLLATO);
		return aereo;
	}
	public Passeggero checkIn(Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.CHECKIN);
		return passeggero;
	}
	public Passeggero checkOut(Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.CHECKOUT);
		return passeggero;
	}
	
	public Aereoporto(){
		listaAerei=new ArrayList<Aereo>();
		listaPasseggeri=new ArrayList<Passeggero>();
	}
	
	
	
	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}
	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	
	
	
	
	
	
	
	
	
	
}
