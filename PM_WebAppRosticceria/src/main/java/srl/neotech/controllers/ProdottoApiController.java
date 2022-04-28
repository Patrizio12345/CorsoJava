package srl.neotech.controllers;



import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import srl.neotech.model.SingletonDatiRosticceria;


import srl.neotech.requestresponse.ListaProdottiResponse;

import srl.neotech.requestresponse.RequestAddProdotto;
import srl.neotech.requestresponse.ResponseBase;


import srl.neotech.services.ProdottoServices;

@RestController
public class ProdottoApiController {

	@Autowired
	ProdottoServices prodottoServices;
	
	@ResponseBody
	@PostMapping(value = "/api/addProdotto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addProdotto(@RequestBody RequestAddProdotto request) {
		ResponseBase response =new ResponseBase();
		

		try {
			request.getProdotto().setId(UUID.randomUUID().toString());
			prodottoServices.addProdotto(request.getProdotto());
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
			
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "/api/listaProdotti",produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaProdottiResponse listaProdotti() {
	ListaProdottiResponse response=new ListaProdottiResponse();
	
	try {
		response.setListaProdotti(prodottoServices.listaProdotti());
		response.setCode("OK");
	} catch (Exception e) {
		response.setCode("KO");
		response.setDescr(e.getMessage());
	}
	
	return response;
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "/api/listaProdottiPerTipologia/{idTipologia}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaProdottiResponse listaProdotti(@PathVariable("idTipologia")String idTipologia    ) {
	ListaProdottiResponse response=new ListaProdottiResponse();
	
	try {
		response.setListaProdotti(prodottoServices.listaProdotti(idTipologia));
		response.setCode("OK");
	} catch (Exception e) {
		response.setCode("KO");
		response.setDescr(e.getMessage());
	}
	
	return response;
	}
	
	
	
	@ResponseBody
	@GetMapping(value ="/api/deleteProdotto/{idProdotto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaProdottiResponse delete (@PathVariable("idProdotto")String idProdotto) {
		ListaProdottiResponse response= new ListaProdottiResponse();
		
		
			SingletonDatiRosticceria.getInstance().getListino().removeIf(prodotto->prodotto.getId().equals(idProdotto));
			response.setListaProdotti(SingletonDatiRosticceria.getInstance().getListino());
			
			
		return response;
	}
	
	
	
	
	
	
	
	
	
}
