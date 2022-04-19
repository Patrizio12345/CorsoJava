package srl.neotech.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.MovimentoBancomat;
import srl.neotech.model.SingletonMovimentoBancomat;

import srl.neotech.model.TipologiaMovimento;
import srl.neotech.requestresponse.RequestSearchMovimento;
import srl.neotech.requestresponse.ResponseSearchMovimento;

@RestController
public class APIController {

	

	
	
	@ResponseBody
	@PostMapping(value = "/api/movimento_add", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchMovimento search(@RequestBody RequestSearchMovimento request) {
		
		
		LocalDateTime oggettoData= LocalDateTime.now();
	    DateTimeFormatter formattaOggetto=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
	    String dataFormattata = oggettoData.format(formattaOggetto);
		
		request.getMovimentazione().setId(UUID.randomUUID().toString());
		request.getMovimentazione().setDataEora(dataFormattata);
	   
		
	    SingletonMovimentoBancomat.getInstance().getListaMovimenti().add(request.getMovimentazione());
	    
         
		Integer valoreSaldo= new Integer(0);
		for(MovimentoBancomat mov: SingletonMovimentoBancomat.getInstance().getListaMovimenti()) {
			if(mov.getOperazione().equals(TipologiaMovimento.VERSAMENTO.toString())) valoreSaldo=valoreSaldo+(mov.getQuantita()*mov.getTaglio());
		    if( mov.getOperazione().equals(TipologiaMovimento.PRELIEVO.toString() )) valoreSaldo=valoreSaldo-(mov.getQuantita()*mov.getTaglio());
//		    if( mov.getOperazione().equals(TipologiaMovimento.PRELIEVO.toString().compareTo(valoreSaldo.toString())>valoreSaldo )) {
//		    	mov.getOperazione().equals(TipologiaMovimento.PRELIEVO.toString().equals(0));
//		    }else {
//		    	 valoreSaldo=valoreSaldo-(mov.getQuantita()*mov.getTaglio());
//			}
		}
		
		
		ResponseSearchMovimento response= new ResponseSearchMovimento();
		response.setMovimentiSearchResponse(SingletonMovimentoBancomat.getInstance().getListaMovimenti());
		
		
		return response;
	}
	
	@ResponseBody
	@GetMapping(value ="/api/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchMovimento delete (@PathVariable("id")String idMovimento) {
		ResponseSearchMovimento response= new ResponseSearchMovimento();
		
		
			SingletonMovimentoBancomat.getInstance().getListaMovimenti().removeIf(movimentazione->movimentazione.getId().equals(idMovimento));
			response.setMovimentiSearchResponse(SingletonMovimentoBancomat.getInstance().getListaMovimenti());
			
			
		
		
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
}
