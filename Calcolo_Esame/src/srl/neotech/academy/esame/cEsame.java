package srl.neotech.academy.esame;

import java.util.Scanner;

public class cEsame {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Inserire voto prova scritta:");
		int scritto=scanner.nextInt();
		
		while(scritto<-8 || scritto>8){
			Scanner scanner1=new Scanner(System.in);
			System.out.print("ERRORE !!! Reinserire voto prova scritta(da -8 a +8:");
			int votoScritto=scanner1.nextInt();
			
		}
		
		
		Scanner scanner2=new Scanner(System.in);
		System.out.print("Inserire voto prova orale:");
		int orale=scanner.nextInt();
		
		while(orale<0 || orale>24){
			Scanner scanner3=new Scanner(System.in);
			System.out.print("ERRORE !!! Reinserire voto prova orale(da 0 a 24:");
			int votoOrale=scanner3.nextInt();
		
		}
		
		
		@SuppressWarnings("removal")
		Integer risultato=new Integer(orale+scritto);
		
		
		if(scritto<=0 && risultato>18) {
			System.out.println("Bocciato");    
		}
			else if(scritto<=0 && orale<18) {
				System.out.println("Bocciato");    
			}
		    else if (scritto>0 && risultato<18) {   
				System.out.println("Bocciato");
			}
		    else if (risultato.equals(31) || risultato.equals(32)) {     
				System.out.println("Congratulazioni:30 e lode!");
			}
		    else {
		    	System.out.println("Promosso con:"+risultato);     
		    }
		}
		
		
		
	}
	


