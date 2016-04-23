package Tag3;

import java.util.Scanner;

public class Workshop2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Willkommen!\n");
		System.out.println("1. Hallo ausgeben");
		System.out.println("2. Witz erzählen");
		System.out.println("3. Programm beenden\n");
		int auswahl = 0;

		while (auswahl != 3) {
			System.out.println("Gewünschte Funktion? ");
			// sc.hasNextInt überprüft ob im Buffer die nächste Zhahl ist oder
			// eine
			// Buchstabe
			if (sc.hasNextInt()) {
				auswahl = sc.nextInt();
				if (auswahl == 1) {
					System.out.println("Hallo!\n");
				} else if (auswahl == 2) {
					System.out.println("Witz! Ha-ha!\n");
				} else {
					System.out.println("Program ist beendet.");
					return;
				}
			} else {
				System.out.println("Fehler: Sie haben keine Zahl eingegeben.");
			}
			sc.close();
		}
	}
}
