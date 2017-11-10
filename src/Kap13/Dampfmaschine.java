package Kap13;

import java.util.*;

public class Dampfmaschine 
{
	public static void main(String[] args)
	{
		double tLuft, tDampf;
		
		double effizienz = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lufttemperatur: ");
		
		tLuft = scan.nextDouble();
		
		System.out.print("Dampftemperatur: ");
		
		tDampf = scan.nextDouble();
		
		if (tDampf >= 373.0)
			effizienz = 1 - (tLuft / tDampf);
		System.out.println("Die Effizienz beträgt: " + effizienz);
		
		
	}
}
