package Tag3;

import java.util.Scanner;

public class Spiel2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie Ihr Name ein:");
		String spieler = sc.nextLine();
		String name = spieler;
		System.out.println("Geben die Farbe ein:");
		String farbe = sc.nextLine();
		sc.close();
		
		Wuerfel w1 = new Wuerfel(farbe);

		w1.spielerWuerfelt(name);
		
//		boolean status1 = w1.setAugenzahl(2);
//		System.out.println(status1);
//		
//		boolean status2 = w1.setAugenzahl(8);
//		System.out.println(status2);
	}
}
