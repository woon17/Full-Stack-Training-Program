package testproject;

public class Problem1 {
	
	public static int problem1(int[] ar) {

        int res = ar[0];
        for (int i = 1; i < ar.length; i++)
            res = res ^ ar[i];
     
        return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int[] input = {1, 2, 1, 4, 2};
		 int[] input = {1, 2, 1, 2, 4, 3, 4};
		System.out.println("Unique element: " + problem1(input));
	}
}
