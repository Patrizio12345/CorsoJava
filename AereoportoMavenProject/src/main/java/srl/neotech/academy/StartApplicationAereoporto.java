package srl.neotech.academy;

public class StartApplicationAereoporto {

	public static void main(String[] args) {
		
		Aereoporto aereoporto=new Aereoporto();
        
		
		

		for(int i=0;i<100;i++){
			Aereo aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_PARTENZA);
			aereo.setIdUnivoco(i);
			aereo.setOrario(10);
			aereo.setCompagniaAerea("[Lufthansa]");
			aereo.setModello("Boeing Commercial Airplanes",747,660);
			aereo.setVelocita(0);
			aereo.setDistanzaDallAreoporto(0);
			aereoporto.getListaAerei().add(aereo);
		}for(int j=0;j<200;j++ ) {
			Aereo aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			aereoporto.getListaAerei().add(aereo);
		}for(int p=0;p<1000;p++) {
			Passeggero passeggero=new Passeggero();
			aereoporto.checkIn(passeggero);
			aereoporto.getListaPasseggeri().add(passeggero);
		}


		



	} 




		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

