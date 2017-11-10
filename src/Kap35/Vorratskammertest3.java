package Kap35;

public class Vorratskammertest3 
{
	  public static void main ( String[] args )
	  {
	    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
	    Marmelade erdbeer     = new Marmelade( "Erdbeer", "31.09.10", 8 );
	    Marmelade aprikosen   = new Marmelade( "Aprikosen", "31.10.10", 16 );

	    Vorratskammer vorrat  = new Vorratskammer( stachelbeer, erdbeer, aprikosen );
	    vorrat.ausgeben();

	    Marmelade kirsch      = new Marmelade( "Kirsch", "01.07.09", 11 );

	    vorrat.ersetzen( kirsch, 3 );
	    vorrat.ausgeben();
	  }
	}