package srl.neotech.academy;


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
			funzione="[CL] = {CLASSIFICARE LIBRO}";
			libro.setIdLibro(biblioteca.getListaLibri().size()+1);
			libro.setTitolo(rnd.next());
			libro.setAutore(namegenerator.generateName().toString());
			libro.setGenere(Genere.generateRandomGenere());
			libro.setScaffale("{Poesia,Epica,Narrativa}");
			biblioteca.getListaLibri().add(libro);
			controllo="CL";
			System.out.println("[LIBRO AGGIUNTO CON SUCCESSO!]:"+libro);
			System.out.println(funzione);
			break;
			
			
		case "XL":
			funzione="[XL] = {RIMUOVERE LIBRO}";
			controllo="XL";
			libro=new Libro();
			libro.setTitolo(rnd.next());
			libro.setAutore(namegenerator.generateName().toString());
			libro.setGenere(Genere.generateRandomGenere());
			libro.setScaffale("{Poesia,Epica,Narrativa}");
			
			System.out.println("[QUALE LIBRO DESIDERA RIMUOVERE id]:");
			Scanner scan=new Scanner(System.in);
			int eliminaLibro=scan.nextInt();
			biblioteca.getListaLibri().get(eliminaLibro-1).setIdLibro(0);
			System.out.println("[LIBRO RIMOSSO CON SUCCESSO!]"+eliminaLibro+libro);
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
			associato.setNominativo(namegenerator.generateName().toString());
			associato.setStato(Stato.generateRandomStato());
			associato.setListaIdLibriPresi(null);
			biblioteca.getListaAssociati().add(associato);
			controllo="IA";
			System.out.println("[ISCRIZIONE EFFETTUATA CON SUCCESSO!··BENVENUTO NUOVO UTENTE!]:"+associato);
			System.out.println(funzione);
			break;
			
			
		case "XA":
			funzione="[XA] = {CANCELLARE ASSOCIATO}";
			controllo="XA";
			associato=new Associato();
			System.out.println("[QUALE ASSOCIATO DESIDERA RIMUOVERE id]:");
			scan=new Scanner(System.in);
			int rimuoviAssociato=scan.nextInt();
			biblioteca.getListaAssociati().get(rimuoviAssociato-1).setIdAssociato(0);
			associato.setNominativo(namegenerator.generateName().toString());
			associato.setStato(Stato.generateRandomStato());
			associato.setListaIdLibriPresi(associato.getListaIdLibriPresi());
			System.out.println("[ASSOCIATO RIMOSSO!]:"+rimuoviAssociato+associato);
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
			funzione="[PL] = {PRENDERE LIBRO}";
			controllo="PL";
			LibroPresoDaAssociato libroPresoDaAssociato=new LibroPresoDaAssociato();
			System.out.println("[INDICARE  id ASSOCIATO PERSONALE]:");
            scan=new Scanner(System.in);
            int  idAssociatoPersonale=scan.nextInt();
           
            libroPresoDaAssociato.setIdAssociato(idAssociatoPersonale);
            
            System.out.println(biblioteca.getListaAssociati().get(idAssociatoPersonale-1)+"[INDICARE QUALE LIBRO DESIDERA PRENDERE DALLA LIBRERIA DIGITALE id]:");
            scan=new Scanner(System.in);
            int  prendereLibro=scan.nextInt();
            
            
            while(biblioteca.getListaLibri().get(prendereLibro-1).getIdLibro()==0) {
            	System.out.println("[LIBRO NON DISPONIBILE!]");
            	System.out.println("[INDICARE QUALE LIBRO DESIDERA PRENDERE DALLA LIBRERIA DIGITALE id]:");
                scan=new Scanner(System.in);
                prendereLibro=scan.nextInt();

            }
            libroPresoDaAssociato.setIdLibro(prendereLibro);
            biblioteca.getListaLibroPresoDaAssociato().add(libroPresoDaAssociato);
            
            biblioteca.getListaLibri().get(prendereLibro-1).setIdLibro(0); 
            
           
            System.out.println("[HAI PRESO IL LIBRO]:"+biblioteca.getListaLibri().get(prendereLibro-1).getTitolo());
 
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


