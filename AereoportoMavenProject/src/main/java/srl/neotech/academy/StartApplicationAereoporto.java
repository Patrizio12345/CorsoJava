package srl.neotech.academy;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplicationAereoporto {

	public static void main(String[] args) {
		
		Aereoporto aereoporto=new Aereoporto();
        
		ArrayList<Aereo> listaAerei=new ArrayList<Aereo>();
		
		
		for(Aereo aereo:listaAerei) {
			for(int i=0;i<listaAerei.size();i++){
				aereo=new Aereo();
				Passeggero passeggero= new Passeggero();
				aereo.setStatoAereo(StatoAereo.IN_PARTENZA);
				aereoporto.decollo(aereo).inPartenza(0,0);
				aereo.setIdUnivoco(i);
				aereo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));
				aereo.setCompagniaAerea("[Lufthansa]");
				aereo.setModello("Boeing Commercial Airplanes",747,660);
				aereo.setVelocita( ThreadLocalRandom.current().nextInt(1, 10 + 1));
				aereo.setDistanzaDallAreoporto( ThreadLocalRandom.current().nextInt(1, 500 + 1));
				passeggero.setStatoPasseggero(StatoPasseggero.InAereoporto);
				passeggero.setClasseViaggiatore(ClasseViaggiatore.EXCELSIOR);
				passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 70 + 1));
				passeggero.setHaBagagli(true);
				passeggero.setHaFiore(false);
				passeggero.setHaGiornale(true);
				passeggero.setSessoPasseggero(SessoPasseggero.generateRandomSesso());
				passeggero.setIdUnivocoPasseggero(ThreadLocalRandom.current().nextInt(i + 1));
				aereoporto.getListaAerei().add(aereo);
				aereo.getListaPasseggeri().add(passeggero);
			}
           }System.out.println(aereoporto.getListaAerei());
           System.out.println(aereoporto.getListaPasseggeri());
		
		
		




	} 




		
		
			
		
		
		
		
		
		
		
		
		
		
	}	
		
	

