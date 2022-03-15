package testproject;

class Sub{
	int sub(int a, int b) {
		return a - b;
	}
	float sub(int a, float b) {
		return a - b;
	}
	float sub(float a, float b) {
		return a - b;
	}
}


public class LauchAddtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		int a = 2, b = 5;
		float m = 1.2f, n = 4.2f;
		System.out.println(s.sub(a, b));
		System.out.println(s.sub(n, m));
	}

}
