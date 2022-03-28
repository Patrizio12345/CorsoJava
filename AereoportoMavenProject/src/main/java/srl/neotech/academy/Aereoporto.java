package srl.neotech.academy;

import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;

public class Aereoporto {

	
	public Aereo atterraggio(Aereo aereo) {
		
		aereo.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
		return aereo.atterraggio(aereo);
	}
	
	public Aereo decollo(Aereo aereo) {
		
		aereo.setStatoAereo(StatoAereo.ATTERRATO);
		return aereo.decollo(aereo);
	}
	
	public Passeggero checkIn(Passeggero passeggero) {
		
		passeggero.setStatoPasseggero(StatoPasseggero.InAereoporto);
		return passeggero;
	}
	

    public Passeggero checkOut(Passeggero passeggero) {
		
		passeggero.setStatoPasseggero(StatoPasseggero.InAereoporto);
		return passeggero;
	}	
	
	private Integer raggioDiAzione;
	
	private ArrayList<Aereo> listaAerei=new ArrayList<Aereo>();
	private ArrayList<Passeggero> listaPasseggeri=new ArrayList<Passeggero>(); 
	
	
	public Aereoporto() {
		listaAerei=new ArrayList<Aereo>();
		 listaPasseggeri=new ArrayList<Passeggero>();
		
	}


	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}


	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}


	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}


	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}

	public Integer getRaggioDiAzione(Aereo aereo) {
		aereo.setDistanzaDallAreoporto(raggioDiAzione);
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = this.raggioDiAzione;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
