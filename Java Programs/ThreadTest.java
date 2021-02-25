
class MultipleThread1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("User Thread:" + i);

		}
	}

	public void Thread(ThreadGroup group, Runnable target) {

		System.out.println("Thread:" + group + target);
	}

}

class ThreadTest {

	public static void main(String[] args) {

		// MyThread mt = new MyThread();

		Runnable r = new Thread();

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread:" + i);
			System.out.println(t);
		}
	}
}
