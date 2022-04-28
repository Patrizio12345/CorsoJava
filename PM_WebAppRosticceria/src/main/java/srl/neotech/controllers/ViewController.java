package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home() {
		return "homeBlank";
	}
	
	@RequestMapping(value = "/listaOrdini",method = RequestMethod.GET)
	public String listaOrdini() {
		return "lista_ordini";
	}
	
	
	
}
