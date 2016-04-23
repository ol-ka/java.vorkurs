package Tag6;

import java.util.Scanner;

public class Fakultaet {
	static Scanner sc;
	public static void main(String[] args) {
		
		System.out.println("Geben Sie bitte n ein: ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int erg = fakultaet(n);
		System.out.println("Fakultät von " + n + " = " + erg);
	}

	public static int fakultaet(int x){
		int f;
		if (x == 0){
			return 1;
		} else {
			f = fakultaet(x - 1) * x;
		}
		return f;
	}
}