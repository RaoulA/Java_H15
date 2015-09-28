package buch.kap.vier;

import java.util.*;

public class Aufgabe_4_20 {
	public static void main(String[] args){
		
		double i = 3;
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		for(i = 0; i < 2*n; i++){
			System.out.println("Resultat: " + 1/(2*i+1));
		}
		
		
		
	}
	
}
