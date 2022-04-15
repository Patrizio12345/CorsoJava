package srl.neotech.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.MovimentoBancomat;
import srl.neotech.model.SingletonMovimentoBancomat;
import srl.neotech.model.TipologiaMovimento;
import srl.neotech.requestresponse.EliminaMovimentoRequest;
import srl.neotech.requestresponse.ListaMovimentiResponse;



@Controller
public class ViewController {

	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
	
	
	@RequestMapping(value="/bank", method = RequestMethod.GET)
	public String bank() {
		return "home";
	}
	
	@RequestMapping(value="/vers", method = RequestMethod.GET)
	public String vers() {
		
		return "versamenti";
	}
	
	@RequestMapping(value="/prel", method = RequestMethod.GET)
	public String prel() {
		return "prelievo";
	}

		
	@RequestMapping(value="/generaMovimenti", method = RequestMethod.GET)
	public String generaMovimenti(Model model) {
	
	
		NameGenerator namegenerator = new NameGenerator();
		List<Name> names = namegenerator.generateNames( 5000 );
		
		
		
		
		for(int i=0;i<30;i++) {
			MovimentoBancomat movimento=new MovimentoBancomat();
			
			LocalDateTime myDateObj= LocalDateTime.now();
		    DateTimeFormatter myFormtObj=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		    String formattedDate = myDateObj.format(myFormtObj);  
			
			movimento.setId(UUID.randomUUID().toString());
			movimento.setDataEora(formattedDate);
			movimento.setConto(ThreadLocalRandom.current().nextInt(1, 100000 + 1));
			movimento.setNominativo(namegenerator.generateName().toString());
			movimento.setOperazione(TipologiaMovimento.generateRandomOperazione());
			movimento.setQuantita(ThreadLocalRandom.current().nextInt(1, 100000 + 1));
			movimento.setTaglio(ThreadLocalRandom.current().nextInt(1, 50 + 1));
			movimento.setTotale(null);
			
			SingletonMovimentoBancomat.getInstance().getListaMovimenti().add(movimento);
				
		}
		
		model.addAttribute("generaMov",SingletonMovimentoBancomat.getInstance().getListaMovimenti().size());
		
		return "genera_movimenti";
	}
	
	@RequestMapping(value="/elimina-movimento", method = RequestMethod.GET)
	public String eliminaMovimento(@ModelAttribute EliminaMovimentoRequest movimentoDaEliminare, Model model) {
		SingletonMovimentoBancomat.getInstance().getListaMovimenti().removeIf(movimento->movimento.getId().equals(movimentoDaEliminare.getId()));
		ListaMovimentiResponse response=new ListaMovimentiResponse();
		response.setListaMovimentiRestituiti(SingletonMovimentoBancomat.getInstance().getListaMovimenti());
		model.addAttribute("moveWay", response);
		return "lista_movimenti";
	}
	
	
	
	
	
	
	@RequestMapping(value="/listamovimenti", method = RequestMethod.GET)
	public String listamovimenti(Model model) {
		ListaMovimentiResponse response=new ListaMovimentiResponse();
		response.setListaMovimentiRestituiti(SingletonMovimentoBancomat.getInstance().getListaMovimenti());
		model.addAttribute("moveWay", response);
		return "lista_movimenti";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
