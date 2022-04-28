package srl.neotech.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import srl.neotech.requestresponse.ListaOrdiniResponse;

import srl.neotech.requestresponse.RequestAddOrdine;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.OrdineServices;

@RestController
public class OrdineApiController {

	@Autowired
	OrdineServices ordineServices;
	
	@ResponseBody
	@PostMapping(value = "/api/addOrdine", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addOrdine(@RequestBody RequestAddOrdine request) {
		ResponseBase response =new ResponseBase();
		
		LocalDateTime oggettoData= LocalDateTime.now();
	    DateTimeFormatter formattaOggetto=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
	    String dataFormattata = oggettoData.format(formattaOggetto);
		
		
		try {
			request.getOrdine().setDataEora(dataFormattata);
			request.getOrdine().setId(UUID.randomUUID().toString());
			ordineServices.addOrdine(request.getOrdine());
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
			
		}
		
		
		return response;
	}
	
	
	@ResponseBody
	@GetMapping(value = "/api/listaOrdini",produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaOrdiniResponse listaOrdini() {
	ListaOrdiniResponse response=new ListaOrdiniResponse();
	
	try {
		response.setListaOrdini(ordineServices.listaOrdini());
		response.setCode("OK");
	} catch (Exception e) {
		response.setCode("KO");
		response.setDescr(e.getMessage());
	}
	
	return response;
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "/api/listaProdottiPerOrdine/{idProdottiPerOrdine}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaOrdiniResponse listaProdottiPerOrdine(@PathVariable("idProdottiPerOrdine")String idProdottiPerOrdine    ) {
	ListaOrdiniResponse response=new ListaOrdiniResponse();
	
	try {
		response.setListaOrdini(ordineServices.listaOrdini(idProdottiPerOrdine));
		response.setCode("OK");
	} catch (Exception e) {
		response.setCode("KO");
		response.setDescr(e.getMessage());
	}
	
	return response;
	}
	
	@ResponseBody
	@GetMapping(value ="/api/deleteOrdine/{idOrdine}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaOrdiniResponse delete (@PathVariable("idOrdine")String idOrdine) {
		ListaOrdiniResponse response= new ListaOrdiniResponse();
		
		
			SingletonDatiRosticceria.getInstance().getOrdini().removeIf(ordine->ordine.getId().equals(idOrdine));
			response.setListaOrdini(SingletonDatiRosticceria.getInstance().getOrdini());
			
			
		return response;
	}
	
	
}
