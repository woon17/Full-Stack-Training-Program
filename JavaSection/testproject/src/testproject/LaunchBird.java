package testproject;

abstract class Bird {

	abstract void fly();

	abstract void eat();
}

abstract class Eagle extends Bird {
	abstract void fly();

	void eat() {
		System.out.println("eat(): Eagle");
	}
}

class GoldenEagle extends Eagle {
	void fly() {
		System.out.println("fly(): GoldenEagle");
	}
}

class SerpentEagle extends Eagle {
	void fly() {
		System.out.println("fly(): SerpentEagle");
	}
}

class Sparrow extends Bird {
	void fly() {
		System.out.println("fly(): Sparrow");
	}

	void eat() {
		System.out.println("eat(): Sparrow");
	}
}

// achieve polymorphism: top level parent reference, when call method, 
// it depends their actual child class type 
class Zoo1 {
	void watch(Bird bird) {
		bird.fly();
		bird.eat();
	}
}

public class LaunchBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo1 zoo = new Zoo1();
		Bird bird = new GoldenEagle();
		zoo.watch(bird);
		bird = new SerpentEagle();
		zoo.watch(bird);
		bird = new Sparrow();
		zoo.watch(bird);
		
	}

}
