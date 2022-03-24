package testproject;

import java.util.InputMismatchException;
import java.util.Scanner;

class Load {
	void func1() throws ArithmeticException {
		System.out.println("Connection established");
		try {
//			Recur re = new Recur();
//			re.fun1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size for array:");
			int size = sc.nextInt();
			int[] a = new int[size];
			for (int i = 0; i < size; i++) {
				a[i] = i;
			}
			System.out.println("Enter the index for array:");
			int index = sc.nextInt();
			System.out.println(a[index]);
			System.out.println("Enter the numerator:");
			int num = sc.nextInt();
			System.out.println("Enter the denominator:");
			int den = sc.nextInt();
			int res = num / den;
			System.out.println(res);// DEH: java.lang.ArithmeticException: / by zero

		} catch (ArithmeticException e) {
			System.out.println("Catch ArithmeticException in Load");
			throw e;
		} catch (StackOverflowError e) {
			System.out.println("Catch StackOverflowError in Load");
		} catch (InputMismatchException e) {
			System.out.println("Catch InputMismatchException in Load");
		} catch (NegativeArraySizeException e) {
			System.out.println("Catch NegativeArraySizeException in Load");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catch" + e + "in load");
		} finally {
			System.out.println("Fianlly block in load");
		}
		System.out.println("Connection terminated");
	}
}


public class LaunchExceptionHandling2 {

	public static void main(String[] args) {
		Load load = new Load();

		try {
			load.func1();
		}catch(ArithmeticException e){
			System.out.println("Catch ArithmeticException in LaunchExceptionHandling");
		}finally {
			System.out.println("Fianlly block in LaunchExceptionHandling");
		}

	}

}
