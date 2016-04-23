package Tag3_VisitenKarte;

import java.util.Scanner;

public class Verwaltung {
	
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Bitte Anzahl Visitkarten eingeben: ");
		int anzahl = sc.nextInt();
		sc.nextLine();

		VisitenKarte[] karte = new VisitenKarte[anzahl];

		for (int i = 0; i < karte.length; i++) {
			VisitenKarte vk = new VisitenKarte();
			karte[i] = vk;
			
			System.out.println("Geben Sie bitte Ihre Daten ein.");
			System.out.println("Vorname eingeben: ");
			vk.vorname = sc.nextLine();
//			System.out.println("Nachname eingeben: ");
//			vk.nachname = sc.nextLine();
//			System.out.println("Straße eingeben: ");
//			vk.strasse = sc.nextLine();
//			System.out.println("Hausnummer eingeben: ");
//			vk.hausnum = sc.nextInt();
//			sc.nextLine();
//			System.out.println("Postleizahl eingeben: ");
//			vk.post = sc.nextInt();
//			sc.nextLine();
//			System.out.println("Ort eingeben: ");
//			vk.ort = sc.nextLine();
//			System.out.println("Telefonnummer eingeben: ");
//			vk.telefone = sc.nextLine();
//			System.out.println("Geburtsdatum eingeben: ");
//			vk.geb_datum = sc.nextLine();
			System.out.println("Alter eingeben: ");
			vk.alter = sc.nextInt();
			sc.nextLine();
		}
		printKarte(karte);
		sc.close();
	}

	public static void printKarte(VisitenKarte[] karte){
		System.out.println("Nummer der gewünschte Karte eingeben: ");
		int i = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n\n--------------------------------");
		System.out.println("Name:\t\t" + karte[i-1].nachname + " " + karte[i-1].vorname);
		System.out.println("Adresse:\t" + karte[i-1].strasse + " " + karte[i-1].hausnum);
		System.out.println("Ort:\t\t" + karte[i-1].post + " " + karte[i-1].ort);
		System.out.println("Telefonnummer:\t" + karte[i-1].telefone);
		System.out.println("Geburtsdatum:\t" + karte[i-1].geb_datum);
		System.out.println("Alter:\t\t" + karte[i-1].alter);
		System.out.println("--------------------------------");
	}
}
