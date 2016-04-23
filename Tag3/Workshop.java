package Tag3;

public class Workshop {

	public static void main(String[] args) {
		int temperatur = 30;
		boolean sonne = true;
		boolean regen = true;
		if (!regen || (sonne == true &&  temperatur > 32)){
			System.out.println("Ich gehe nach draußen!");
		}
		else if (regen == true){
			System.out.println("Ich benötige einen Regenschirm");
		}
	}

}
