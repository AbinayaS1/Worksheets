package week1.day1;

public class car {

	public void driveCar() {
		System.out.println("Drive when traffic light is green.");
	}

	public void applyBrake() {
		System.out.println("Stop when traffic light is red.");	
	}

	public void soundHorn() {
		System.out.println("Apply horn when required.");
	}

	public void isPuncture() {
		System.out.println("check the puncture.");
	}
	public static void main(String[] args) {
		car obj = new car();
		obj.driveCar()	;
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
	}
}
