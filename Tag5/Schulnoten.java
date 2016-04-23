package Tag5;

import java.util.Scanner;

public class Schulnoten {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Bitte die Zahl den Noten eingeben: ");
		int l = sc.nextInt();
		
		float[] meineNoten = new float[l];
		for (int i = 0; i < meineNoten.length; i++){
			 System.out.println("Bitte die Noten eingeben:");
			 meineNoten[i] = sc.nextFloat();
		 }
		
		System.out.println("Durchschnitt: " + durchSchnitt(meineNoten));
		
		sc.close();
	}

	public static float durchSchnitt(float[] meineNoten){
		float durchSchnitt = 0;
		 float nS = 0;
		 for (int i = 0; i < meineNoten.length; i++){
			 nS += meineNoten[i];
		 }
		 return durchSchnitt = nS / meineNoten.length;
	}

}
