package testproject;


import java.util.Scanner;

class InvalidCredentialsException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid credential";
	}
}

class ATM {
	final int userId = 1111;
	final int password = 2222;
	int inputId, inputPassword;

	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user Id:");
		inputId = sc.nextInt();
		System.out.println("Enter the password:");
		inputPassword = sc.nextInt();
	}

	void verify() throws InvalidCredentialsException {

		if (inputId == userId && inputPassword == password) {
			System.out.println("Collect money");
		} else {
			InvalidCredentialsException ice = new InvalidCredentialsException();
			
			throw ice;
		}
	}
}

class Bank {
	void func() {
		ATM atm = new ATM();
		try {
			atm.acceptInput();	
		}catch(Exception e){
			
		}
		try {
			atm.verify();
		}catch (InvalidCredentialsException ice) {
			System.out.println("Bank catch InvalidCredentialsException: " + ice.getMessage());
		}
		
	}
}

public class ATMSystem {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.func();

	}

}
