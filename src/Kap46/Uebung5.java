package Kap46;

public class Uebung5 
{
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 2, 3, 4};
		int temp;
		
		System.out.println( "Urspruengliches Array: "
		        + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] );
		
		for (int i = 0; i < ((arr.length) / 2); i++)
		{
			temp = arr[arr.length - i - 1];
			arr[arr.length - i -1 ] = arr[i];
			arr[i] = temp;
			
		}

		System.out.println( "Umgekehrtes Array: "
		        + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] );
	}
}
