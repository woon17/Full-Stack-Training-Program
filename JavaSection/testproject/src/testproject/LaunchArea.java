package testproject;

import java.util.Scanner;

abstract class Shape {
	float area;

	abstract void input();

	abstract void compute();

	void disp() {
		System.out.println("Area: " + area + "\n");
	}
}

class Triangle extends Shape {
	float height;
	float base;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Triangle - Enter the height (float):");
		height = sc.nextFloat();
		System.out.println("Triangle - Enter the base (float):");
		base = sc.nextFloat();
	}

	void compute() {
		area = (float) (0.5f * height * base);
	}
}

class Rectangle extends Shape {
	float height;
	float width;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rectangle - Enter the height (float):");
		height = sc.nextFloat();
		System.out.println("Rectangle - Enter the width (float):");
		width = sc.nextFloat();
	}

	void compute() {
		area = (float) (height * width);
	}
}

class Circle extends Shape {
	float radius;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Circle - Enter the radius (float):");
		radius = sc.nextFloat();
	}

	void compute() {
		area = (float) (Math.PI * radius * radius);
	}
}

class Calculate{
	void solve(Shape shape) {
		shape.input();
		shape.compute();
		shape.disp();
	}
}

public class LaunchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new Calculate();
		Shape shape = new Triangle();
		cal.solve(shape);
		
		shape = new Rectangle();
		cal.solve(shape);

		shape = new Circle();
		cal.solve(shape);
	}

}
