package srl.neotech.model;



public class MovimentoBancomat {
	
	private String nominativo;
	private String id;
	private Integer dataEora;
	private String operazione;
	private Integer taglio;
	private Integer quantita;
	private Integer totale;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getDataEora() {
		return dataEora;
	}
	public void setDataEora(Integer dataEora) {
		this.dataEora = dataEora;
	}
	public String getOperazione() {
		return operazione;
	}
	public void setOperazione(String operazione) {
		this.operazione = operazione;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public Integer getTaglio() {
		return taglio;
	}
	public void setTaglio(Integer taglio) {
		this.taglio = taglio;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Integer getTotale() {
		return totale;
	}
	public void setTotale(Integer totale) {
		this.totale = totale;
	}
	
	
	
	
	
}