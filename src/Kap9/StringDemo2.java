package Kap9;

public class StringDemo2 
{
	public static void main (String[] args)
	{
		String str1, str2;
		int    len, len2;

		str1 = new String("    In einem Loch    in der Erde, da lebte ein Hobbit.   ");
		str2 = str1.trim();

		len = str1.length();
		len2 = str2.length();

		System.out.println("Die Laenge ist: " + len );
		System.out.println("Erster: " + str1);
		System.out.println("Zweiter:" + str2);
		System.out.println("Länge des Zweiten:" + len2 );

		  
	}
}
