package Kap15;

import java.util.*;

public class SchleifeWort 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String wort, wort1, wort2;
		
		int ende; 
		int zaehler = 1;
		
		System.out.println("Bitte geben Sie ein Wort ein:");
		wort = scan.nextLine();
		
		while (zaehler <= wort.length())
		{
			System.out.println(wort);
			zaehler = zaehler + 1;
		}
		
		System.out.println("Bitte geben Sie das erste Wort ein:");
		wort1 = scan.nextLine();
		
		System.out.println("Bitte geben Sie das zweite Wort ein:");
		wort2 = scan.nextLine();
		
		zaehler = wort1.length();
		
		System.out.print(wort1);
		
		while ((zaehler <30 - wort2.length()))
		{
			System.out.print(".");
			zaehler = zaehler + 1;
		}

			System.out.print(wort2);
		
	}
	
	
}
