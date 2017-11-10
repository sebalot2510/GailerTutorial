package Kap35;

public class Vorratskammer
{
	  // Instanzvariablen
	  private Marmelade  glas1;
	  private Marmelade  glas2;
	  private Marmelade  glas3;
	  private Marmelade  glasAusgewaehlt;

	  // Konstruktor
	  public Vorratskammer( Marmelade glas1, Marmelade glas2, Marmelade glas3 )
	  {
	    this . glas1    = glas1;
	    this . glas2    = glas2;
	    this . glas3    = glas3;
	    glasAusgewaehlt = null;
	  }
	  
	  public Vorratskammer(Marmelade glas1)
	  {
		  this.glas1 = glas1;
		  this.glas2 = null;
		  this.glas3 = null;
	  }
	  
	  public Vorratskammer(Marmelade glas1, Marmelade glas2)
	  {
		  this.glas1 = glas1;
		  this.glas2 = glas2;
		  this.glas3 = null;
	  }

	  // Methoden
	  public void ausgeben()
	  {
	    System.out.println("Die Vorratsksammer enthält: ");
		  
		if (glas3 == null)
		{
			if (glas2 == null)
			{
				System.out.print("1: "); glas1 . ausgeben();
			    
			}
			else
			{
				System.out.print("1: "); glas1 . ausgeben();
			    System.out.print("2: "); glas2 . ausgeben();
			}
		}
		else
		{
			System.out.print("1: "); glas1 . ausgeben();
		    System.out.print("2: "); glas2 . ausgeben();
		    System.out.print("3: "); glas3 . ausgeben();
		}
	    
	  }

	  // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder 3
	  public boolean auswaehlen( int glasNummer )
	  {
	    if ( glasNummer == 1 && glas1 != null )
	    {
	    	glasAusgewaehlt =  glas1;
	    	return true;
	    }
	    else
	    {
	    	if ( glasNummer == 2 && glas2 != null )
	    	{
	    		glasAusgewaehlt = glas2;
	    		return true;
	    	}
	    	else
	    	{
	    		if (glas3 != null)
	    		{
	    			glasAusgewaehlt = glas3;
	    			return true;
	    		}
	    		else
	    		{
	    			return false;
	    		}
	    	}
	    }	
	  }

	  // Auftragen der ausgewählten Marmelade
	  public void auftragen( int unzen  )
	  {
	    glasAusgewaehlt . auftragen( unzen  );
	  }
	  
	  public void ersetzen(Marmelade m, int slot)
	  {
		  if (slot == 1)
		  {
			  glas1 = m;
		  }
		  else
			  if (slot == 2)
				  glas2 = m;
			  else
				  glas3 = m;
	  }
	}
