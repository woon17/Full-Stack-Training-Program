package testproject;

interface Cal1 {
	// default method in interface with default access modifier 
	default void display() {
		System.out.println("default void display(): Cal1");
	}
	
	static void fun() {
		System.out.println("static void fun(): Cal1");
	}
	
	void add();

	void sub();
}

interface Cal2 extends Cal1 {
	int age = 18;
	void mul();

	void div();
}

class Cal implements Cal2 {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add(): Cal");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub(): Cal");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul(): Cal");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("mul(): Cal");
	}
	
	void displayCal() {
		System.out.println("age: " + age);
	}

}

class CalClass1 {
	void add() {
		System.out.println("add(): CalClass1");
	}

	void sub() {
		System.out.println("sub(): CalClass1");
	}
}

class CalClass2 extends CalClass1 {
	void mul() {
		System.out.println("mul(): CalClass2");
	}

	void div() {
		System.out.println("div(): CalClass2");
	}
}

class Cal3 extends CalClass2 implements Cal1 {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add(): Cal3");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub(): Cal3");
	}

	@Override
	void mul() {
		System.out.println("mul(): Cal3");
	}

	@Override
	void div() {
		System.out.println("div(): Cal3");
	}
	


}

class TestLaunchInterface3 {
	void test(Cal2 cal) {
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		System.out.println("cal.age: " + cal.age);
		
	}
}

class LaunchInterface3Test implements Cal1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add(): LaunchInterface3Test");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub(): LaunchInterface3Test");
	}
	
}

public class LaunchInterface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cal2 ref = new Cal();
//		TestLaunchInterface3 t = new TestLaunchInterface3();
//		t.test(ref);

//		CalClass2 c = new Cal3();
//		c.add();
//		c.sub();
//		c.mul();
//		c.div();
		
//		Cal c = new Cal();
//		System.out.println(c.age);
//		System.out.println(Cal.age);
//		c.displayCal();
		
//		jdk1.8
		Cal1 ref = new LaunchInterface3Test();
		ref.add();
		ref.sub();
		ref.display();
		Cal1.fun();
	}

}
