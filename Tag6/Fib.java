package Tag6;

import java.util.Scanner;

public class Fib {
	static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Geben Sie bitte n ein: ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Rekursiv: Fibonacci-Folge von " + n + ": ");
		int erg = fibRekursiv(n);
		System.out.println(erg);
		System.out.print("Interativ: Fibonacci-Folge von " + n + ": ");
		int ergeb = fibInterativ(n);
		System.out.println(ergeb);

	}

	public static int fibRekursiv(int zahl) {
		int fz;
		if (zahl == 0) {
			return 0;
		} else if (zahl == 1) {
			return 1;
		} else {
			fz = fibRekursiv(zahl - 1) + fibRekursiv(zahl - 2);
		}
		return fz;
	}

	public static int fibInterativ(int zahl) {
//		if (zahl == 0)
//			return 0;
//		else if (zahl == 1)
//			return 1;

		int[] fzi = new int[zahl + 1];
		for (int i = 0; i <= zahl; i++) {
			if (i == 0)
				fzi[i] = 0;
			else if (i == 1)
				fzi[i] = 1;
			else {
				fzi[i] = fzi[i - 1] + fzi[i - 2];
			}
		}
		return fzi[zahl];
	}
}
