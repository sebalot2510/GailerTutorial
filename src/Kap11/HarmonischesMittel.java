package Kap11;

import java.util.*;

public class HarmonischesMittel 
{
	public static void main(String[] args)
	{
		int zahl1,zahl2;
		double arith,harm;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Erste Zahl: ");
		zahl1= scan.nextInt();
		
		System.out.println("Zweite Zahl: ");
		zahl2= scan.nextInt();
		
		arith = (zahl1 + zahl2) / 2.0;
		harm = 2.0 / ( 1.0 / zahl1 + 1.0 / zahl2 );
		
		System.out.println("Arithmetisches Mittel: " + arith);
		System.out.println("Harmonisches Mittel: " + harm);
		
	}
}
