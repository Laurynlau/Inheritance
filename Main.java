package inheritancePractice;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Animals A = new Animals();
		Lion L = new Lion();
		Hippo H = new Hippo();
		Seagull S = new Seagull();
		
		L.sound();
		H.swims();
		S.flys();

	}

}
