package Tag4;

import java.util.Scanner;

public class Baum {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Gewünschte Höhe eingeben: ");
		int hoehe = sc.nextInt();
		baum(hoehe);
	}

	public static void baum(int hoehe) {
		int m = hoehe - 1;
		
		for (int h = 1; h <= hoehe; h++) {
			int s = 2 * h -1;
			for (int lz = 1; lz <= m; lz++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= s; l++) {
				System.out.print("*");
			}
			m--;
			System.out.print("\n");
		}
		
		for (int k = 1; k <= 2; k++){
			int b = hoehe - 1;
			for (int lz = 1; lz <= b; lz++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.print("\n");
		}
	}
}
