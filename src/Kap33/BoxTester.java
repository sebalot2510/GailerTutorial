package Kap33;

public class BoxTester 
{
	public static void main (String[] args)
	{
		Box box = new Box(2.5, 5.0, 6.0);
		
		System.out.println("Volumen: " + box.berechneVolumen());
		System.out.println("Fl�che: " + box.berechneFlaeche());
		
		System.out.println("H�he: " + box.getHoehe());
		System.out.println("Breite: " + box.getBreite());
		System.out.println("L�nge: " + box.getLaenge());
	}
}
