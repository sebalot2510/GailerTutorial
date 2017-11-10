package Kap20;

import java.util.*;

public class ZufallRaten {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int zufallszahl, eingabe, zaehler;
		
		System.out.println("Ich denke an eine Zahl von 1 - 10");
		System.out.println("Sie haben 3 Versuche die Zahl zu erraten");
		System.out.println("Raten Sie!");
		
		zaehler = 1;
		
		zufallszahl = rand.nextInt(10) + 1;
		System.out.println("Zufallszahl (aus Testgründen): " + zufallszahl);
		eingabe = 0;
		
		while (eingabe != zufallszahl && zaehler <= 3)
		{
			System.out.print(zaehler + ". Versuch: ");
			eingabe = scan.nextInt();
			
			zaehler = zaehler + 1;
			
			if (eingabe == zufallszahl)
				System.out.println("Richtig! Sie haben gewonnen!");
			else
			{
				System.out.println("Falsch");
				if (zaehler == 4)
					System.out.println("Spiel verloren!");
			}
			

		}
		
	

	}

}
