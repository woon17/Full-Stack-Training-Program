package testproject;

class Bathroom1 implements Runnable {
	/*
	 * until the thread finish, other thread cannot be started. synchronized: lock
	 * of a common resource. common resource b, will be used only by one thread at
	 * any time
	 */
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " has exited the bathroom");
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class LaunchBathroomWithLock {
	/*
	 * only one common resource which is bathroom b. impossible for 3 to enter b
	 * together or use b together or exit b together
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bathroom1 b = new Bathroom1();

		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHERS");

		t1.start();
		t2.start();
		t3.start();
	}
}
