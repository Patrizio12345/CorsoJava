package srl.neotech.academy.casuali;





public class Casuali {


	public static void main(String[] args) {
	//Scrivere un programma Java10_01 che stampi a video 10 numeri casuali compresi fra 1 e 10 (estremi inclusi)
	//usare la libreria Math
		
		
		int min=1;
		int max=10;
		for(int i=min;i<=max;i++) {
			int r=(int)(Math.random()*(max-min)+min);
			System.out.println(r);
		
		
		}

		}

	}

	
		
	


