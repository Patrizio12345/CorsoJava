package srl.neotech.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import srl.neotech.model.Prodotto;
import srl.neotech.model.SingletonDatiRosticceria;

@Component
public class ProdottoDAO {

	
	public void addProdotto(Prodotto prodotto) {
		
		SingletonDatiRosticceria.getInstance().getListino().add(prodotto);	
	
	
	}
	
	public ArrayList<Prodotto>listaProdotti(){
		
		return SingletonDatiRosticceria.getInstance().getListino();
	}
	
}
