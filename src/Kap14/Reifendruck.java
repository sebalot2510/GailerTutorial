package Kap14;

import java.util.*;

public class Reifendruck 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int vr, vl, hr, hl;
		
		boolean druckOK = true;
		
		System.out.println("Reifendruck : rechter Vorderreifen:");
		vr = scan.nextInt();
		if (! (vr >= 35 && vr <= 45))
		{
			System.out.println("WARNUNG!");
			druckOK = false;
		}
		
		System.out.println("Reifendruck : linke Vorderreifen:");
		vl = scan.nextInt();
		if (! (vl >= 35 && vl <= 45))
		{
			System.out.println("WARNUNG!");
			druckOK = false;
		}
		
		System.out.println("Reifendruck : rechter Hinterreifen:");
		hr = scan.nextInt();
		if (! (hr >= 35 && hr <= 45))
		{
			System.out.println("WARNUNG!");
			druckOK = false;
		}
		
		System.out.println("Reifendruck : rechter Hinterreifen:");
		hl = scan.nextInt();
		if (! (hl >= 35 && hl <= 45))
		{
			System.out.println("WARNUNG!");
			druckOK = false;
		}
		
		if (vr == vl && hr == hl && druckOK)
			System.out.println("OK!");
		else
			System.out.println("Nicht OK!");
		
	}
}
