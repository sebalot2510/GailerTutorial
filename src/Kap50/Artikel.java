package Kap50;

public class Artikel
{
	//Instanzvariablen
	
	private String artikelnr;
	private String bezeichnung;
	private double einkaufspreis;
	private int lagerzeit;
	
	final double HANDELSSPANNE = 0.6;
	final double MWST = 0.19;
	
	public Artikel(String artikelnr, String bezeichnung, double einkaufspreis, int lagerzeit)
	{
		this.artikelnr = artikelnr;
		this.bezeichnung = bezeichnung;
		this.einkaufspreis = einkaufspreis;
		this.lagerzeit = lagerzeit;
	}
	
	public int berechneVerkaufspreis()
	{
		double z;
		int verkaufspreis;
		
		z = einkaufspreis;
		
		//System.out.println("z1:" + z);
		
		z += z * HANDELSSPANNE;
		
		//System.out.println("z2:" + z);
		
		z += z*MWST;
		
		//System.out.println("z3:" + z);
		
		
		verkaufspreis = (int) Math.floor(z);
		
		return verkaufspreis;
	}
	
	public void anzeigen()
	{
		System.out.print(artikelnr + ", " + bezeichnung + ", EK: " + einkaufspreis 
				+ ", VK: ");
		System.out.println(berechneVerkaufspreis() + ", Lagerzeit: " + lagerzeit );
	}
}