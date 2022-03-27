package srl.neotech.academy;

public class Passeggero {

	private Integer idUnivocoPasseggero;
	private SessoPasseggero sessoPasseggero;
	private Integer eta;
	private ClasseViaggiatore classeViaggiatore;
	private Boolean haBagagli;
	private Boolean haFiore;
	private Boolean haGiornale;
	private StatoPasseggero statoPasseggero;
	
	
	
	
	
	public Integer getIdUnivocoPasseggero() {
		return idUnivocoPasseggero;
	}
	public void setIdUnivocoPasseggero(Integer idUnivocoPasseggero) {
		this.idUnivocoPasseggero = idUnivocoPasseggero;
	}
	public SessoPasseggero getSessoPasseggero() {
		return sessoPasseggero;
	}
	public void setSessoPasseggero(SessoPasseggero sessoPasseggero) {
		this.sessoPasseggero = sessoPasseggero;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public ClasseViaggiatore getClasseViaggiatore() {
		return classeViaggiatore;
	}
	public void setClasseViaggiatore(ClasseViaggiatore classeViaggiatore) {
		this.classeViaggiatore = classeViaggiatore;
	}
	public Boolean getHaBagagli() {
		return haBagagli;
	}
	public void setHaBagagli(Boolean haBagagli) {
		this.haBagagli = haBagagli;
	}
	public Boolean getHaFiore() {
		return haFiore;
	}
	public void setHaFiore(Boolean haFiore) {
		this.haFiore = haFiore;
	}
	public Boolean getHaGiornale() {
		return haGiornale;
	}
	public void setHaGiornale(Boolean haGiornale) {
		this.haGiornale = haGiornale;
	}
	public StatoPasseggero getStatoPasseggero() {
		return statoPasseggero;
	}
	public void setStatoPasseggero(StatoPasseggero statoPasseggero) {
		this.statoPasseggero = statoPasseggero;
	}
	
	
	@Override
	public String toString(){
		return this.getIdUnivocoPasseggero()+"--"+this.getSessoPasseggero()+"--"+this.getEta()+"--"+this.getClasseViaggiatore()+"--"+this.getHaBagagli()+"--"+this.getHaFiore()+"--"+this.getHaGiornale();
	}
	
	
	
	
	
	
}
