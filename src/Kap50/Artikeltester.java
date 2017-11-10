package Kap50;

public class Artikeltester 
{
	public static void main(String[] args)
	{
		Artikel a = new Artikel("Nummer","Bezeichung",10,3);
		
		a.anzeigen();
		
		Artikel b = new Artikel("Nummer","Bezeichung",55,15);
		
		b.anzeigen();
		
		Sonderposten s = new Sonderposten("Nummer", "Bezeichnung", 55, 15);
		
		s.anzeigen();
	}
}
