package Kap31;

import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto(double startMeilen)
  {
	  this.startMeilen = startMeilen;
	  
  }
  
  Auto(double startTacho, double endTacho, double galls)
  {
    startMeilen = startTacho;
    endMeilen   = endTacho;
    gallonen    = galls;
  }

  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen ;
  }
  
  boolean benzinschwein()
  {
	  return (berechneMPG() < 15.0);
  }
  
  boolean sparauto()
  {
	  return (berechneMPG() > 30);
  }
  
  void auftanken(double aktTacho, double gallonen)
  {
	  this.endMeilen = aktTacho - endMeilen;
	  this.gallonen = gallonen;
  }

}