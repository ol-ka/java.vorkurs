package Tag2;

import java.util.Scanner;

public class bedingte_anweisung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("1. Hallo ausgeben");
		System.out.println("2. Zahl quadrieren");
		System.out.println("3. Zahl mit 0 vergleichen");
		System.out.println("4. Programm beenden");
		
		System.out.println("Geben Sie ein Zahl zwischen 1 und 4 einschlieslich:");
		int punkt = sc.nextInt();
		if (punkt > 0 & punkt < 4){ 
			if (punkt == 1){
				System.out.println("Hallo!"); 
			} else if (punkt == 2){
				System.out.println("Geben Sie eine Zahl ein:");
				int zahl = sc.nextInt();
				System.out.println("Ergebniss = " + (zahl*zahl));
			} else if (punkt == 3){
				System.out.println("Geben Sie eine Zahl ein");
				int zahl2 = sc.nextInt();
				if (zahl2 < 0){
					System.out.println("Die eingegebene Zahl ist kleiner als 0");
				} else if (zahl2 == 0){
					System.out.println("Die Zahl ist 0");
				} else{
				System.out.println("Die eingegenene Zahl ist groesse als 0");
				}
			} else if (punkt == 4) {
				System.out.println("Programm ist beendet");
				return;
			}
		} else{
			System.out.println("Sie haben die falsche Zahl eingegeben!");
		}
	}

}
