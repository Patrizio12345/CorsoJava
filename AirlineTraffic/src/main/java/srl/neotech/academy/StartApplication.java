package srl.neotech.academy;

import java.io.ObjectInputFilter.Config;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector.Characteristics;

public class StartApplication {

	public static void main(String[] args) {

		Aereoporto aereoporto=new Aereoporto();
		Aereo aereo=new Aereo();
		Passeggero passeggero=new Passeggero();
		aereo.setVelocita(1);//da 1 a 10
		aereo.setDistanzaDallAereoporto(1);//da 1 a 500
		aereoporto.setRaggioDiAzione(1);//da 1 a 100km
		
		
		
//creazione aerei e passeggeri
		for(int i=1;i<=100;i++) {
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_PARTENZA);
			aereo.setIdUnivoco(i);
			aereo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));
			aereo.setCompagniaAerea("Lufthansa");
			aereo.getModelloAereo().setCostruttore("Boeing Commercial Airplanes");
			aereo.getModelloAereo().setCodiceModello(747);
			aereo.getModelloAereo().setCapienzaNumeroPasseggeri(660);
			aereo.getVelocita();
			aereo.getDistanzaDallAereoporto();
			aereoporto.getListaAerei().add(aereo);
		}
		for(int i=1;i<=200;i++) {
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			aereo.setIdUnivoco(i);
			aereo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));
			aereo.setCompagniaAerea("Lufthansa");
			aereo.getModelloAereo().setCostruttore("Boeing Commercial Airplanes");
			aereo.getModelloAereo().setCodiceModello(747);
			aereo.getModelloAereo().setCapienzaNumeroPasseggeri(660);
			aereo.getVelocita();
			aereo.getDistanzaDallAereoporto();
			aereoporto.getListaAerei().add(aereo);
		}    
		for(int i=0;i<1000;i++) {
			passeggero=new Passeggero();
			passeggero.setIdUnivocoPasseggero(i);
			passeggero.setStatoPasseggero(StatoPasseggero.CHECKIN);
			passeggero.setClassePasseggero(ClassePasseggero.generateRandomClassePasseggero());
			if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
				passeggero.setHaChampagne(true);
			}if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
				passeggero.setHaFiore(true);
			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS)) {
				passeggero.setHaGiornale(true);
			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS.EXCELSIOR.TURISTA)) {
				passeggero.setHaBagagli(true);
			}
			passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 80 + 1));
			passeggero.setSessoPasseggero(SessoPasseggero.generateRandomSessoPasseggero());
			
			
			aereoporto.getViaggiatori().add(passeggero);
			
	    }   	System.out.println(aereoporto.getViaggiatori());
			
			
			
			
			
			 
		

 
//		//riempimento aerei
//	      for(Aereo aereoDaRiempire:aereoporto.getListaAerei()) {
//	    //	  aereo.getPasseggeri().add(aereoporto.checkIn(passeggero));
//	    	  
//	      }
//	    	  
//	    	  
//	      
		





	    


	}

}

