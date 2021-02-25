
//Implementing Runnable Interface example

public class TestThread {

	public static void main(String[] args) {

		/*
		 * The run() is in Thread Class not in the Runnable interface so we need to
		 * create object with the class reference that implements Runnable to access the
		 * run()
		 */

		Thread t1 = new Thread(new Thread2());

		t1.start();

		Thread t = Thread.currentThread();

		System.out.println(t);

		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Main Thread");

		}

	}

}

class Thread2 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000); // Sleep() will throw InterruptedException exception
									// so it must always be surrounded with try catch blocks
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("This is User Thread");
		}
	}

}
