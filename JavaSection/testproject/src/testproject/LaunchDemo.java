package testproject;
/*
 * parent class
 * */
class Demo1{
	int a = 10;
	int b = 20;

	
	Demo1(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	Demo1(int a){
		// this(...) and super(...), only exist one of them in a constructor. (they should be the first line)
		this(1000, 2000); // this should be the first line of the constructor.
		this.a = a;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

/*
 * child class
 * */
class Demo2 extends Demo1{
	Demo2(){
		super(111);
		a = 100;
		b =200;
		
	}
}


public class LaunchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		d.display();
	}

}
