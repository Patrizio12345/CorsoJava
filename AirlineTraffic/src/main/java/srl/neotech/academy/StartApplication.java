package srl.neotech.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {

		Aereoporto aereoporto=new Aereoporto();
		Aereo aereo=new Aereo();
		Passeggero passeggero=new Passeggero();
		

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=1; i<300; i++) {
            list.add(i);
	}
		
		

		for(int orarioPartenza=1;orarioPartenza<=100;orarioPartenza++) {
			 Collections.shuffle(list);
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_PARTENZA);
			aereo.setIdUnivoco(orarioPartenza );
			aereo.setCompagniaAerea("Lufthansa");
			aereo.getModelloAereo().setCostruttore("Boeing Commercial Airplanes");
			aereo.getModelloAereo().setCodiceModello(747);
			aereo.getModelloAereo().setCapienzaNumeroPasseggeri(660);
			aereo.setOrario(list.get(orarioPartenza));
			aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAereoporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
			aereoporto.getListaAerei().add(aereo);
			while(aereo.getVelocita()>aereo.getDistanzaDallAereoporto()) {
				aereo.setStatoAereo(StatoAereo.DECOLLATO);
				if(aereo.getDistanzaDallAereoporto()>aereoporto.getRaggioDiAzione()+aereo.getVelocita()) {
					aereo.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
					aereo.getVelocita().equals(aereo.getVelocita()+1);
					aereoporto.checkIn(passeggero).equals(aereoporto.decollo(aereo));
				}//System.out.println(aereo.getVelocita()+"Blink!");
			}
		} 
		
		for(int orarioArrivo=1;orarioArrivo<=200;orarioArrivo++) {
			 Collections.shuffle(list);
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			aereo.setIdUnivoco(orarioArrivo);
			aereo.setOrario(list.get(orarioArrivo));
			aereo.setCompagniaAerea("Lufthansa");
			aereo.getModelloAereo().setCostruttore("Boeing Commercial Airplanes");
			aereo.getModelloAereo().setCodiceModello(747);
			aereo.getModelloAereo().setCapienzaNumeroPasseggeri(660);
			aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAereoporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
			aereoporto.getListaAerei().add(aereo);
			while(aereo.getDistanzaDallAereoporto()<=0 && aereo.getVelocita()<=0) {
				aereo.setStatoAereo(StatoAereo.ATTERRATO);
				aereoporto.getRaggioDiAzione().compareTo(aereo.getVelocita()-1);
				aereoporto.checkOut(passeggero).equals(aereoporto.atterraggio(aereo));
			}//System.out.println(aereo.getDistanzaDallAereoporto()+"Blink!");
		} 
		 
		for(int j=1;j<1000;j++) {
			passeggero=new Passeggero();
			passeggero.setIdUnivocoPasseggero(j);
			passeggero.setStatoPasseggero(StatoPasseggero.CHECKIN);
			passeggero.setClassePasseggero(ClassePasseggero.generateRandomClassePasseggero());
			if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
				passeggero.setHaChampagne(true);
			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS)) {
				passeggero.setHaGiornale(true);
			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS.EXCELSIOR.TURISTA)) {
				passeggero.setHaBagagli(true);
			}
			passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 80 + 1));
			passeggero.setSessoPasseggero(SessoPasseggero.generateRandomSessoPasseggero());
			if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
				passeggero.setHaFiore(true);
			}
			aereoporto.getViaggiatori().add(passeggero);
		}//System.out.println(aereoporto.getViaggiatori() );
			
		
	     
		
		
		
		
	//riempimento aerei
	//  for(Aereo aereoDaRiempire:aereoporto.getListaAerei()) {
//		  aereo.getPasseggeri().add(aereoporto.checkIn(passeggero));
//		  
	//  }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
			 
		





	    


	}

}





