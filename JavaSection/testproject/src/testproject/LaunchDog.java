package testproject;

class Dog{
	String name;
	String color;
	int cost;
	Dog(){
		this.name = "Ruby";
		this.color ="Black";
		this.cost = 15000;
	}
	
	Dog(String name){
		this();
		this.name = name;
		this.cost = 20000;
	}
	
	Dog(String name, String color, int cost){
		this("Spinny");
	}
	
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}
public class LaunchDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("shu", "blue", 100);
		dog.display();
	}

}
