package srl.neotech.prova;

public class Esercizioprova {

	public static void main(String[] args) {
		int a[]= {18,-21,36,-75,-32,68,-97,90,21,24};
		var somma=0;
		for(var i=0;i<a.length;i++) {
           if(a[i]>0) {
        	   somma=somma+a[i];
           }
           }
           System.out.print(somma);
	}
}
		
