package Kap13;

import java.util.Scanner;

public class FantasySpiel 
{
	public static void main(String[] args)
	{
		int staerke, gesundheit, glueck;
		
		String name;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Willkommen zu Spiel!");
		
		System.out.println("Bitte geben Sie den Namen des Spielers ein:");
		
		name = scan.nextLine();
		
		System.out.println("St�rke eingeben (1-10):");
		staerke = scan.nextInt();
		
		System.out.println("Gesundheit eingeben (1-10):");
		gesundheit = scan.nextInt();
		
		System.out.println("Gl�ck eingeben (1-10):");
		glueck = scan.nextInt();
		
		if ((staerke + glueck + gesundheit) >= 15)
		{
			System.out.println("Sie haben zu viele Punkte vergeben!");
			staerke = 5;
			glueck = 5;
			gesundheit = 5;
		}
		System.out.println(name +", " + "St�rke: " + staerke + ", " + "Gesundheit: " + gesundheit + ", " + "Gl�ck: " + glueck); 
	}
}
