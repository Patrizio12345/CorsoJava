package srl.neotech.academy;

import java.util.ArrayList;

public class Aereo extends Aereoporto{

	private Integer idUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private ModelloAereo modelloAereo;
	private ArrayList<Passeggero>passeggeriAereo=new ArrayList<Passeggero>();
	private Integer velocita;//da 1 a 10
	private Integer distanzaDallAereoporto;//da 1 a 500
	private StatoAereo statoAereo;
	
	public Aereo() {
		modelloAereo=new ModelloAereo();
	}
	
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public String getCompagniaAerea() {
		return "[Compagnia Aerea]:"+compagniaAerea;
	}
	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}

	public ModelloAereo getModelloAereo() {
		return modelloAereo;
	}
	public void setModelloAereo(ModelloAereo modelloAereo) {
		this.modelloAereo = modelloAereo;
	}
	public ArrayList<Passeggero> getPasseggeriAereo() {
		return passeggeriAereo;
	}
	public void setPasseggeriAereo(ArrayList<Passeggero> passeggeriAereo) {
		this.passeggeriAereo = passeggeriAereo;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita+velocita;
		if(velocita==distanzaDallAereoporto && velocita==getRaggioDiAzione()) {
			setStatoAereo(StatoAereo.IN_PARTENZA);
			velocita++;
		}
		if(velocita<distanzaDallAereoporto|| velocita<getRaggioDiAzione() ) {
			setStatoAereo(StatoAereo.DECOLLATO);
			velocita++;
		}
		if(velocita>getDistanzaDallAereoporto() && velocita>getRaggioDiAzione()) {
			setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
			velocita++;
		}
		if(velocita<getDistanzaDallAereoporto() || velocita<getRaggioDiAzione()) {
			setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			velocita--;
		}
		if(velocita==getDistanzaDallAereoporto() && velocita==getRaggioDiAzione()) {
			setStatoAereo(StatoAereo.ATTERRATO);
			velocita--;
		}
	}
	public Integer getDistanzaDallAereoporto() {
		return distanzaDallAereoporto;
	}
	public void setDistanzaDallAereoporto(Integer distanzaDallAereoporto) {
		this.distanzaDallAereoporto = velocita+getRaggioDiAzione()+distanzaDallAereoporto;//????
	}
	public StatoAereo getStatoAereo() {
		return statoAereo;
	}
	public void setStatoAereo(StatoAereo statoAereo) {
		this.statoAereo = statoAereo;
	}
	
	

	@Override
	public String toString() {
	return "[ID]:"+this.getIdUnivoco()+"[ORARIO]:"+this.getOrario()+"--"+this.getCompagniaAerea()+"[COSTRUTTORE]:"+
	this.getModelloAereo().getCostruttore()+"[CODICE MODELLO]:"+this.getModelloAereo().getCodiceModello()+"[CAPIENZA AEREO/PASSEGGERI]:"
			+this.getModelloAereo().getCapienzaNumeroPasseggeri()+"[VELOCITÀ]:"+this.getVelocita()+"[DISTANZA DALL'AEREOPORTO]:"+this.getDistanzaDallAereoporto()+"--"+this.getPasseggeriAereo();
	}
	
	
	
	
	
	
}
