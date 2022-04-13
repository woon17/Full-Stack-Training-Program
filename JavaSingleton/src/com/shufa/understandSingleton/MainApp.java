package com.shufa.understandSingleton;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();
		Car c3 = Car.getInstance();
//		c1.setBrand("BMW");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3 + "\n");
		Car2 c4 = Car2.getInstance();
		Car2 c5 = Car2.getInstance();
		Car2 c6 = Car2.getInstance();
		
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6 + "\n");
		
	}
}
