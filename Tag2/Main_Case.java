package Tag2;

import java.util.Scanner;

public class Main_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Hallo ausgeben");
		System.out.println("2. Zahl quadrieren");
		System.out.println("3. Zahl mit 0 vergleichen");
		System.out.println("4. Programm beenden");

		int punkt = 0;

		while (punkt != 4) {
			System.out.println("Geben Sie ein Zahl zwischen 1 und 4 einschlieslich:");
			punkt = sc.nextInt();
			if (punkt >= 1 & punkt <= 4) {
				switch (punkt) {
				case 1:
					System.out.println("Hallo!");
					break;
				case 2:
					System.out.println("Geben Sie eine Zahl ein:");
					int zahl = sc.nextInt();
					System.out.println("Ergebniss = " + (zahl * zahl));
					break;
				case 3:
					System.out.println("Geben Sie eine Zahl ein");
					int zahl2 = sc.nextInt();
					if (zahl2 < 0) {
						System.out.println("Die eingegebene Zahl ist kleiner als 0");
					} else if (zahl2 == 0) {
						System.out.println("Die Zahl ist 0");
					} else {
						System.out.println("Die eingegenene Zahl ist groesse als 0");
					}
					break;
				case 4:
					System.out.println("Programm ist beendet");
					return;
				}
			} else {
				System.out.println("Sie haben die falsche Zahl eingegeben!");
			}
		}
	}
}
