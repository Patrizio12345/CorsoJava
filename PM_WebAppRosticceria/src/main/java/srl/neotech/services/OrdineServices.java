package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.OrdineDAO;
import srl.neotech.model.Ordine;
import srl.neotech.model.Prodotto;

@Service
public class OrdineServices {

	@Autowired
	OrdineDAO ordineDAO;
	
	public void addOrdine(Ordine ordine) {
		
		ordineDAO.addOrdine(ordine);
		
	}
	
	public ArrayList<Ordine>listaOrdini() {
		
		return ordineDAO.listaOrdini();
		
	}
	
	
	public ArrayList<Ordine>listaOrdini(String idProdottiPerOrdine) {
		
		ArrayList<Ordine>listaOrdini=ordineDAO.listaOrdini();
		ArrayList<Ordine>listaProdottiNellOrdine=new ArrayList<Ordine>();
		
		for(Ordine prodottoListaPerOrdine: listaOrdini) {
			if(prodottoListaPerOrdine.getProdotti().equals(idProdottiPerOrdine)) listaProdottiNellOrdine.add(prodottoListaPerOrdine);
		}
		
		return listaProdottiNellOrdine;
   }
	
	
	
}
