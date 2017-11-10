package Kap10;

import java.util.Scanner;

public class EchoQuadrat 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int zahl, quadrat;
		
		System.out.println("Zahl eingeben! ");
		
		zahl = scan.nextInt();		
		quadrat = zahl*zahl;
		
		System.out.println("Zahl: " + zahl + " Quadrat: " + quadrat);
		
	}
}
