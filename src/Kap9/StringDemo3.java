package Kap9;

public class StringDemo3 
{
	public static void main (String[] args)
	{
		String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt

	    String sub = str.substring(0,28); // erzeuge ein neues Objekt aus dem Original

	    System.out.println( sub );
	    System.out.println("La�nge: " + str.length());

	}
}
