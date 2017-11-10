package Kap47;

public class Aufgabe1 
{
	public static void main(String[] args)
	{
		int[] array = {3, 2, 5, 7, 9, 12, 97, 24, 54};
		
		int summe = 0;
		int summeGerade = 0;
		int summeUngerade = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
				summeGerade += array[i];
			else
				summeUngerade += array[i];
			
			summe += array[i];
		}
		
		System.out.println("Summe: " + summe + "\n" 
				+ "ungerade Summe: " + summeUngerade 
				+ "\n" + "gerade Summe: " + summeGerade);
	}
}
