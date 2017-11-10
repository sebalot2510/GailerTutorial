package Kap30;

import java.util.*;

class HalloObjekt
{
	
	String mitteilung;
	
	HalloObjekt()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Mitteilung ein:");
		mitteilung = scan.nextLine();
	}
	
	HalloObjekt (String s)
	{
		this.mitteilung = s;
	}
	
	HalloObjekt (HalloObjekt o)
	{
		this.mitteilung = new String(o.mitteilung);
	}
  
	
	// Methodendefinition
  void sprich()
  {
	  int j = 0;
	  
	  while (j < mitteilung.length())
	  {
		  System.out.println(mitteilung);
		  
		  j= j+1;
	  }
  }
  
  void sprechen()
  {
	  System.out.println(mitteilung);
  }
  
  void abendgruss ()
  {
	  System.out.println("Guten Morgen Welt!");
  }
  
  void morgengruss()
  {
	  System.out.println("Guten Abend Welt");
  }
}