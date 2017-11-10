package Kap11;

import java.util.*;

public class Strom
{
	public static void main (String[] args)
	{
		double grundpreis, gesamtpreis; 
		int stunden;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie den Preis pro Killowattstunde ein: ");
		grundpreis = scan.nextDouble();
		
		System.out.println("Bitte geben Sie die Anzahl der Killowattstunden pro Jahr ein:");
		stunden = scan.nextInt();
		
		gesamtpreis = grundpreis * stunden / 100;
		System.out.println("Jahreskosten: " + gesamtpreis);
		
		
	}
}
