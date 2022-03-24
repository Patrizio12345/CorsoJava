package srl.neotech.academy;

import java.util.ArrayList;

public class Associato {

	private Integer idAssociato;
	private String nominativo;
	private Stato stato;
	private Integer listaIdLibriPresi;
	
	
	
	
	public Integer getIdAssociato() {
		return idAssociato;
	}
	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}
	public String getNominativo() {
		return " [Nome Associato]: "+nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public Stato getStato() {
		return stato; 
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public Integer getListaIdLibriPresi() {
		return listaIdLibriPresi;
	}
	public void setListaIdLibriPresi(Integer listaIdLibriPresi) {
		this.listaIdLibriPresi = listaIdLibriPresi;
	}
	@Override
	public String toString() {
		return this.getIdAssociato()+"--"+this.getNominativo()+"--"+this.getStato()+"--"+this.getListaIdLibriPresi();
	}
	
	
	
	
	
	
}
