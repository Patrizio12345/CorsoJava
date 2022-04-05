package srl.neotech.academy;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Aereo {

	private Integer idUnivoco;
	private Integer orario;
	private CompagniaAerea compagniaAerea;
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
	
	public CompagniaAerea getCompagniaAerea() {
		return compagniaAerea;
	}


	public void setCompagniaAerea(CompagniaAerea compagniaAerea) {
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

	}
	public Integer getDistanzaDallAereoporto() {
		return distanzaDallAereoporto;
	}
	public void setDistanzaDallAereoporto(Integer distanzaDallAereoporto) {
		this.distanzaDallAereoporto =distanzaDallAereoporto;
	}
	public StatoAereo getStatoAereo() {
		return statoAereo;
	}
	public void setStatoAereo(StatoAereo statoAereo) {
		this.statoAereo = statoAereo;
	}
	
//	//riempimento Aereo
//	public void scaricaPasseggeri() {
//		for(int i=0;i<modelloAereo.getCapienzaNumeroPasseggeri();i++ ) {
//			
//			Passeggero passeggero=new Passeggero();
//			passeggero.setIdUnivocoPasseggero(i);
//			passeggero.setStatoPasseggero(StatoPasseggero.CHECKIN);
//			passeggero.setClassePasseggero(ClassePasseggero.generateRandomClassePasseggero());
//			if(passeggero.getClassePasseggero().equals(ClassePasseggero.EXCELSIOR)) {
//				passeggero.setHaChampagne(true);
//			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS)) {
//				passeggero.setHaGiornale(true);
//			}if(passeggero.getClassePasseggero().equals(ClassePasseggero.BUISNESS.EXCELSIOR.TURISTA)) {
//				passeggero.setHaBagagli(true);
//			}
//			passeggero.setEta(ThreadLocalRandom.current().nextInt(1, 80 + 1));
//			passeggero.setSessoPasseggero(SessoPasseggero.generateRandomSessoPasseggero());
//			if(passeggero.getSessoPasseggero().equals(SessoPasseggero.FEMMINA)) {
//				passeggero.setHaFiore(true);
//			}
//			
//			
//		}
//		
//		
//		
//		
//		
//	}
	
	
	
	

	@Override
	public String toString() {
	return "[ID]:"+this.getIdUnivoco()+"[ORARIO]:"+this.getOrario()+"[STATO AEREO]:"+this.getStatoAereo()+"[COMPAGNIA AEREA]:"+this.getCompagniaAerea()+"[COSTRUTTORE]:"+
	this.getModelloAereo().getCostruttore()+"[CODICE MODELLO]:"+this.getModelloAereo().getCodiceModello()+"[CAPIENZA AEREO/PASSEGGERI]:"
			+this.getModelloAereo().getCapienzaNumeroPasseggeri()+"[VELOCITÀ]:"+this.getVelocita()+"[DISTANZA DALL'AEREOPORTO]:"+this.getDistanzaDallAereoporto()+"--"+this.getPasseggeriAereo();
	}
	
	
	
	
	
	
}
