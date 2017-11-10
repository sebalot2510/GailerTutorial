package Kap21;

import java.util.*;

public class Plaetzchen 
{

	String sorte;
	String groesse;
	String form;
	boolean verzierungjanein;
	
	public void ausgeben()
	{
		String s;
		
		if (verzierungjanein)
			s = "ja";
		else
			s = "nein";
		
		System.out.println("Sorte: " + sorte + ", Größe: " + groesse + ", Form: " + form + ", Verzierung: " + s );
			
	}
	
	public static void main(String[] args)
	{
		Plaetzchen p1 = new Plaetzchen();
		Plaetzchen p2 = new Plaetzchen();
		Plaetzchen p3 = new Plaetzchen();
		
		p1.sorte = "Kokos";
		p1.groesse = "mittel";
		p1.form = "rund";
		p1.verzierungjanein = true;
		
		p2.sorte = "Affennuss";
		p2.groesse = "klein";
		p2.form = "rund";
		p2.verzierungjanein = true;
		
		p3.sorte = "Honigkuchen";
		p3.groesse = "groß";
		p3.form = "rechteckig";
		p3.verzierungjanein = false;
		
		p1.ausgeben();
		p2.ausgeben();
		p3.ausgeben();
	}
	
}
