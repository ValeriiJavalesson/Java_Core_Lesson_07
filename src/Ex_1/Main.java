package Ex_1;

public class Main {

	public static void main(String[] args) {
		SU_27 s = new SU_27(27, 17, 15000, 1000, "white");
		
		s.startEngine();
		s.startFly();
		s.moveUP();
		s.moveLEFT();
		s.moveDOWN();
		s.moveRIGHT();
		s.stealthTechnology();
		s.nuclearStrike();
		s.turboAcceleration();
		s.endFly();
	}

}
