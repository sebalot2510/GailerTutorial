package Kap33;

public class BoxTester 
{
	public static void main (String[] args)
	{
		Box box = new Box(2.5, 5.0, 6.0);
		
		System.out.println("Volumen: " + box.berechneVolumen());
		System.out.println("Fläche: " + box.berechneFlaeche());
		
		System.out.println("Höhe: " + box.getHoehe());
		System.out.println("Breite: " + box.getBreite());
		System.out.println("Länge: " + box.getLaenge());
	}
}
