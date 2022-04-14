package srl.neotech.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.MovimentoBancomat;
import srl.neotech.model.SingletonMovimentoBancomat;
import srl.neotech.requestresponse.RequestSearchMovimento;
import srl.neotech.requestresponse.ResponseSearchMovimento;

@RestController
public class APIController {

	
	@RequestMapping(value = "/api/hello")
	public String hello() {
		return "Ciaoooo!";
	}
	
	
	@ResponseBody
	@PostMapping(value = "/api/movimento_search", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchMovimento search(@RequestBody RequestSearchMovimento request) {
		SingletonMovimentoBancomat.getInstance().getListaMovimenti().add(request.getMovimentazione());
		
		LocalDateTime oggettoData= LocalDateTime.now();
	    DateTimeFormatter formattaOggetto=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
	    String dataFormattata = oggettoData.format(formattaOggetto);
		
		request.getMovimentazione().setId(UUID.randomUUID().toString());
		request.getMovimentazione().setDataEora(dataFormattata);
		request.getMovimentazione().setConto(ThreadLocalRandom.current().nextInt(1, 100000 + 1));
		
		ResponseSearchMovimento response= new ResponseSearchMovimento();
		response.setMovimentiSearchResponse(SingletonMovimentoBancomat.getInstance().getListaMovimenti());
		
		
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
