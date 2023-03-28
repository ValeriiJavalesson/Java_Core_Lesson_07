package Ex_1;

abstract public class Plane {
	int width;
	int length;
	int weight;
	
	Plane(int width, int length, int weight){
		this.width = width;
		this.length = length;
		this.weight = weight;
	}
	
	void startEngine() {
		int startTime = (int) (Math.random()*89);
		while (startTime<=20) {
			startTime = (int) (Math.random()*89);
		}
		System.out.println("Час до злету: "+startTime+" сек.");
	}
	void startFly() {
		System.out.println("Палива в баках вистачить на "+(int) (Math.random()*1000)+" км.");
		
	}
	void endFly() {
		System.out.println("Літак іде на посадку");
	}
}
