package testproject;

import java.util.Scanner;

class Farmer{
	private int principle;
	private int duration;
	private float simpleInterest;
	private static float rateOfInterest;
	
	static {
		System.out.println("Here is static block execute");
		rateOfInterest = 2.5f;
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle: ");
		this.principle = sc.nextInt();
		System.out.println("Enter the duration: ");
		this.duration = sc.nextInt();
	}
	
	void compute() {
		this.simpleInterest = this.principle * this.duration * rateOfInterest/100;
	}
	
	void display() {
		System.out.println(String.format("The simple Interest: %s", this.simpleInterest));
	}
}
public class LaunchSimpleInterest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer farmer1 = new Farmer();
		Farmer farmer2 = new Farmer();
		Farmer farmer3 = new Farmer();
		
		farmer1.input();
		farmer1.compute();
		farmer1.display();
		
		farmer2.input();
		farmer2.compute();
		farmer2.display();
		
		farmer3.input();
		farmer3.compute();
		farmer3.display();
	}

}
