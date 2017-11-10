package Kap46;

public class Uebung1 
{
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 2, 3};
		
		int summe = arr[0] + arr[1] + arr[2] + arr[3];
		
		System.out.println("Summer aller Zahlen: " + summe);
		
		int summe2 = 0;
		for (int i=0; i < (arr.length ); i++)
		{
			summe2 += arr[i];
		}
		
		System.out.println("Summe mit Schleife: " +summe2);
	}
}
