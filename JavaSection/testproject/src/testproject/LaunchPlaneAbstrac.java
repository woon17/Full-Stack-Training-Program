package testproject;

abstract class Plane1 {
	void takeOff() {
		System.out.println("takeOff(): Plane");
	}

	abstract void fly();

	void land() {
		System.out.println("land(): Plane");
	}
}

class PassengerPlane1 extends Plane1 {
	void fly() {
		System.out.println("fly(): PassengerPlane");
	}

	void carryPassenger() {
		System.out.println("carryPassenger(): PassengerPlane");
	}
}

class CargoPlane1 extends Plane1 {
	void fly() {
		System.out.println("fly(): CargoPlane");
	}

	void carryCargo() {
		System.out.println("carryCargo(): CargoPlane");
	}
}

class FighterPlane1 extends Plane1 {
	void fly() {
		System.out.println("fly(): FighterPlane");
	}

	void carryArms() {
		System.out.println("carryArms(): FighterPlane");
	}
}

class Airport1 {
	void permit(Plane1 p) {
		p.fly();
		p.takeOff();

		if (p instanceof PassengerPlane1) {
			((PassengerPlane1) p).carryPassenger();
		} else if (p instanceof CargoPlane1) {
			((CargoPlane1) p).carryCargo();

		} else if (p instanceof FighterPlane1) {
			((FighterPlane1) p).carryArms();
		}
	}
}

public class LaunchPlaneAbstrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane1 p = new PassengerPlane1();
		Airport1 a = new Airport1();
		a.permit(p);

		p = new PassengerPlane1();
		p = new CargoPlane1();
		a.permit(p);
		 p = new FighterPlane1();
		a.permit(p);
//		p.takeOff();
//		p.fly();
//		p.land();
	}
}
