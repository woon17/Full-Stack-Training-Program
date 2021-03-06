package testproject;

class Plane {
	void takeOff() {
		System.out.println("takeOff(): Plane");
	}

	void fly() {
		System.out.println("fly(): Plane");
	}

	void land() {
		System.out.println("land(): Plane");
	}
}

class PassengerPlane extends Plane {
	void fly() {
		System.out.println("fly(): PassengerPlane");
	}

	void carryPassenger() {
		System.out.println("carryPassenger(): PassengerPlane");
	}
}

class CargoPlane extends Plane {
	void fly() {
		System.out.println("fly(): CargoPlane");
	}

	void carryCargo() {
		System.out.println("carryCargo(): CargoPlane");
	}
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("fly(): FighterPlane");
	}

	void carryArms() {
		System.out.println("carryArms(): FighterPlane");
	}
}

class Airport {
	void permit(Plane p) {
		p.fly();
		p.takeOff();
		
		if (p instanceof PassengerPlane) {
			((PassengerPlane) p).carryPassenger();
		} else if (p instanceof CargoPlane) {
			((CargoPlane) p).carryCargo();

		} else if (p instanceof FighterPlane) {
			((FighterPlane) p).carryArms();
		}
	}
}

public class LaunchPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airport a = new Airport();
		Plane p = new Plane();
		a.permit(p);
		p = new PassengerPlane();
		a.permit(p);
		p = new CargoPlane();
		a.permit(p);
		p = new FighterPlane();
		a.permit(p);
//		p.takeOff();
//		p.fly();
//		p.land();



	}

}
