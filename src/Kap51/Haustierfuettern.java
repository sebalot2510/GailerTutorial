package Kap51;

public class Haustierfuettern 
{
	public static void main(String[] args)
	{
		Katze a = new Katze("Minka", 5.0);
		
		Haustiere b = new Hund("Strolch", 5.0);
		
		a.fuettern();
		
		b.fuettern();
	}
}
