package Tag2;

import java.util.Scanner;
import java.util.Random;

public class Wuerfelspiel_geld {

	public static void main(String[] args) {
		// Scanner initialization
		Scanner sc = new Scanner(System.in);
		System.out.println("Herzlich willkommen beim Wuerfelspiel");
		// Daten von dem Spieler
		System.out.println("Bitte Name eingeben:");
		String name = sc.nextLine();
		System.out.println("Bitte Geldbetrag eingeben:");
		int betrag = sc.nextInt();
		int auszahl = 0;
		int gewinn = 0;

		// Zufallszahlengenerator - Random
		Random rnd = new Random();
		int augenzahl1 = 0;
		int augenzahl2 = 0;
		
		System.out.println(name + " Bitte würfeln! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;
		
		int summe = augenzahl1 + augenzahl2;
		
		if (summe == 12){
			auszahl = betrag * 4;
			
		} else if (summe == 11){
			auszahl = betrag * 3;
			gewinn = auszahl - betrag;
			System.out.println("Sie haben gewonnen!\nIhre Ergebnisse sind: Augensumme - "+summe+", Auszahlung - "+auszahl+", Gewinn - "+gewinn);
		} else if (summe == 10){
			auszahl = betrag * 2;
			gewinn = auszahl - betrag;
			System.out.println("Sie haben gewonnen!\nIhre Ergebnisse sind: Augensumme - "+summe+", Auszahlung - "+auszahl+", Gewinn - "+gewinn);
		} else if (summe == 7 || summe == 8 || summe == 9){
			auszahl = betrag;
			gewinn = auszahl - betrag;
			System.out.println("Sie haben nichts gewonnen!\nIhre Ergebnisse sind: Augensumme - "+summe+", Auszahlung - "+auszahl+", Gewinn - "+gewinn);
		} else {
			auszahl = 0;
			gewinn = auszahl - betrag;
			System.out.println("Sie haben verloren!\nIhre Ergebnisse sind: Augensumme - "+summe+", Auszahlung - "+auszahl+", Gewinn - "+gewinn);
		}
		
		
	}

}
