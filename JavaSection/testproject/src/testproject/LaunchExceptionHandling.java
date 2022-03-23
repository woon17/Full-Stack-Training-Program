package testproject;

import java.util.Scanner;

public class LaunchExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Connection established");
		// TODO Auto-generated method stub
//		DEH: default exception handler
//		int[] a = { 10, 20, 30, 40, 50 };
//		System.out.println(a[0]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[5]);//DEH:  java.lang.ArrayIndexOutOfBoundsException
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int num = sc.nextInt();
		System.out.println("Enter the denominator:");
		int den = sc.nextInt();
		int res = num/den;
		System.out.println(res);//DEH: java.lang.ArithmeticException: / by zero
		System.out.println("Connection terminated");

	}

}
