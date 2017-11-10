package Kap10;

import java.util.Scanner;

public class CentDollar 
{
	public static void main (String[] args)
	{
		int input, cent, dollar;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cent angeben");
		input = scan.nextInt();
		dollar = input / 100;
		cent = input % 100;
		
		System.out.println("Das entspricht " + dollar + " Dollar und " + cent + " Cent." );
	}
}
