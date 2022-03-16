package testproject;

class Cat{
	static int count;

// way 1
	static {
		System.out.println("Static block execution");
		count = 0;
	}
	Cat(){
		count++;
	}
//	way 2
	// way 1
//	Cat(){
//		count++;
//	}
//	way 3 : not frequently used
//	{
//		System.out.println("non-static block execution");
//		count++;
//	}
//	Cat(){
//	
//	}
}

public class LaunchObjectsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println(Cat.count);
		new Cat();
		System.out.println(Cat.count);
		new Cat();
		System.out.println(Cat.count);
		new Cat();
		System.out.println(Cat.count);
		new Cat();
		System.out.println(Cat.count);
		new Cat();
//		
	}

}
