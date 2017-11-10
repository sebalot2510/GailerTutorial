package Kap12;

import java.util.*;

public class DiscountPreis 
{
	public static void main (String[] args)
	{
		final double rabatt = 0.1;
		int preis;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie den Preis in Cent ein:");
		preis = scan.nextInt();
		
		if (preis <= 1000)
		{
			System.out.println("Sorry! Kein Rabatt");
			System.out.println("Bitte zahlen Sie: " + preis);
		}
		else
		{
			System.out.println("Juhuuu! Rabatt!");
			System.out.println("Bitte zahlen Sie: " + (preis - preis*rabatt));
			
		}
		System.out.println("Schönen Tag!");
	}
}
