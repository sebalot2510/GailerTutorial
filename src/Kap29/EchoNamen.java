package Kap29;

import java.util.*;

public class EchoNamen 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String name;
		String vorname, nachname;
		
		int z;
		
		System.out.println("Vorname + Familienname eingeben: ");
		name = scan.nextLine();
		
		z = 0;
		
		while (!(name.charAt(z) == (' ')))
		{
			
			z = z+1;
		}
		
		vorname = name.substring(0,z);
		nachname = (name.substring(z+1)).toUpperCase();
		
		System.out.println(vorname + " " + nachname);
		
	}
}
