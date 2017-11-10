package Kap18;

import java.util.*;

public class Bereiche 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int innenSumme, aussenSumme, eingabe;
		
		int obergrenze, untergrenze;
		
		System.out.println("Bereich addieren");
		
		System.out.println("Grenze des unteren Bereichs: ");
		untergrenze = scan.nextInt();
		
		System.out.println("Grenze des oberen Bereichs: ");
		obergrenze = scan.nextInt();
		
		innenSumme = 0;
		aussenSumme = 0;
		
		System.out.println ("Daten eingeben: ");
		eingabe = scan.nextInt();
		
		if (eingabe != 0)
		{
			if (eingabe > obergrenze || eingabe < untergrenze)
				aussenSumme = eingabe;
			else
				innenSumme = eingabe;
				
			while (eingabe != 0)
			{
				System.out.println("Daten eingeben: ");
				eingabe = scan.nextInt();
				
				if (eingabe > obergrenze || eingabe < untergrenze)
					aussenSumme = aussenSumme + eingabe;
				else
					innenSumme = innenSumme + eingabe;
				
			}
		
			System.out.println("Summe der Werte innerhalb des Bereichs: " + innenSumme);
			System.out.println("Summer der Werte ausserhalb des Bereichs: " + aussenSumme);
		}
		else
		{
			System.out.println("keine Lust!?");
		}

	}

}
