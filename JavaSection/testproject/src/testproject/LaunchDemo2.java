package testproject;
class DemoParent{
	int a = 10;
}

class DemoChild extends DemoParent{
	int a =100;
	void display() {
		int a = 1000;
		System.out.println(a);//1000
		System.out.println(this.a);//100
		System.out.println(super.a);//10
	}
}
public class LaunchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoChild d = new DemoChild();
		d.display();
	}

}
