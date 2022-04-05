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
		while(aereo.getDistanzaDallAereoporto()<this.raggioDiAzione) {
			Integer distanzaAttualeAereo=aereo.getDistanzaDallAereoporto()+aereo.getVelocita();
			aereo.setDistanzaDallAereoporto(distanzaAttualeAereo);
			System.out.println("Blink!");
		}
		System.out.println("L'aereo:"+aereo.getIdUnivoco()+" è DECOLLATO");
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
	
	public void  checkIn(ArrayList<Passeggero> listaViaggiatori,Aereo aereoInPartenza) {
		System.out.println("--CHEKIN DELL'AEREO:"+aereoInPartenza.getIdUnivoco());
		for(int i=0;i<aereoInPartenza.getModelloAereo().getCapienzaNumeroPasseggeri();i++) {
			Passeggero passeggeroInPartenza=checkIn(listaViaggiatori.get(0));
			System.out.println("Carico il passeggero:"+passeggeroInPartenza.getIdUnivocoPasseggero());
			aereoInPartenza.getPasseggeriAereo().add(passeggeroInPartenza);
			listaViaggiatori.remove(0);
			if(listaViaggiatori.size()<aereoInPartenza.getModelloAereo().getCapienzaNumeroPasseggeri()) break;
		}	
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
	
	public void checkOut(ArrayList<Passeggero> viaggiatori2, Aereo aereoInArrivo) {
		
		
	}
	
	
	
	
	
	
	public Aereoporto(){
		listaAerei=new ArrayList<Aereo>();
		viaggiatori=new ArrayList<Passeggero>();
		this.raggioDiAzione=100;
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
