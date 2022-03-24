package testproject;

import java.util.Scanner;

interface Calculator {
	void add();// access modifier: public abstract

	void sub();

	void mul();

	void div();
}

/*
 * class: no need to input the two variable
 */
class MyCalculator1 implements Calculator {
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

class MyCalculator2 implements Calculator {
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

class Geometry {
	void allow(Calculator ref) {
		ref.add();
		ref.sub();
	}
}

public class LaunchInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();

		Geometry ge = new Geometry();
		ge.allow(mc1);
		ge.allow(mc2);

	}

}
