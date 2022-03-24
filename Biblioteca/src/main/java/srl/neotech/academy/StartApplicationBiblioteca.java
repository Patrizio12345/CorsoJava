package srl.neotech.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;
import org.kohsuke.randname.RandomNameGenerator;

public class StartApplicationBiblioteca {

	public static void main(String[] args) {
		
		
		Biblioteca biblioteca=new Biblioteca();
		
		RandomNameGenerator rnd = new RandomNameGenerator(0);

		NameGenerator namegenerator = new NameGenerator();
		List<Name> names = namegenerator.generateNames( 5000 );
		
		Random random=new Random();
		

		
		
		for(int i=1;i<=100;i++) {
		Libro libro=new Libro();
		libro.setIdLibro(i);
		libro.setTitolo(rnd.next());
		libro.setAutore(namegenerator.generateName().toString());
		libro.setGenere(Genere.generateRandomGenere());
		libro.setScaffale("{Poesia,Epica,Narrativa}");
		biblioteca.getListaLibri().add(libro);
		}
		for(int i=1;i<=100;i++) {
			Associato associato=new Associato();
			associato.setIdAssociato(i);
			associato.setNominativo(namegenerator.generateName().toString());
			associato.setStato(Stato.generateRandomStato());
			associato.setListaIdLibriPresi(null);
		    biblioteca.getListaAssociati().add(associato);
			}
		String controllo="XX";
		String funzione = null;
	
		
		do {
		
		Scanner scanFunzione=new Scanner(System.in);
		System.out.println("[Inserire comando appropriato per la rispettiva funzione]:");
		String comando=scanFunzione.next();
		
		
		switch (comando) { 
		case "CL": 
			Libro libro=new Libro();
			funzione="[CL] = {CLASSIFICARE LIBRO}";//aggiunta libro
			libro.setIdLibro(biblioteca.getListaLibri().size()+1);
            biblioteca.getListaLibri().add(libro);
			controllo="CL";
			System.out.println(funzione);
			break;
		case "XL":
			funzione="[XL] = {RIMUOVERE LIBRO}";
			controllo="XL";
			System.out.println("[QUALE LIBRO DESIDERA RIMUOVERE id]:");
			Scanner scan=new Scanner(System.in);
			int eliminaLibro=scan.nextInt();
			biblioteca.getListaLibri().get(eliminaLibro-1).setIdLibro(0);
			System.out.println(funzione);
			break;
		case "LL":
			funzione="[LL] = {LISTA LIBRI}";
			Integer lunghezzaArrayLibri=biblioteca.getListaLibri().size();
			controllo="LL";
		for(int i=0;i<lunghezzaArrayLibri;i++) {
			if((int) (biblioteca.getListaLibri().get(i).getIdLibro())==0){
			}else {
			libro=biblioteca.getListaLibri().get(i);
			System.out.println(libro);
			}
			}
			break;
		case "IA":
			funzione="[IA] = {ISCRIVERE ASSOCIATO}";
			Associato associato=new Associato();
			associato.setIdAssociato(biblioteca.getListaAssociati().size()+1);
			biblioteca.getListaAssociati().add(associato);
			controllo="IA";
			System.out.println(funzione);
			break;
		case "XA":
			funzione="[XA] = {CANCELLARE ASSOCIATO}";
			controllo="XA";
			System.out.println("[QUALE ASSOCIATO DESIDERA RIMUOVERE id]:");
			scan=new Scanner(System.in);
			int rimuoviAssociato=scan.nextInt();
			biblioteca.getListaAssociati().get(rimuoviAssociato-1).setIdAssociato(0);
			System.out.println(funzione);
			break;
		case "LA":
			funzione="[LA] = {LISTA ASSOCIATI}";
			controllo="LA";
			Integer lunghezzaArrayAssociati=biblioteca.getListaAssociati().size();
			for(int i=0;i<lunghezzaArrayAssociati;i++) {
				if((int) (biblioteca.getListaAssociati().get(i).getIdAssociato())==0){
			}else {
				associato=biblioteca.getListaAssociati().get(i);
			System.out.println(associato);
				}
			}
			break;
		case "PL":
			funzione="[PL] = {PRESO LIBRO}";
			controllo="PL";
			libro=new Libro();
			associato=new Associato();
			
            System.out.println("[INDICARE QUALE LIBRO DESIDERA PRENDERE DALLA LIBRERIA DIGITALE id]:");
            scan=new Scanner(System.in);
            int  prendereLibro=scan.nextInt();
            Integer presoLibro=associato.getListaIdLibriPresi();
         
         
            lunghezzaArrayLibri=biblioteca.getListaLibri().size();
            for(int i=1;i<lunghezzaArrayLibri;i++) {
            	
            	biblioteca.getListaLibri().get(prendereLibro-1).setIdLibro(0);
                
            	//biblioteca.getListaIdLibripresi().add(prendereLibro+1);
                
             
            }
            
            
            
            
            
            System.out.println(funzione);
			
			break;
		case "RL":
			funzione="[RL] = {RESTITUZIONE LIBRO}";
			controllo="RL";
			System.out.println(funzione);
			break;
		case "XX":
			funzione="[XX] = {USCITA}";
			controllo="XX";
			break;
			
		default:
			try {
				throw new IllegalArgumentException("[ERROR!!!][COMANDO NON VALIDO]"+comando);
			} catch (Exception e) {
				System.out.println("[ERRORE DI COMPUTAZIONE.INPUT NON LEGALE]");
			}
			
		}
		
	}while(!(controllo.equals("XX")));
	System.out.println("[PROGRAMMA TERMINATO]");
	
	}
	
		
	
		
		
	
		
	}	   


