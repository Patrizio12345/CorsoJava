package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.ProdottoDAO;
import srl.neotech.model.Prodotto;

@Service
public class ProdottoServices {

	@Autowired
	ProdottoDAO prodottoDAO;
	
	public void addProdotto(Prodotto prodotto) {
		
		prodottoDAO.addProdotto(prodotto);
		
		

	}
	
		public ArrayList<Prodotto>listaProdotti() {
			
			return prodottoDAO.listaProdotti();
		}
	
       public ArrayList<Prodotto>listaProdotti(String idTipologia) {
			
			ArrayList<Prodotto>listaProdotti=prodottoDAO.listaProdotti();
			ArrayList<Prodotto>listaFiltroPerTipologia=new ArrayList<Prodotto>();
			
			for(Prodotto prodottoListaTipologia: listaProdotti) {
				if(prodottoListaTipologia.getTipologia().toString().equals(idTipologia)) listaFiltroPerTipologia.add(prodottoListaTipologia);
			}
			
			return listaFiltroPerTipologia;
       }
}
