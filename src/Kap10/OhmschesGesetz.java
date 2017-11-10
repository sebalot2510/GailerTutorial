package Kap10;

import java.util.*;

public class OhmschesGesetz 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int u, r;
		double i;
		
		System.out.println("Bitte Spannung angeben");
		u = scan.nextInt();
		
		System.out.println("Bitte Widerstand angeben:");
		r = scan.nextInt();
		
		i = (u + 0.0) / r;
		
		System.out.println("Stromstärke ist:" + i);

	}
}
