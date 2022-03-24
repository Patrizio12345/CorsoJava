package srl.neotech.academy.Impianto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TestInterruttore {

	public static void main(String[] args) {
	int contatore=0;
		ArrayList<Interruttore>interruttori=new ArrayList<Interruttore>();
		
		for (int i=0;i<10;i++) {
			Interruttore interruttore=new Interruttore();
			interruttore.getLampadina().setClickToRottura(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			interruttori.add(interruttore);
			System.out.println(interruttore.getLampadina());
		}
		
		Scanner scannerClick=new Scanner(System.in);
		System.out.println("[quale interruttore vuoi azionare 10 volte?]:");
		Integer s=scannerClick.nextInt();
		
		for (int i=0;i<10;i++) {
			interruttori.get(s).click();
			
			contatore++;
			if(contatore>interruttori.get(s).getLampadina().getClickToRottura()) {
				interruttori.get(s).getLampadina().setStato(false);
				
			}
			System.out.println(interruttori.get(s).getLampadina().getStato());
	
		}
		
	}

}
