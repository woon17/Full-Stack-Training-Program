package testproject;

import java.util.Scanner;
import java.util.InputMismatchException; 

class InvalidAgeException extends Exception {

	public String getMessage() {
		return "your age < 18";
	}
}

class Branch1 {
	final int ageLimit = 18;
	int inputAge;

	void inputAge() {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		inputAge = sc.nextInt();
	}

	void verifyAge() throws InvalidAgeException {

		if (inputAge > ageLimit) {
			System.out.println("you register successfully ");
		} else {
			InvalidAgeException ia = new InvalidAgeException();
			throw ia;
		}
	}
}

class TP {
	void register() {
		try {
			Branch1 b1 = new Branch1();
			b1.inputAge();
			b1.verifyAge();

		} catch (InvalidAgeException ia) {
			System.out.println("TP: " + ia);
		}
//		catch (InputMismatchException e) {
//			
//		}
	}
}

public class LaunchTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP re = new TP();
		re.register();
		
	}

}
