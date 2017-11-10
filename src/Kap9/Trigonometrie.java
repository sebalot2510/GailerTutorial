package Kap9;

public class Trigonometrie
{
	public static void main(String[] args)
	{
		double zahl, sinx, cosx, ergebnis, grad;
		
		grad = 30.0;
		
		zahl = grad * Math.PI / 180;
		
		sinx = Math.sin(zahl);
		cosx = Math.cos(zahl);
		ergebnis = (sinx*sinx) + (cosx*cosx);
		
		System.out.println("Sinus: " + sinx + " Cosinus: " + cosx + " Ergebnis: " + ergebnis );
	}
}
