package srl.neotech.academy.Impianto;

import java.util.ArrayList;

public class Interruttore {
	
	private Lampadina lampadina;
	
	public Interruttore(){
    lampadina=new Lampadina();
    
    lampadina.setStato(false);
	}

	public Lampadina getLampadina() {
		return lampadina;
	}

	public void setLampadina(Lampadina lampadina) {
		this.lampadina = lampadina;
	}	
	
	public Lampadina click() {
		
		lampadina.click();
		return lampadina;
		
	}
	
	
	
}
