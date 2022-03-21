package testproject;

// example1: Cannot reduce the visibility of the inherited method from its parent
//class Exmp1{
//	public void display() {
//		System.out.println("display(): Exmp1");
//	}
//}
//
//class Exmp2 extends Exmp1{
//	// Cannot reduce the visibility of the inherited method from Exmp1(Parent)
//	void display() {
//		System.out.println("display(): Exmp2");
//	}
//}

// example2: Cannot change the return type of the override method, 
// but if the return types are parent-child relationship and obey rule1 (not reduce the visibility), 
// then it is allowed (Covariant return type).

class Animal1{
	
}

class Tiger1 extends Animal1{
	
}

class Exmp1{
	Animal1 display() {
		System.out.println("display(): Exmp1");
		Animal1 a = new Animal1();
		return a;
	}
}

class Exmp2 extends Exmp1{
	// The return type is incompatible with Exmp1.display()
	Tiger1 display() {
		System.out.println("display(): Exmp2");
		Tiger1 a = new Tiger1();
		return a;
	}
}


//example3: the return types are parent-child relationship but does not obey rule1 (it reduces the visibility), 
//then it is not allowed 
//class Animal1{
//
//}
//
//class Tiger1 extends Animal1{
//
//}
//class Exmp1{
//	Tiger1 display() {
//		System.out.println("display(): Exmp1");
//		Tiger1 a = new Tiger1();
//		return a;
//	}
//}
//
//class Exmp2 extends Exmp1{
//	// The return type is incompatible with Exmp1.display()
//	Animal1 display() {
//		System.out.println("display(): Exmp2");
//		Animal1 a = new Animal1();
//		return a;
//	}
//}
//
//
//
//
public class LaunchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exmp2 e = new Exmp2();
		e.display();
	}
}
