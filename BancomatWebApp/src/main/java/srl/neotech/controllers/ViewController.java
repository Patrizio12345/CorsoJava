package srl.neotech.controllers;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.MovimentoBancomat;



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
//	@RequestMapping(value="/registrazioneMovimenti", method = RequestMethod.POST)
//	public String registrazioneMovimenti(@ModelAttribute("operazione")MovimentoBancomat dati, Model model ) {
//		System.out.println(dati.getNominativo());
//		
//		ArrayList<MovimentoBancomat>listaMovimenti= new ArrayList<MovimentoBancomat>();
//		for(int i=0;i<10;i++) {
//			MovimentoBancomat movimento= new MovimentoBancomat();
//			movimento.setId(UUID.randomUUID().toString());
//			movimento.setDataEora(null);
//			movimento.setNominativo("xxx");
//			movimento.setOperazione(null);
//			movimento.setQuantita(null);
//			movimento.setTaglio(null);
//			movimento.setTotale(null);
//			listaMovimenti.add(movimento);
//		}
//		
//		UUID.randomUUID().toString();
//		MovimentoBancomat movimentoDaCancellare=new MovimentoBancomat();
//		movimentoDaCancellare.setId("ID"+1);
//		listaMovimenti.remove(movimentoDaCancellare);
//		
//	//	model.addAttribute("listaMovimenti",listaMovimenti );
		
	@RequestMapping(value="/registrazioneMovimenti", method = RequestMethod.GET)
	public String registrazioneMovimenti(Model model) {
	
		ArrayList<MovimentoBancomat>listaMovimenti=new ArrayList<MovimentoBancomat>();
		for(int i=0;i<10;i++) {
			MovimentoBancomat movimento=new MovimentoBancomat();
			movimento.setId(UUID.randomUUID().toString());
			movimento.setDataEora(null);
			movimento.setNominativo("xxx");
			movimento.setOperazione(null);
			movimento.setQuantita(null);
			movimento.setTaglio(null);
			movimento.setTotale(null);
			listaMovimenti.add(movimento);
			
			
		}
		
		
		model.addAttribute("listaMovimenti",listaMovimenti);
		
		
		return "lista_movimenti";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
