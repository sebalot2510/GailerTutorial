package Kap13;

import java.util.*;

public class Bestellung 
{
	public static void main (String[] args)
	{
		final double expresszuschlag = 5.0;
		
		double preis, gesamtpreis, versand; 
		
		double zuschlag;
		
		Scanner scan = new Scanner(System.in);
		
		String artikel;
		
		System.out.print("Bitte geben Sie den Artikel ein: ");
		
		artikel = scan.nextLine();
		
		System.out.print("Bitte geben Sie den Preis ein: ");
		
		preis = scan.nextDouble();
		
		if (preis >= 10)
			zuschlag = 3.0;
		else
			zuschlag = 2.0;
		
		System.out.print("Expressversand (0 == nein, 1 ==j a): ");
		
		if (scan.nextInt() == 0)
			versand = zuschlag;
		else
			versand = zuschlag + expresszuschlag;
		
		gesamtpreis = preis + versand;
		
		System.out.println(artikel + ": " + preis);
		System.out.println("Versand: "+ versand);
		System.out.println("Gesamt: " + gesamtpreis);
		
		
		
	}
}
