package testproject;
class Parent{
	void eat(){
		System.out.println("eat(): Parent");
	}
	
	void run(){
		System.out.println("run(): Parent");
	}
}

class Child1 extends Parent{
	void eat() {
		System.out.println("eat(): Child1");
	}
	
	void cry() {
		System.out.println("cry(): Child1");
	}
}

class Child2 extends Parent{
	void eat() {
		System.out.println("eat(): Child2");
	}
	
	void cry() {
		System.out.println("cry(): Child2");
	}
}

public class LaunchParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c1 = new Child1();
		Child2 c2= new Child2();
		
		Parent ref;
		ref = c1;
		ref.eat();
		((Child1) ref).cry();
		ref.run();
		System.out.println();
//		instanceof 
		ref = c2;
		ref.eat();
		((Child2) ref).cry();

	}

}
