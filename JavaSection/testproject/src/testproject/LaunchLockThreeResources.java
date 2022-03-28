package testproject;

//
//class Resource implements Runnable {
//	/*
//	 * until the thread finish, other thread cannot be started. synchronized: lock
//	 * of a common resource. common resource b, will be used only by one thread at
//	 * any time
//	 */
//	String name = "";
//	
//	Resource(String resource){
//		this.name = resource;
//	}
//	
//	synchronized public void run() {
//		try {
//			System.out.println(Thread.currentThread().getName() + " try to get knife");
//			Thread.sleep(4000);
//			System.out.println(Thread.currentThread().getName() + " try to get gun ");
//			Thread.sleep(4000);
//			System.out.println(Thread.currentThread().getName() + " try to get bomb");
//			Thread.sleep(4000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//public class LaunchPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Resource r = new Resource();
//		
//		Thread t1 = new Thread(r);
//		Thread t2 = new Thread(r);
//		
//		t1.setName("Redresh");
//		t2.setName("Akhil");
//		t1.start();
//		t2.start();
//	}
//
//}

class Warrior extends Thread {
	String resource1 = "knift";
	String resource2 = "gun";
	String resource3 = "bomb";

	public void run() {
		if (getName().equals("Redresh")) {
			redreshAcquiredResource();
		} else {
			akhilAcquiredResource();
		}
	}

	void redreshAcquiredResource() {
		try {
			synchronized (resource1) {
				System.out.println("Rudresh has accquired " + resource1);
				Thread.sleep(5000);
				synchronized (resource2) {
					System.out.println("Rudresh has accquired " + resource2);
					Thread.sleep(5000);
					synchronized (resource3) {
						System.out.println("Rudresh has accquired " + resource3);
						Thread.sleep(5000);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

//	deadlock occur in the resource3->resource2->resource1
	/*
	 * Akhil has accquired bomb; Rudresh has accquired knift; Akhil has accquired gun;
	 */
	void akhilAcquiredResource() {
		try {
			synchronized (resource3) {
				System.out.println("Akhil has accquired " + resource3);
				Thread.sleep(5000);
				synchronized (resource2) {
					System.out.println("Akhil has accquired " + resource2);
					Thread.sleep(5000);
					synchronized (resource1) {
						System.out.println("Akhil has accquired " + resource1);
						Thread.sleep(5000);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class LaunchLockThreeResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();

		w1.setName("Redresh");
		w2.setName("Akhil");

		w1.start();
		w2.start();
	}

}
