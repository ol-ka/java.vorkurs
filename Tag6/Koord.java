package Tag6;

import java.util.Random;
import java.awt.Point;

public class Koord {
	static Random rnd;

	public static void main(String[] args) {
		
		rnd = new Random();
		int x = rnd.nextInt();
		int y = rnd.nextInt();
		
		Point p = new Point(x, y);
		
		System.out.println("Koordinaten sind: "+ p);
		
		move(p.x);
		System.out.println("Koordinaten nach move(int x) Methode: "+ p);
		
		move(p);
		System.out.println("Koordinaten nach move(Point p) Methode: "+ p);
	}
	
	public static void move(int x) {
		x += rnd.nextInt();
	}
	
	public static void move(Point p){
		p.x += rnd.nextInt();
	}
}
