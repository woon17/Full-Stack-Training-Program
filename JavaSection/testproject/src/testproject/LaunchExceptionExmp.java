package testproject;

import java.io.FileInputStream;

public class LaunchExceptionExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// checked exception
		try {
			FileInputStream fs = new FileInputStream(
					"D:\\JAVA AND ANGULAR TRAINING\\Full-Stack-Training-Program\\JavaSection\\testproject\\src\\testproject\\Demo1.java");
			int i = fs.read();
			System.out.print((char) i);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("something is wrong");
		}
	}

}
