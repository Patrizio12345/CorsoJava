package srl.neotech.academy.morraC;

import java.util.Scanner;

public class Morra_Cinese {

	public static void main(String[] args) {
	    
		
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("G1:");
	    String giocatore1 = scanner.next();
	    System.out.print("G2:");
	    String giocatore2 = scanner.next();
	    
	    if (giocatore1.equals(giocatore2))
	      System.out.println("Pari");
	    else if (giocatore1.equals("sasso") && giocatore2.equals("forbice")
	             || giocatore1.equals("carta") && giocatore2.equals("sasso")
	             || giocatore1.equals("forbice") && giocatore2.equals("carta"))
	     
	    	System.out.println("WIN G1");
	    else
	      System.out.println("WIN G2");


	}

}
