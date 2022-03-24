package srl.neotech.academy.casuali;

import java.util.Random;

public class DivisibilePerTre {

	public static void main(String[] args) {
	
		int r=(int)(Math.random()*(10)+1);
		System.out.println(r);
		while(r%3!=0) {
			 r=(int)(Math.random()*(10)+1);
			
			 System.out.println(r);
		}
		System.out.println("È uscito un numero divisibile per 3!!");
		

	}
	}





