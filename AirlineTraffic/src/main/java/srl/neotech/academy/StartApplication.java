package srl.neotech.academy;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {

		Aereoporto aereoporto=new Aereoporto();
		Aereo aereo=new Aereo();
		Passeggero passeggero=new Passeggero();

		aereoporto.checkIn(passeggero).equals(aereoporto.decollo(aereo));
		aereo.setVelocita(1);//da 1 a 10
		aereo.setDistanzaDallAereoporto(1);//da 1 a 500
		aereoporto.setRaggioDiAzione(null);//da 1 a 100km


		while(aereo.getVelocita()>aereo.getDistanzaDallAereoporto()) {
			aereo.setStatoAereo(StatoAereo.DECOLLATO);
			if(aereo.getDistanzaDallAereoporto()>aereoporto.getRaggioDiAzione()) {
				aereo.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
				aereo.getVelocita().equals(aereo.getVelocita()+1);
			}System.out.println("Blink!"+aereo.getVelocita());
		}

		while(aereo.getDistanzaDallAereoporto()<=0 && aereo.getVelocita()<=0) {
			aereo.setStatoAereo(StatoAereo.ATTERRATO);
			aereoporto.getRaggioDiAzione().compareTo(aereo.getVelocita()-1);
			aereo.getVelocita().equals(aereo.getVelocita()-1);
		}System.out.println("Blink!"+aereo.getVelocita());


		aereoporto.checkOut(passeggero).equals(aereoporto.atterraggio(aereo));

		aereoporto.checkIn(passeggero).setClassePasseggero(ClassePasseggero.EXCELSIOR);
		aereoporto.checkOut(passeggero).setClassePasseggero(ClassePasseggero.EXCELSIOR);
		passeggero.getClassePasseggero().EXCELSIOR.equals(passeggero.getHaChampagne());
		passeggero.getSessoPasseggero().FEMMINA.equals(passeggero.getHaFiore());   
		passeggero.getClassePasseggero().BUISNESS.equals(passeggero.getHaGiornale());


		for(int i=1;i<=100;i++) {
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_PARTENZA);
			aereo.setIdUnivoco(i);
			aereo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));//ticktime
			aereo.setCompagniaAerea("Lufthansa");
			aereo.setModelloAereo("Boeing Commercial Airplanes",747,660);
			aereo.getVelocita();
			aereo.getDistanzaDallAereoporto();
			aereoporto.getListaAerei().add(aereo);
		}for(int i=1;i<=200;i++) {
			aereo=new Aereo();
			aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			aereo.setIdUnivoco(i);
			aereo.setOrario(ThreadLocalRandom.current().nextInt(1, 130 + 1));//ticktime
			aereo.setCompagniaAerea("Lufthansa");
			aereo.setModelloAereo("Boeing Commercial Airplanes",747,660);
			aereo.getVelocita();
			aereo.getDistanzaDallAereoporto();
			aereoporto.getListaAerei().add(aereo);
		}


 
	














	}

}
//for (Aereo aereo1: aereoporto.getListaAerei()) {
//	System.out.println(aereo.getOrario());
//}

