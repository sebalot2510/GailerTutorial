package Kap13;

import java.util.*;

public class Mikrowelle 
{
	public static void main(String[] args)
	{
		double erhitzungszeit;
		int anzahl;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Erhitzungszeit in Sekunden: ");
		
		erhitzungszeit = scan.nextInt();
		
		System.out.print("Anzahl Posten: ");
		
		anzahl = scan.nextInt();
		
		if (anzahl == 1)
			System.out.println("Erhitzungszeit: " + erhitzungszeit + " Sekunden");
		if (anzahl == 2)
			System.out.println("Erhitzungszeit: " + (erhitzungszeit * 1.5) + " Sekunden");
		if (anzahl == 3)
			System.out.println("Erhitzungszeit: " + (erhitzungszeit * 2) + " Sekunden");
		if (anzahl > 3)
			System.out.println("Zu viele Posten");
	}
}
