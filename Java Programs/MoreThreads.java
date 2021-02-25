class MoreThreads {
	public static void main(String args[]) {
		new MultiThread("One");
		new MultiThread("Two");
		new MultiThread("Three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}

class MultiThread implements Runnable {
	String name;
	Thread t;

	MultiThread(String thread) {
		name = thread;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
