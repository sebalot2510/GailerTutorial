package Kap10;

import java.util.Scanner;

public class Echo 
{
	public static void main(String[] args)
	{
		String inData;
		Scanner scan = 	new Scanner (System.in);
		
		System.out.println("Bitte geben Sie was ein:");
		inData = scan.nextLine();
		
		System.out.println("Das hast du eingeben: " + inData);
		
	}
}
