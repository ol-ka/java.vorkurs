package Tag3;

import java.util.Random;

public class Wuerfel {

		private int augenzahl;
		private String farbe;
		
//		Konstruktor
		public Wuerfel(String farbe){
			this.farbe = farbe;
		}
		
		public void werfen(){
			Random rnd = new Random();
			augenzahl = rnd.nextInt(6) + 1;
		}
		
		public boolean setAugenzahl(int augenzahl){
			if (augenzahl > 0 && augenzahl < 7){
				this.augenzahl = augenzahl;
				return true;
			} else {
				return false;
			}
		}
		
		public int getAugenzahl(){
			return augenzahl;
		}
		
		public void spielerWuerfelt(String name){
			werfen();
			getAugenzahlWorten();
			System.out.println("Spieler " +name+ " hat mit Würfel " +farbe+ " eine " +augenzahl+ " (" +getAugenzahlWorten()+ ") " + "gewürfelt.");
			
			if (augenzahl == 6) {
				System.out.println("Super! Eine 6!");
			} else {
				System.out.println("Schade! Vielleicht nechsten Mal!");
			}
		}
		
		public void setFarbe(String farbe){
			this.farbe = farbe;
		}
		
		public String getFarbe(){
			return farbe;
		}
		
		public String getAugenzahlWorten(){
			String wort = "";
			switch (augenzahl){
			case 1:
				wort = "eins";
				break;
			case 2:
				wort = "zwei";
				break;
			case 3:
				wort = "drei";
				break;
			case 4:
				wort = "vier";
				break;
			case 5:
				wort = "fünf";
				break;
			case 6:
				wort = "sechs";
				break;
			}
			return wort;
		}
}
