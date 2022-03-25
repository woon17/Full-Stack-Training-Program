package testproject;

import java.util.Scanner;

class DemoAct extends Thread {
	public void run() {
		if (getName().equals("BANK")) {
			bank();
		} else if (getName().equals("PRINTING")) {
			print();
		} else if (getName().equals("ADDITION")) {
			add();
		}
	}

	void bank() {
		System.out.println("bank activity has started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		int an = sc.nextInt();
		System.out.println("Enter password");
		int pw = sc.nextInt();
		System.out.println("Collect your money");

		System.out.println("bank activity has completed");
	}

	void print() {
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

	void add() {
		System.out.println("Addition activity has started");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition activity ended");
	}
}

public class LaunchActivityMutiThreadByThreadNames {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		DemoAct d1 = new DemoAct();
		DemoAct d2 = new DemoAct();
		DemoAct d3 = new DemoAct();

		d1.setName("BANK");
		d2.setName("PRINTING");
		d3.setName("ADDITION");

		d1.start();
		d2.start();
		d3.start();

	}

}
