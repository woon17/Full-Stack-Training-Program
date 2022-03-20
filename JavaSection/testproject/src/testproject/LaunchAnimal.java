package testproject;

class Animal {
	void eat() {
		System.out.println("eat(): Animal");
	}

	void sleep() {
		System.out.println("sleep(): Animal");
	}
}

class Tiger extends Animal {
	void eat() {
		System.out.println("eat(): Tiger");
	}

	void movement() {
		System.out.println("movement(): Tiger");
	}
}

class Bear extends Animal {
	void eat() {
		System.out.println("eat(): Bear");
	}

	void movement() {
		System.out.println("movement(): Bear");
	}
}

class Monkey extends Animal {
	void eat() {
		System.out.println("eat(): Monkey");
	}

	void movement() {
		System.out.println("movement(): Monkey");
	}
}

class Zoo {
	void getInfor(Animal animal) {
		animal.eat();
		animal.sleep();
//		animal.movement();
		if(animal instanceof Tiger) {
			((Tiger) animal).movement();
		}
		
		if(animal instanceof Bear) {
			((Bear) animal).movement();
		}
		
		if(animal instanceof Monkey) {
			((Monkey) animal).movement();
		}
		System.out.println();
	}
}

public class LaunchAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		Tiger tiger = new Tiger();
		Bear bear = new Bear();
		Monkey monkey = new Monkey();
		Zoo zoo = new Zoo();
		
		animal = tiger;
		zoo.getInfor(animal);
		animal = bear;
		zoo.getInfor(animal);
		animal = monkey;
		zoo.getInfor(animal);

	}

}
