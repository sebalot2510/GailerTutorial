package Kap10;

import java.util.Scanner;

public class Wechselgeld 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int wechselgeld, dollar, quarter, dime, nickel, rest;
		
		System.out.println("Wechselgeld in Cent: ");
		wechselgeld = scan.nextInt();
		
		dollar = wechselgeld / 100;
		rest  = wechselgeld % 100;
		quarter = rest / 25;
		rest = rest % 25;
		dime = rest / 10;
		rest = rest % 10;
		nickel = rest / 5;
		rest = rest % 5;
		
		System.out.println("Das Wechselgeld ist " + dollar + " Dollar, " + quarter + " Quarter, " + dime +  " Dime, " + nickel + " Nickel, " + rest + " Cent");
		
		
		
	}
}
