package testproject;

class Student{
	int a;
	static int m;
	{
		System.out.println("non-static block execution");
		a = 10;
	}
	void display1() {
		System.out.println(a);
		System.out.println(m);
	}
	
	static void display2() {
//		bellow one line code cause error:
//		Cannot make a static reference to the non-static field a
		System.out.println(a);
		System.out.println(m);
	}
}
public class LaunchStaticPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.display2();
		Student s = new Student();
		s.display1();

	}

}
