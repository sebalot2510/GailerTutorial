package Kap51;

abstract public class Haustiere 
{
	String name;
	double futtervorrat;
	int anzahlTage;
	
	public Haustiere(String name, double futtervorrat)
	{
		this.name = name;
		this.futtervorrat = futtervorrat;
	}
	
	public void fuettern()
	{
		sprich();
		while (futtervorrat > 0.0)
		{
			friss();
			anzahlTage++;
		}
		anzeigen();
		
		
	}
	
	public void anzeigen()
	{
		System.out.println("Der Vorrat reicht für " + anzahlTage + " Tage");
		
	}
	
	public abstract void friss();
	
	public abstract void sprich();
}
