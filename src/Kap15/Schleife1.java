package Kap15;

import java.util.*;

public class Schleife1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int anfang, ende, zaehler;
		
		System.out.println("Anfang:");
		anfang = scan.nextInt();
		
		System.out.println("Ende");
		ende = scan.nextInt();
		System.out.println("");
		
		zaehler = anfang;
		
		while (zaehler <= ende)
		{
			System.out.println(zaehler);
			zaehler = zaehler + 1;
		}
	}
}
