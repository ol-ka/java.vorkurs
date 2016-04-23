package Tag2;

import java.util.Scanner;
import java.util.Random;

public class Wuerfelspiel {

	public static void main(String[] args) {
		// Scanner initialization
		Scanner sc = new Scanner(System.in);
		System.out.println("Herzlich willkommen beim Wuerfelspiel");
		// Daten von dem Spieler 1
		System.out.println("Spieler 1, bitte Name eingeben:");
		String name1 = sc.nextLine();
		int punkt1 = 0;
		// Daten von dem Spieler 2
		System.out.println("Spieler 2, bitte Name eingeben:");
		String name2 = sc.nextLine();
		int punkt2 = 0;

		// Zufallszahlengenerator - Random
		Random rnd = new Random();
		int augenzahl1 = 0;
		int augenzahl2 = 0;

		// Spieler 1
		System.out.print(name1 + " Bitte würfeln, um Runde 1 zu spielen! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;

		System.out.println(name1 + "Sie haben " + augenzahl1 + " und " + augenzahl2 + " gewürfelt.");
		if (augenzahl1 + augenzahl2 == 3) {
			punkt1++;
			System.out.println("Juhu " + name1 + " Sie haben ein Maschen gewürfelt");
		}
		System.out.println(name1 + " Ihr aktuellee Punktstand beträgt: " + punkt1 + " Punkte\n");

		// Spieler 2
		System.out.print(name2 + " Bitte würfeln, um Runde 1 zu spielen! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;

		System.out.println(name2 + "Sie haben " + augenzahl1 + " und " + augenzahl2 + " gewürfelt.");
		if (augenzahl1 + augenzahl2 == 3) {
			punkt2++;
			System.out.println("Juhu " + name2 + " Sie haben ein Maschen gewürfelt");
		}
		System.out.println(name2 + " Ihr aktuellee Punktstand beträgt: " + punkt2 + " Punkte\n");

		// Spieler 1
		System.out.print(name1 + " Bitte würfeln, um Runde 2 zu spielen! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;

		System.out.println(name1 + "Sie haben " + augenzahl1 + " und " + augenzahl2 + " gewürfelt.");
		if (augenzahl1 + augenzahl2 == 3) {
			punkt1++;
			System.out.println("Juhu " + name1 + " Sie haben ein Maschen gewürfelt");
		}
		System.out.println(name1 + " Ihr aktuellee Punktstand beträgt: " + punkt1 + " Punkte\n");

		// Spieler 2
		System.out.print(name2 + " Bitte würfeln, um Runde 2 zu spielen! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;

		System.out.println(name2 + "Sie haben " + augenzahl1 + " und " + augenzahl2 + " gewürfelt.");
		if (augenzahl1 + augenzahl2 == 3) {
			punkt2++;
			System.out.println("Juhu " + name2 + " Sie haben ein Maschen gewürfelt");
		}
		System.out.print(name2 + " Ihr aktuellee Punktstand beträgt: " + punkt2 + " Punkte\n");

		// Spieler 1
		System.out.print(name1 + " Bitte würfeln, um Runde 3 zu spielen! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;

		System.out.println(name1 + "Sie haben " + augenzahl1 + " und " + augenzahl2 + " gewürfelt.");
		if (augenzahl1 + augenzahl2 == 3) {
			punkt1++;
			System.out.println("Juhu " + name1 + " Sie haben ein Maschen gewürfelt");
		}
		System.out.println(name1 + " Ihr aktuellee Punktstand beträgt: " + punkt1 + " Punkte\n");

		// Spieler 2
		System.out.print(name2 + " Bitte würfeln, um Runde 3 zu spielen! (Enter clicken)");
		sc.nextLine();
		// Würfeln
		augenzahl1 = rnd.nextInt(6) + 1;
		augenzahl2 = rnd.nextInt(6) + 1;

		System.out.println(name2 + "Sie haben " + augenzahl1 + " und " + augenzahl2 + " gewürfelt.");
		if (augenzahl1 + augenzahl2 == 3) {
			punkt2++;
			System.out.println("Juhu " + name2 + " Sie haben ein Maschen gewürfelt");
		}
		System.out.println(name2 + "Ihr aktuellee Punktstand beträgt: " + punkt2 + " Punkte\n");
		
		System.out.println("Das Spiel ist beendet!");
		
		if (punkt1 > punkt2){
			System.out.println(name1 + " hat gewonnen!");
		}else if (punkt2 > punkt1){
			System.out.println(name2 + " hat gewonnen!");
		} else {
			System.out.println("Es steht unentschieden.");
		}
	}

}
