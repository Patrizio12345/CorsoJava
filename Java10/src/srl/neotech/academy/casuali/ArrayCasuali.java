package srl.neotech.academy.casuali;

import java.lang.reflect.Array;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayCasuali {

	public static void main(String[] args) {
		
		ArrayList<Integer>casuali=new ArrayList<Integer>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("1° numero:");
		int p=scanner.nextInt();
		
		Scanner scanner1=new Scanner(System.in);
		System.out.print("2° numero:");
		int s=scanner.nextInt();
		
		//Random random=new Random();
		
		for(int i=0;i<=10;i++) {
			int r=(int)(Math.random()*(s-p)+p);
			casuali.add(r);
			
			
	}
		System.out.println("random number:"+casuali);

	}

}