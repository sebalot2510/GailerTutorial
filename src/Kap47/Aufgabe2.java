package Kap47;

public class Aufgabe2 
{
	public static void main(String[] args)
	{
		int[] array = {3, 1, 5, 7, 4, 12, -3, 8, 9};
		
		int groesste;
		int zweitgroesste;
		
		if (array[0] >= array[1])
		{
			groesste = array[0];
			zweitgroesste = array[1];
		}
		else
		{
			groesste = array[1];
			zweitgroesste = array[0];
		}
		
		for (int index = 2; index < array.length; index++ )
		{
			if (array[index] >= groesste)
			{
				zweitgroesste = groesste;
				groesste = array[index]; 
			}
			else
			{
				if (array[index] > zweitgroesste)
				{
					zweitgroesste = array[index];
				}
			}
		}
		System.out.println("Größtes Element: " + groesste + '\n' + "Zweitgrößtes Element: " + zweitgroesste);
	}
}
