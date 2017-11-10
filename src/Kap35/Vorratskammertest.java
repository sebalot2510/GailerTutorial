package Kap35;

import java.util.*;

public class Vorratskammertest
{
	  public static void main ( String[] args )
	  {
	    Scanner scan = new Scanner(System.in);
	    int menueEingabe;
	    int unzen;
		  
		Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
	    Marmelade erdbeer     = new Marmelade( "Erdbeer", "30.09.10", 8 );
	    Marmelade aprikosen   = new Marmelade( "Aprikosen", "31.10.10", 16 );

	    Vorratskammer vorrat = new Vorratskammer( stachelbeer, erdbeer, aprikosen );
	    System.out.println("Willkommen zu Mutter Hubbards Vorratskammer");
	    menueEingabe = 0;
	    	    
	    
	    while (menueEingabe != -1)
	    {
	    	vorrat.ausgeben();
	    	System.out.println("Bitte treffen Sie die Auswahl (1, 2 oder 3). Exit: -1: ");
	    	menueEingabe = scan.nextInt();
	    	if ((menueEingabe == 1) || (menueEingabe == 2) || (menueEingabe == 3))
	    	{
	    		
	    		System.out.println("Geben Sie die Menge ein, die aufgetragen werden soll: ");
	    		unzen = scan.nextInt();
	    	
	    		vorrat.auswaehlen(menueEingabe);
	    		vorrat.auftragen(unzen);
	    	}
	    	else
	    	{
	    		if (menueEingabe == -1)
	    		{
	    			System.out.println("Tschüss!");
	    		}
	    		else
	    		{
	    			System.out.println("Bitte nochmal probieren!");
	    		}
	    	}
	    }
	    /*vorrat.auswaehlen(1);
	    vorrat.auftragen(2);
	    vorrat.ausgeben();

	    vorrat.auswaehlen(3);
	    vorrat.auftragen(4);
	    vorrat.ausgeben();*/
	   }
	}