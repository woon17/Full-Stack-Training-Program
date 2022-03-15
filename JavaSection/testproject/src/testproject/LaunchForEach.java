package testproject;

import java.util.Arrays;
import java.util.Scanner;

public class LaunchForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for (int a : arr) {
			System.out.print(++a);
		}
		
		int[] arr2 = new int[5];
		for(int i: arr2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 5 elements: ");
			i = sc.nextInt();
		}
		System.out.print(Arrays.toString(arr2));
	}

}
