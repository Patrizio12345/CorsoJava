package srl.neotech.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Exchanger;
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
			aereo.setCompagniaAerea(CompagniaAerea.generateRandomCompagniaAerea());
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Ryanair)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-400);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(188);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Wizz_Air)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(195);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Volotea)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-800);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(189);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.EasyJet)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(318-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(132);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Eurowings)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(319-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(156);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.ITA_Italia_Trasporto_Aereo)) {
				aereo.getModelloAereo().setCostruttore("Embraer(Azienda aereonautica brasiliana)");
				aereo.getModelloAereo().setCodiceModello(190);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(114);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Vueling_Airlines)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320-200);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(186);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Lufthansa)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(747);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(410);
			}
			aereo.setOrario(list.get(orarioPartenza));
			aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAereoporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
			aereoporto.getListaAerei().add(aereo);
			//			while(aereo.getVelocita()>aereo.getDistanzaDallAereoporto()) {
			//				aereo.setStatoAereo(StatoAereo.DECOLLATO);
			//				if(aereo.getDistanzaDallAereoporto()>aereoporto.getRaggioDiAzione()+aereo.getVelocita()) {
			//					aereo.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
			//					aereo.getVelocita().equals(aereo.getVelocita()+1);
			//					
			//	}//System.out.println(aereo.getVelocita()+"Blink!");
			//}
		} System.out.println(aereoporto.getListaAerei());

		for(int orarioArrivo=1;orarioArrivo<=200;orarioArrivo++) {
			Collections.shuffle(list);
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			aereo.setIdUnivoco(orarioArrivo);
			aereo.setOrario(list.get(orarioArrivo));
			aereo.setCompagniaAerea(CompagniaAerea.generateRandomCompagniaAerea());
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Ryanair)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-400);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(188);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Wizz_Air)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(195);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Volotea)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(737-800);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(189);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.EasyJet)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(318-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(132);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Eurowings)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(319-100);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(156);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.ITA_Italia_Trasporto_Aereo)) {
				aereo.getModelloAereo().setCostruttore("Embraer(Azienda aereonautica brasiliana)");
				aereo.getModelloAereo().setCodiceModello(190);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(114);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Vueling_Airlines)) {
				aereo.getModelloAereo().setCostruttore("airbus industries");
				aereo.getModelloAereo().setCodiceModello(320-200);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(186);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.Lufthansa)) {
				aereo.getModelloAereo().setCostruttore("boing commercial airplanes");
				aereo.getModelloAereo().setCodiceModello(747);
				aereo.getModelloAereo().setCapienzaNumeroPasseggeri(410);
			}
			aereo.setVelocita(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAereoporto(ThreadLocalRandom.current().nextInt(1, 500 + 1));
			aereoporto.getListaAerei().add(aereo);
			//			while(aereo.getDistanzaDallAereoporto()<=0 && aereo.getVelocita()<=0) {
			//				aereo.setStatoAereo(StatoAereo.ATTERRATO);
			//				aereoporto.getRaggioDiAzione().compareTo(aereo.getVelocita()-1);
			//				
			//}//System.out.println(aereo.getDistanzaDallAereoporto()+"Blink!");
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

		 String casi = null;
		 String situazione="";

	     switch (casi) {

	     case "1":
	    	 situazione="PARTENZA TO DECOLLATO";
	    	 aereo=new Aereo();
	    	 Integer aereoPieno=0;
	    	 Integer lunghezzaArrayAereiInPartenza=aereoporto.getListaAerei().size();
	    	 for(Aereo aereoDaRiempire:aereoporto.getListaAerei()) {
	    		 aereo.getPasseggeriAereo().add(aereoporto.checkIn(passeggero));
	    		 if(aereoDaRiempire.equals(aereo.getModelloAereo().getCapienzaNumeroPasseggeri()) ) {
	    			 aereoDaRiempire.equals(aereoPieno);
	    		 }
	    	if(aereoPieno.equals(aereo.getStatoAereo().IN_PARTENZA)) {
	    		aereoPieno.equals(aereo.decollo(aereo));
	    	}
	    	 } lunghezzaArrayAereiInPartenza=aereoPieno;
	    	 System.out.println(lunghezzaArrayAereiInPartenza); 


	    	 break;


	     }
		 








		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//riempimento aerei
	//  for(Aereo aereoDaRiempire:aereoporto.getListaAerei()) {
//		  aereo.getPasseggeri().add(aereoporto.checkIn(passeggero));
//		  
	//  }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
			 
		





	    


	}

}





