package srl.neotech.academy;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Aereoporto {

	private ArrayList<Aereo>listaAerei=new ArrayList<Aereo>();
	private ArrayList<Passeggero>viaggiatori=new ArrayList<Passeggero>();
	private Integer raggioDiAzione;//da 1 a 100 km
	
	public Aereo atterraggio(Aereo aereo) {
		while(aereo.getDistanzaDallAereoporto()>0) {
			Integer distanzaAttualeAereo=aereo.getDistanzaDallAereoporto()-aereo.getVelocita();
			aereo.setDistanzaDallAereoporto(distanzaAttualeAereo);
			System.out.println("Blink!");
		}
		System.out.println("L'aereo:"+aereo.getIdUnivoco()+" è ATTERRATO");
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
		passeggero.setStatoPasseggero(StatoPasseggero.IMBARCATO);
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
	
	
	
	
	public void checkOut(Aereo aereoInArrivo) {
		System.out.println("--CHECKOUT DELL'AEREO:"+aereoInArrivo.getIdUnivoco());
		for(int i=0;i<aereoInArrivo.getModelloAereo().getCapienzaNumeroPasseggeri();i++) {
			Passeggero passeggeroInArrivo = new Passeggero();
			passeggeroInArrivo.setIdUnivocoPasseggero(i+1);
			passeggeroInArrivo.setClassePasseggero(ClassePasseggero.generateRandomClassePasseggero());
			passeggeroInArrivo.setStatoPasseggero(StatoPasseggero.SBARCATO);
			if(passeggeroInArrivo.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
				passeggeroInArrivo.setHaChampagne(true);
			}passeggeroInArrivo.setEta(ThreadLocalRandom.current().nextInt(1, 80 + 1));
			passeggeroInArrivo.setSessoPasseggero(SessoPasseggero.generateRandomSessoPasseggero());
			if(passeggeroInArrivo.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
				passeggeroInArrivo.setHaFiore(true);
			}if(passeggeroInArrivo.getClassePasseggero().equals(ClassePasseggero.BUISNESS)) {
				passeggeroInArrivo.setHaGiornale(true);
			}if(passeggeroInArrivo.getClassePasseggero().equals(ClassePasseggero.BUISNESS.EXCELSIOR.TURISTA)) {
				passeggeroInArrivo.setHaBagagli(true);
			}
			System.out.println("Passeggero"+passeggeroInArrivo.getIdUnivocoPasseggero()+"sbarcato!");
			viaggiatori.add(passeggeroInArrivo);
		}
		
		
		
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
