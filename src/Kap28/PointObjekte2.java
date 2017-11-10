package Kap28;

import java.awt.*;

public class PointObjekte2 
{
	public static void main(String[] args)
	{
		Point a,b;
		int flaeche;
		
		a = new Point(10,10);
		b = new Point (30,30);
		
		flaeche = (Math.abs(a.x-b.x) * Math.abs(a.y - b.y));
		
		System.out.println("Fläche: " + flaeche);
		
		
	}
}
