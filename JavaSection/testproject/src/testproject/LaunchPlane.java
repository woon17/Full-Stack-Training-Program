package testproject;
class Plane{
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

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("fly(): PassengerPlane");
	}
	
	void carryPassenger() {
		System.out.println("carryPassenger(): PassengerPlane");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("fly(): CargoPlane");
	}
	
	void carryCargo() {
		System.out.println("carryCargo(): CargoPlane");
	}
}


class FighterPlane extends Plane{
	void fly() {
		System.out.println("fly(): FighterPlane");
	}
	
	void carryArms() {
		System.out.println("carryArms(): FighterPlane");
	}
}

public class LaunchPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p = new Plane();
		p.takeOff();
		p.fly();
		p.land();

		p = new PassengerPlane();
		// p = new CargoPlane();
		// p = new FighterPlane();
		p.takeOff();
		p.fly();
		p.land();

		if (p instanceof PassengerPlane){
			((PassengerPlane) p).carryPassenger();
		}else if(p instanceof CargoPlane){
			((CargoPlane) p).carryCargo();

		}else if(p instanceof FighterPlane){
			((PassengerPlane) p).carryPassenger();
		}
		
	}

}
