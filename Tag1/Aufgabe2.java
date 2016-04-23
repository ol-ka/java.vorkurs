package Tag1;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
//		System.out.println("Wie lautet dein Name?");
//		Scanner sc = new Scanner (System.in);
//		String name = sc.nextLine();
//		System.out.println("Hello " + name + "!");
//		
		Scanner sc = new Scanner (System.in);
		System.out.println("Wie lautet dein Name?");
		String name = sc.nextLine();
		System.out.println("Auf welcher Straße du wohnst?");
		String strasse = sc.nextLine();
		System.out.println("In welchem Ort du wohnst?");
		String ort = sc.nextLine();
		System.out.println("Gib dein Telefonnummer ein:");
		String tel_num = sc.nextLine();
		System.out.println("Gib dein Geburtsdatum ein:");
		String geb_datum = sc.nextLine();
		System.out.println("Wie alt bist du?");
		int alter = sc.nextInt();
		sc.close();
		
		System.out.print("\n\nName:\t\t" + name + "\n");
		System.out.println("Straße:\t\t" + strasse);
		System.out.println("Ort:\t\t" + ort);
		System.out.println("Telefonnummer:\t" + tel_num);
		System.out.println("Geburtsdatum:\t" + geb_datum);
		System.out.println("Alter:\t\t" + alter);
		
	}

}
