package Kap10;

import java.util.Scanner;

public class Kreisflaeche 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int radius;
		
		double flaeche;
		
		System.out.println("Radius: ");
		
		radius = scan.nextInt();
		
		flaeche = Math.PI * radius * radius;
		
		System.out.println("Fläche:" + flaeche);
	}
}
