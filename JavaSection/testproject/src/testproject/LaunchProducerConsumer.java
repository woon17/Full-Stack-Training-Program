package testproject;

class Producer extends Thread {
	Queue a;

	public Producer(Queue q) {
		this.a = q;
	}

	public void run() {
		try {
			int i = 1;
			while (true) {
				a.put(i++);
//				sleep(4000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread {
	Queue b;

	public Consumer(Queue q) {
		this.b = q;
	}

	public void run() {
		try {
			while (true) {
				b.get();
//				sleep(4000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Queue {
	// intermediate between producer and consumer
	int x;
	boolean value_present_in_x = false;

	synchronized void put(int i) {
		try {
			if (value_present_in_x == false) {// only put new value when consumer accessed its value
				x = i;
				System.out.println("I have put " + i + " into x");
				value_present_in_x = true;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			System.out.println("Some problem occured");
		}
	}

	synchronized void get() {
		try {
			if (value_present_in_x == true) {// only get the value when producer has put value
				System.out.println("I have taken " + x + " from x");
				value_present_in_x = false;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			System.out.println("Some problem occured");
		}
	}
}

public class LaunchProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);

		producer.start();
		consumer.start();

	}

}
