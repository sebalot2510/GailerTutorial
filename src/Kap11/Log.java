package Kap11;

import java.util.*;

public class Log 
{
	public static void main(String[] args)
	{
		double  eingabe, ergebnis;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gib ein Double ein: ");
		eingabe = scan.nextDouble();
		
		ergebnis = Math.log(eingabe) / Math.log(2);
		
		System.out.println("Ergebnis: " + ergebnis);
		
	}
}
