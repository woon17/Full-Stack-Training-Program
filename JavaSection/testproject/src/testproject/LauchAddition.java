package testproject;

class Addition{
	public int add(int[] arr) {
		int sum = 0;
		for (int element: arr) {
			sum += element;
		}
		return sum;
	}
}
public class LauchAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = new Addition().add(new int[]{1,0,2,0,3,4,0,5});
		System.out.println(sum);
	}

}
