package srl.neotech.model;


import java.time.LocalDateTime;

public class MovimentoBancomat {
	
	private String nominativo;
	private String id;
	private String dataEora;
	private TipologiaMovimento operazione;
	private Integer taglio;
	private Integer quantita;
	private Integer totale;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public String getDataEora() {
		return dataEora;
	}
	public void setDataEora(String dataEora) {
		this.dataEora = dataEora;
	}
	
	
	
	
	public TipologiaMovimento getOperazione() {
		return operazione;
	}
	public void setOperazione(TipologiaMovimento operazione) {
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
	
	
	public boolean equals(MovimentoBancomat obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(!(obj instanceof MovimentoBancomat)) return false;
		MovimentoBancomat o =(MovimentoBancomat) obj;
		return o.id == this.id;
 		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}