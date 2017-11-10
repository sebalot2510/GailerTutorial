package Kap12;

import java.util.*;

public class Bestellung 
{
	public static void main (String[] args)
	{
		final int preisSchraube = 5, preisMutter = 3, preisScheibe = 1;
		int anzahlSchraube, anzahlMutter, anzahlScheibe, gesamtpreis;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Anzahl Schrauben: ");
		anzahlSchraube = scan.nextInt();
		
		System.out.println("Anzahl Muttern: ");
		anzahlMutter = scan.nextInt();
		
		System.out.println("Anzahl Scheiben: ");
		anzahlScheibe = scan.nextInt();
		
		gesamtpreis = anzahlSchraube * preisSchraube + anzahlMutter * preisMutter 
						+ anzahlScheibe * preisScheibe;
		
		System.out.println();
		if (anzahlSchraube != anzahlMutter)
		{
			System.out.println("Bitte überprüfen Sie Ihre Bestellung");
			
		}
		else
		{
			System.out.println("Bestellung okay!");
		}
		System.out.println();
		System.out.println("Gesamtbetrag: " + gesamtpreis);
		
		
		
	}
}
