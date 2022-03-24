package testproject;

import java.util.InputMismatchException;
import java.util.Scanner;

class Recur{
	void fun1(){
		fun1();
	}
}

public class LaunchExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Connection established");
		// TODO Auto-generated method stub
//		DEH: default exception handler
//		int[] a = { 10, 20, 30, 40, 50 };
//		System.out.println(a[0]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[5]);//DEH:  java.lang.ArrayIndexOutOfBoundsException
		try {
			Recur re = new Recur();
			re.fun1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size for array:");
			int size = sc.nextInt();
			int[] a = new int[size]; 
			for(int i = 0 ; i< size; i++) {
				a[i] = i;
			}
			System.out.println("Enter the index for array:");
			int index = sc.nextInt();
			System.out.println(a[index]);
			System.out.println("Enter the numerator:");
			int num = sc.nextInt();
			System.out.println("Enter the denominator:");
			int den = sc.nextInt();
			int res = num/den;
			System.out.println(res);//DEH: java.lang.ArithmeticException: / by zero
			
		}catch(ArithmeticException e){
			System.out.println("Catch ArithmeticException");
		}catch(StackOverflowError e) {
			System.out.println("Catch StackOverflowError");
		}
		catch(InputMismatchException e) {
			System.out.println("Catch InputMismatchException");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Catch NegativeArraySizeException");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Catch" + e);
		}finally{
			System.out.println("Fianlly block");
		}
		System.out.println("Connection terminated");

	}

}
