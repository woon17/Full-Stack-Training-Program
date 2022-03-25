package testproject;

import java.util.Scanner;

class Bank1 extends Thread {
	public void run() {
		System.out.println("Banking activity has started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		int an = sc.nextInt();
		System.out.println("Enter password");
		int pw = sc.nextInt();
		System.out.println("Collect your money");

		System.out.println("Banking activity has completed");
	}
}

class Print extends Thread {
	public void run() {
		System.out.println("Printing activity has started");
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing....");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity has started");
	}
}

class Addition1 extends Thread {
	public void run() {

		System.out.println("Addition activity has started");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition activity ended");
	}
}

public class LaunchActivityMultiThreadBySubThreadClasses {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Bank1 b = new Bank1();
		Print p = new Print();
		Addition1 a = new Addition1();
		
		b.start();
		p.start();
		a.start();
		
	}

}
