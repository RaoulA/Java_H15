import java.util.*;


public class SimpleRechner {
	
	public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	//Die zwei int-Werte einlesen
	
	System.out.print("Erste Zahl: ");
	int a = sc.nextInt();
	System.out.print("Zweite Zahl: ");
	int b = sc.nextInt();
	
	//Addieren
	int summe = a + b;
	
	System.out.print("Summe: " + summe);
	
	
	}
}
