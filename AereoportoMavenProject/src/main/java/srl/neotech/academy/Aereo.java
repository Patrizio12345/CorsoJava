package srl.neotech.academy;

import java.util.ArrayList;

public class Aereo extends Aereoporto implements IAereo{

	private Integer idUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private String modello;
	private Integer velocita;
	private StatoAereo statoAereo;
	private Integer distanzaDallAreoporto;
	private ArrayList<Passeggero> passeggeri=new ArrayList<Passeggero>(); 

	
	
	public Aereo(){
		
		passeggeri=new ArrayList<Passeggero>(); 
		
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
		return compagniaAerea;
	}
	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	
	public String getModello() {
		return modello;
	}
	public void setModello(String costruttore,Integer codiceModello,Integer capienzaNumeroPasseggeri) {
		this.modello = modello;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}
	public StatoAereo getStatoAereo() {
		return statoAereo;
	}
	public void setStatoAereo(StatoAereo statoAereo) {
		this.statoAereo = statoAereo;
	}
	public Integer getDistanzaDallAreoporto() {
		return distanzaDallAreoporto;
	}
	public void setDistanzaDallAreoporto(Integer distanzaDallAreoporto) {
		this.distanzaDallAreoporto = distanzaDallAreoporto;
	}
	public ArrayList<Passeggero> getListaPasseggeri() {
		return this.passeggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.passeggeri = listaPasseggeri;
	}
	
	@Override
	public String inPartenza(Integer distanzaDallAreoporto, Integer velocita) {
		this.velocita=velocita-distanzaDallAreoporto;
		return "Aereo in Partenza!"+velocita;//aereo fermo
	}

	@Override
	public String decollato(Integer distanzaDallAreoporto, Integer velocita) {
		this.velocita=this.velocita+velocita+distanzaDallAreoporto;
		return "Aereo decollato!"+velocita;//accelera e aumenta distanza dall'aereoporto
	}

	@Override
	public String inAvvicinamento(Integer distanzaDallAreoporto, Integer velocita) {
		this.velocita=this.velocita-velocita-distanzaDallAreoporto;
		if(this.velocita<0)this.velocita=0;
		else if(this.distanzaDallAreoporto<0)this.distanzaDallAreoporto=0;
		return "Aereo in avvicinamento!"+velocita;//decelera e diminuisce distanza dall'aereoporto
	}

	@Override
	public String atterrato(Integer distanzaDallAreoporto, Integer velocita) {
		this.velocita=velocita-distanzaDallAreoporto;
		return "Aereo atterrato!"+velocita;
	}//aereo fermo
	
	
	@Override
	public String toString() {
	return this.getIdUnivoco()+"--"+this.getOrario()+"--"+this.getCompagniaAerea()+"--"+this.getModello()+"--"+this.getVelocita()+"--"+this.getStatoAereo()+"--"+this.getDistanzaDallAreoporto()+"--"+this.getListaPasseggeri();
	}

	
	
	
	
	
	
	
}
