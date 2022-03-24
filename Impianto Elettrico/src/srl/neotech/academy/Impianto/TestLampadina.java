package srl.neotech.academy.Impianto;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TestLampadina {

	public static void main(String[] args) {
		
		int contaClick=0;
		Lampadina lampadina=new Lampadina();
		lampadina.setClickToRottura(ThreadLocalRandom.current().nextInt(1, 100 + 1));
		lampadina.setStato(false);
		System.out.println("[la lampadina ha "+lampadina.getClickToRottura()+" click prima di rompersi]: ");
		
		
		while(lampadina.getClickToRottura()>contaClick) {
		
		Scanner scannerClick=new Scanner(System.in);
		System.out.println("[n° accensione lampadina]:");
		Integer s=scannerClick.nextInt();
		

	if(s>=(lampadina.getClickToRottura()-contaClick)){
			s=(lampadina.getClickToRottura()-contaClick);
		}
		
		for(int i=0;i<s;i++) {
			if(lampadina.getStato().equals(false)) {
				System.out.print(i+1);
				System.out.println("[ACCESA]");
				lampadina.click();	
			}else {System.out.print(i+1);
			System.out.println("[SPENTA]");
		lampadina.click();	
			}contaClick=contaClick+1;
		}
		int clickResidui=(lampadina.getClickToRottura()-contaClick);
		System.out.println("[CLICK Residui]:"+clickResidui);
		}
		
		System.out.println("[Lampadina ROTTA]");
		
	}

}
