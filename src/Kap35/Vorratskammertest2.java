package Kap35;

public class Vorratskammertest2 
{
	public static void main ( String[] args )
	  {
	    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
	    Marmelade erdbeer     = new Marmelade( "Erdbeer", "31.09.10", 8 );

	    Vorratskammer vorrat = new Vorratskammer( stachelbeer, erdbeer );
	    vorrat.ausgeben();

	    if ( vorrat.auswaehlen(1) )
	      vorrat.auftragen(2);
	    else
	      System.out.println("Auswahl nicht verfuegbar");
	    vorrat.ausgeben();

	    if ( vorrat.auswaehlen(3) )
	      vorrat.auftragen(2);
	    else
	      System.out.println("Auswahl nicht verfuegbar");
	    vorrat.ausgeben();

	  }
	}