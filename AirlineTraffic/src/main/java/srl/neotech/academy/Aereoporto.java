package srl.neotech.academy;

import java.util.ArrayList;

public class Aereoporto {

	private ArrayList<Aereo>listaAerei=new ArrayList<Aereo>();
	private ArrayList<Passeggero>viaggiatori=new ArrayList<Passeggero>();
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
		if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
			passeggero.setHaChampagne(true);
		}if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
			passeggero.setHaFiore(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS)) {
			passeggero.setHaGiornale(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS.EXCELSIOR.TURISTA)) {
			passeggero.setHaBagagli(true);
		}
		
		return passeggero;
	}
	public Passeggero checkOut(Passeggero passeggero) {
		passeggero.setStatoPasseggero(StatoPasseggero.CHECKOUT);
		if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
			passeggero.setHaChampagne(true);
		}if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
			passeggero.setHaFiore(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS)) {
			passeggero.setHaGiornale(true);
		}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS.EXCELSIOR.TURISTA)) {
			passeggero.setHaBagagli(true);
		}
		return passeggero;
	}
	
	
	public Aereoporto(){
		listaAerei=new ArrayList<Aereo>();
		viaggiatori=new ArrayList<Passeggero>();
	}
	
	
	
	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}
	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	
	public ArrayList<Passeggero> getViaggiatori() {
		return viaggiatori;
	}
	public void setViaggiatori(ArrayList<Passeggero> viaggiatori) {
		this.viaggiatori = viaggiatori;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	
	
	
	
	
	
	
	
	
	
}
