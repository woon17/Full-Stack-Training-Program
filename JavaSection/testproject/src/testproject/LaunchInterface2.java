package testproject;

import java.util.Scanner;

interface Calculator1 {
	void add();// access modifier: public abstract

	void sub();


}

interface Calculator2 {


	void mul();

	void div();
}


class MyCalculator11 implements Calculator1,Calculator2 {
	// must be public as cannot reduce access modifier (public abstract)
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

	}

	public void sub() {
		int a = 10;
		int b = 20;
		System.out.println(a - b);
	}

	public void mul() {
		int a = 10;
		int b = 20;
		System.out.println(a * b);
	}

	public void div() {
		int a = 10;
		int b = 20;
		System.out.println(a / b);
	}
}

// abstract class can implement partial methods from interface
abstract class MyCalculator13 implements Calculator1,Calculator2 {
	// must be public as cannot reduce access modifier (public abstract)
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

	}
}

class MyCalculator14 extends MyCalculator13{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}
	
}

class MyCalculator12 implements Calculator1, Calculator2 {
	int a, b;

	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}

	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}

	public void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
	}

	public void div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
	}
}

class Test{
	void allow(MyCalculator11 cal) {
		cal.add();
		cal.mul();
	}
	
	void allow(MyCalculator12 cal) {
		cal.add();
		cal.mul();
	}
	
	void allow(MyCalculator13 cal) {
		cal.add();
	}
	
}

public class LaunchInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator11 mc1 = new MyCalculator11();
		MyCalculator12 mc2 = new MyCalculator12();
		MyCalculator13 mc3 = new MyCalculator14();

//		Calculator1 cal = new Calculator1();//Cannot instantiate the type Calculator1
//		Calculator1 cal = mc1;//it is allowed interface reference
		Test test = new Test();
		test.allow(mc1);
		test.allow(mc2);
		test.allow(mc3);
	}

}
