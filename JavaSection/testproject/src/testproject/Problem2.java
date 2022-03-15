package testproject;

import java.util.Arrays;

public class Problem2 {
	
	public static void problem2() {
		int[] input = {4,2,1,7};
		int product = 1;
		for(int i = 0; i < input.length; i++) {
			product *= input[i];
		}
		
		int[] res = new int[input.length];
		for (int i =0; i < input.length; i++) {
			res[i] = product / input[i];
		}
		System.out.println(Arrays.toString(res));
	}
	
	public static void main(String[] args) {
		problem2();
	}
}
