package srl.neotech.academy;

import java.util.ArrayList;

public class Aereo {

	private Integer idUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private String modelloAereo;
	private ArrayList<Passeggero>passeggeri=new ArrayList<Passeggero>();
	private Integer velocita;//da 1 a 10
	private Integer distanzaDallAereoporto;//da 1 a 500
	private StatoAereo statoAereo;
	
	
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
	
	public String getModelloAereo() {
		return modelloAereo;
	}
	public void setModelloAereo(String costruttore,Integer codiceModello,Integer capienzaNumeroPasseggeri) {
		this.modelloAereo = modelloAereo;
	}
	
	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}
	public Integer getDistanzaDallAereoporto() {
		return distanzaDallAereoporto;
	}
	public void setDistanzaDallAereoporto(Integer distanzaDallAereoporto) {
		this.distanzaDallAereoporto = distanzaDallAereoporto;
	}
	public StatoAereo getStatoAereo() {
		return statoAereo;
	}
	public void setStatoAereo(StatoAereo statoAereo) {
		this.statoAereo = statoAereo;
	}
	
	@Override
	public String toString() {
	return this.getIdUnivoco()+"--"+this.getOrario()+"--"+this.getCompagniaAerea()+"--"+this.getModelloAereo()+"--"+this.getVelocita()+"--"+this.getDistanzaDallAereoporto()+"--"+this.getPasseggeri();
	}
	
	
	
	
	
	
}
