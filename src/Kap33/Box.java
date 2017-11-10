package Kap33;

import java.util.*;

public class Box 
{
	//Instanzvariablen
	
	private double breite, hoehe, laenge, seite;
	
	//Konstruktoren
	
	public Box(double breite, double hoehe, double laenge)
	{
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
	}
	
	public Box(double seite)
	{
		
	}
	
	//Instanzmethoden
	
	public double berechneVolumen()
	{
		return (breite*hoehe*laenge);
	}
	
	public double berechneFlaeche()
	{
		return (2* ( berechneFlaecheOben() + berechneFlaecheSeitlich() + berechneFlaecheVorn() ) );
	}
	
	private double berechneFlaecheVorn()
	{
		return ( breite * hoehe);
	}
	
	
	private double berechneFlaecheOben()
	{
		return (breite * laenge);
	}
	
	private double berechneFlaecheSeitlich()
	{
		return (laenge * hoehe);
	}
	//get-Methoden
	
	public double getHoehe()
	{
		return hoehe;
	}
	
	public double getBreite()
	{
		return breite;
	}
	
	public double getLaenge()
	{
		return laenge;
	}
}
