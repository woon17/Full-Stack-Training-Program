package testproject;

import java.util.Scanner;

public class LaunchActivitySingleThread {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Banking activity has started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		int an = sc.nextInt();
		System.out.println("Enter password");
		int pw = sc.nextInt();
		System.out.println("Collect your money");
		
		System.out.println("Banking activity has completed");
		
		
		System.out.println("Printing activity has started");
		for(int i = 0; i<5; i++) {
			System.out.println("Printing....");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity has started");
		
		System.out.println("Addition activity has started");
		int a = 10;
		int b =20;
		int c = a  +b;
		System.out.println(c);
		System.out.println("Addition activity ended");
		
	}

}
