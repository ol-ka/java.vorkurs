package Tag5;

import java.util.Scanner;

public class Fakultaet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N:");
		int n = sc.nextInt();
		
		double h = 0;
		int z = 1;
		
		for (int i = 1; i <= n; i++){
//			int z = 1;
			
			h = h + 1.0 / z;
			z++;
		}
		
//		while (z <= n){
//			h = h + 1.0 / z;
//			z++;
//		}
		System.out.println("Hn = " + h);
	}

}
