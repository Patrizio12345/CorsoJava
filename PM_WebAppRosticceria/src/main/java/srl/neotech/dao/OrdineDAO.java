package srl.neotech.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import srl.neotech.model.Ordine;
import srl.neotech.model.Prodotto;
import srl.neotech.model.SingletonDatiRosticceria;

@Component
public class OrdineDAO {

	
	public void addOrdine(Ordine ordine) {
		SingletonDatiRosticceria.getInstance().getOrdini().add(ordine);
	}
	
	
public ArrayList<Ordine>listaOrdini(){
		
		return SingletonDatiRosticceria.getInstance().getOrdini();
}
	
}
