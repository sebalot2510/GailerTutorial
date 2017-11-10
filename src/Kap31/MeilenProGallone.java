package Kap31;

import java.util.Scanner;

class MeilenProGallone
{
  public static void main( String[] args )
  {
	  String eingabe;
	  
	  double startMeilen;
	  double endMeilen;
	  double gallonen;
	  double aktTacho;
	  
	  String typ;
	  
	  Scanner scan = new Scanner(System.in);
	  
	  //System.out.println("Anfangsmeilen:");
	  //startMeilen = scan.nextDouble();
	  
	  //System.out.println("Endmeilenstand:");
	  //endMeilen = scan.nextDouble();
	  
	  //System.out.println("Gallonen:");
	  //gallonen = scan.nextDouble();
	  
	  Auto auto = new Auto(0);
	
	  /*System.out.println( "Meilen pro Gallonen: " + auto.berechneMPG() );
	  if (auto.benzinschwein())
    	System.out.println("Benzinschwein");
	  else
    	if (auto.sparauto())
    		System.out.println("Sparauto");  */ // Erste Aufgabe
	  
	  eingabe = "n";
	  
	  while (!(eingabe.equals("j")))
	  {
		  typ = "nix";
		  
		  System.out.println("Tankestelle!");
		  System.out.println(eingabe);
		  
		  System.out.println("Aktueller Tachostand:");
		  aktTacho = scan.nextDouble();
		  
		  System.out.println("Gallonen:");
		  gallonen = scan.nextDouble();
		  
		  auto.auftanken(aktTacho, gallonen);
		  
		  if (auto.benzinschwein())
		    	typ = "Benzinschwein";
			  else
		    	if (auto.sparauto())
		    		typ = "Sparauto";
		  
		  System.out.println("Meilen pro Gallone: " + auto.berechneMPG() + " Typ:" + typ);
		  
		  System.out.print("Beenden? (j/n)");
		  
		  eingabe = scan.next();
	  }
	  
	  
  }
}