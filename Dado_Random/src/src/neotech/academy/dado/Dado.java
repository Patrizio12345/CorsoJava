package src.neotech.academy.dado;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		
		Random dado=new Random();
		int lancio=dado.nextInt(6)+1;
		System.out.println(lancio);
		
		String res="";
		
	    switch(lancio) {
		
		case 1:
			res="miss";
			
			break;
			
			
		case 2:
			res="One shoot one kill  [Ucciso]";
			
			break;
			
		case 3:
			res="danno raddoppiato"; // (Crit)=forza base+danno base*2
			
			break;
			
		case 4:
			res="disarm";
			
			break;
			
		case 5:
			res="miss";
			
		    break;
		    
		case 6:
			res="abilità speciale";// f.b+d.b+new abilità+applicazioni sul bersaglio(diseas,blooding,poison)
		   
			break;
	    }
		
System.out.println(res);
	}

}
