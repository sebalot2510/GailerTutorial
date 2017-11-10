package Kap46;

public class Uebung2 
{
	public static void main(String[] args)
	{
		int[] arr = {13, -4, 82, 17};
		int[] doppelt;
		
		System.out.println("Ursprüngliches Array: " 
				+ arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] );
		
		doppelt = new int[4];
		
		for (int i = 0; i < arr.length ; i++)
		{
			doppelt[i] = 2* arr[i];
		}
		System.out.println("Das neue Array: "
				+ doppelt[0] + " " + doppelt[1] + " " + doppelt[2] + " " + doppelt[3] );
	}
}
