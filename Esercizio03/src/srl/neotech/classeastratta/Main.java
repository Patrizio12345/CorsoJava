package srl.neotech.classeastratta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Inserire il nome:");
	String nome=scanner.next();        //obbligo di scrittura in camel case
	System.out.print("Inserire indirizzo:"); //gli spazi vengono considerati errore!! chiedere possibile motivazione
	String indirizzo=scanner.next();      //l'errore non compare nell'immediato
	System.out.print("Inserire n° telefono:");   //segue concatenazione delle due string successive(t+b)same line
	String telefono=scanner.next();     //"Exception in thread "main" java.util.InputMismatchException" <==fail run
	System.out.print("Inserire valore di base:");    //riga 13 esce dall'esecuzione
	double base=scanner.nextDouble();
	System.out.print("Inserire il valore giornaliero:");
	int giorno=scanner.nextInt();
	
	scanner.close();                //valori in input/output non modificabili una volta lanciato lo scanner close
	                                //è possibile modificare la string 20 in modo da sostituire i valori inseriti 
	                                //in console?
	
	
	  Giornaliero giornaliero1=new Giornaliero(nome,indirizzo,telefono,base,giorno);
	 System.out.println(giornaliero1.toString());
	
	 
	
	 }
	
}
	
		
	
	
