package Kap46;

public class Uebung3 
{
	public static void main(String[] args)
	{
		int[] arrA = {13, -22, 82, 17};
		int[] arrB = {-12, 24, -79, -13};
		int[] summe = {0, 0, 0, 0};
		
		for(int i = 0; i < arrA.length; i++)
		{
			summe[i] = arrA[i] + arrB[i];
		}
		System.out.print("Summe: ");
		for (int i = 0; i <= summe.length -1; i++)
		{
			System.out.print(summe[i] + " ");
		}
		
	}
}
