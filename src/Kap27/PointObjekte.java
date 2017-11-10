package Kap27;

import java.awt.*;
import java.util.*;

public class PointObjekte 
{
	public static void main(String[] args)
	{
		Point a,b;
		
		int x,y;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("x1:");
		x = scan.nextInt();
		System.out.print("y1:");
		y = scan.nextInt();
		
		a = new Point(x,y);
		
		System.out.print("x2:");
		x = scan.nextInt();
		System.out.print("y2:");
		y = scan.nextInt();
		
		b = new Point(x,y);
		
		System.out.println(a);
		System.out.println(b);
		
		if (a.equals(b))
			System.out.println("Gleich!");
		else
			System.out.println("Nicht gleich!");
				
	}
}