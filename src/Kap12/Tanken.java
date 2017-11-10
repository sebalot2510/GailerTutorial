package Kap12;

import java.util.*;

public class Tanken 
{
	public static void main(String[] args)
	{
		final int max = 200; // 200 Meilen bis zur nächsten Tankstelle
		int inhalt, anzeige, verbrauch;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tankkapazität:");
		inhalt = scan.nextInt();
		
		System.out.println("Anzeige");
		anzeige = scan.nextInt();
		
		System.out.println("Verbrauch");
		verbrauch = scan.nextInt();
		
		if ( (double )((inhalt * anzeige / 100) / verbrauch) < 200 )
		{
			System.out.println("Tanken!");
		}
		else
		{
			System.out.println("Weiterfahren");
		}
	}
}
