package Kap11;

import java.util.*;

public class Stein 
{
	public static void main(String[] args)
	{
		final double g = 9.81;
		
		double weg, zeit;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Anzahl der Sekunden ein:");
		zeit = scan.nextDouble();
		
		weg = (double)1/2 * g * zeit * zeit;
		System.out.println("Der Weg beträgt: " + weg + " Meter");
	}
}
