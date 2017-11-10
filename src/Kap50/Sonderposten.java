package Kap50;

public class Sonderposten extends Artikel
{
	double rabatt;
	
	public Sonderposten(String artikelnr, String bezeichnung, double einkaufspreis, int lagerzeit)
	{
		super (artikelnr, bezeichnung, einkaufspreis, lagerzeit);
		
		if (lagerzeit > 12)
			rabatt = 0.3;
		else
			rabatt = 0.1;
	}
	
	public int berechneVerkaufspreis()
	{
		int verkaufspreis;
		
		verkaufspreis =  (int) Math.floor (super.berechneVerkaufspreis() - super.berechneVerkaufspreis()* rabatt); 
		
		return verkaufspreis ;
	}
	
	public void anzeigen()
	{
		super.anzeigen();
		
		System.out.println("(VK <alt>: " + super.berechneVerkaufspreis() + ", Rabatt:" + rabatt);
	}
}
