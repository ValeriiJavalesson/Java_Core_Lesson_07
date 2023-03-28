package Ex_1;

public class SU_27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike{
	int maxSpeed;
	String planeColor;
	
	SU_27(int width, int length, int weight, int maxSpeed, String planeColor) {
		super(width, length, weight);
		this.maxSpeed = maxSpeed;
		this.planeColor = planeColor;
	}
	
	AircraftControl aircraftControl = new AircraftControl();
	
	void moveUP() {
		System.out.println("Літак переміщується вгору на "+aircraftControl.moveUP()+" км");
	}
	void moveDOWN() {
		System.out.println("Літак переміщується вниз на "+aircraftControl.moveDOWN()+" км");
	}
	void moveLEFT() {
		System.out.println("Літак переміщується ліворуч на "+aircraftControl.moveLEFT()+" км");
	}
	void moveRIGHT() {
		System.out.println("Літак переміщується праворуч на "+aircraftControl.moveRIGHT()+" км");
		
	}
	
	@Override
	public void turboAcceleration() {
		int maxSpeed = (int)(Math.random()*(this.maxSpeed+500));
		while(maxSpeed<=this.maxSpeed) {
			maxSpeed = (int)(Math.random()*(this.maxSpeed+500));
		}
		System.out.println("Швидкість літака збільшилася до "+maxSpeed+" км/год.");
	}

	@Override
	public void stealthTechnology() {
		int time = (int)(Math.random()*15);
		while(time<=0) {
			time = (int)(Math.random()*15);
		}
		System.out.println("Літака не видно протягом "+time+" хв.");
	}

	@Override
	public void nuclearStrike() {
		int missiles = (int)(Math.random()*11);
		while(missiles<=0) {
			missiles = (int)(Math.random()*11);
		}
		System.out.println("Кількість ядерних боєголовок, яку буде скинуто "+missiles+" шт.");
	}
}
