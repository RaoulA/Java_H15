package zusatzaufgabe;

import java.util.Scanner;

public class aufgabe03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double groesse = 0.0;
		double gewicht = 0.0;
		double bmi = 0;
		
		System.out.println("Geben Sie Gr�sse in Zentimeter ein: ");
		groesse = sc.nextDouble();
		System.out.println("Geben sie Ihr Gewicht in kg ein: ");
		gewicht = sc.nextDouble();
		
		bmi = gewicht / Math.pow(groesse/100, 2);
		
				
		
		System.out.print("Ihr BMI: " + Math.floor(bmi));
		
		if(bmi < 18.5){
			System.out.println(" Untergewicht");
		}
		else if (bmi > 18.5 && bmi <= 25){
			System.out.println(" Normalgewicht");
		}
		else if (bmi > 25 && bmi <= 30){
			System.out.println(" �bergewicht");
		}
		else if (bmi > 30){
			System.out.println(" Adipositas");
		}
	}
}
