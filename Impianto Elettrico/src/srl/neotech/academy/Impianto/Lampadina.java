package srl.neotech.academy.Impianto;

public class Lampadina {


    private int clickToRottura;
	private Boolean Stato;
	
	public void click() {
	this.Stato=!Stato;
	
}

	public int getClickToRottura() {
		return clickToRottura;
	}

	public void setClickToRottura(int clickToRottura) {
		this.clickToRottura = clickToRottura;
	}

	public Boolean getStato() {
		return Stato;
	}

	public void setStato(Boolean stato) {
		Stato = stato;
	}
}
