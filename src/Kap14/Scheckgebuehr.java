package Kap14;

import java.util.*;

public class Scheckgebuehr 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int giro, spar;
		
		System.out.println("Girokonto:");		
		giro = scan.nextInt();
		
		System.out.println("Sparkonto:");
		spar = scan.nextInt();
		
		if (giro > 1000 || spar > 1500 )
			System.out.println("Gebühr wird erhoben!");
		else
			System.out.println("Gebühr wird nicht erhoben!");

	}

}
