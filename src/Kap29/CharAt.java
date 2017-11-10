package Kap29;

import java.util.*;

public class CharAt 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String s;
		
		int z = 0;
		
		System.out.println("Ein Zeichen pro Zeile");
		
		System.out.print("String angeben: ");
		s = scan.nextLine();
		
		while (z < s.length())
		{
			System.out.println(s.charAt(z));
			z = z+1;
		}
		
		
		
	}
}
