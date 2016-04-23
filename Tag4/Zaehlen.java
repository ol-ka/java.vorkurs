package Tag4;

import java.util.Scanner;

public class Zaehlen {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Eine Zahl eingeben:");
		int zaehler = sc.nextInt();
		sc.nextLine();
		zBZuR(zaehler);
		
		System.out.println("Eine gewünschte Zahl eingeben:");
		int zahl = sc.nextInt();
		sc.nextLine();
		System.out.println("Die Fakultät von " + zahl + " ist " + fakultaet(zahl));
		sc.close();
	}

	public static void zBZuR(int zaehler){
		int zahl = 1;
		do{
			System.out.println(zahl);
			zahl++;
		}while (zahl < zaehler);
		
		System.out.println("Ich komme!\n");
	}
	
	public static int fakultaet(int zahl){
		int f = 1;
		
//		int z = 1;
//		do{
//			f = f * z;
//			z++;
//		} while (z <= zahl);
//		return f;
		
		for (int z = 1; z <= zahl; z++){
			f = f * z;
		}
		return f;
	}
}
