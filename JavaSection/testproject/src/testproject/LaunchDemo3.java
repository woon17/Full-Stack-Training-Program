package testproject;

class Demo5{
	static void display() {
		System.out.println("display(): Demo5");
	}
}

class Demo51 extends Demo5{
	static void display() {
		System.out.println("display(): Demo51");
	}
}

public class LaunchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo51 d = new Demo51();
		d.display();// display(): Demo51
		
		Demo5 d2 = new Demo5();
		d2.display();
		
		Demo5 d3 = new Demo51();
		d3.display();
	}

}
