package testproject;
// cannot change the value for final variable
class Demo6{
//	final int a =10;
	int a =10;
	int getA() {
		return this.a;
	}
	
	void setA(int b) {
		a = b;
	}
}

class Demo61 extends Demo6{
	
}
public class LaunchDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 d = new Demo6();
		d.getA();
		d.a = 10;
	}

}
