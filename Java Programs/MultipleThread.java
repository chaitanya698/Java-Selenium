class MultipleThread {

	public static void main(String[] args) {

		// MyThread mt = new MyThread();

		Thread t1 = new Thread();

		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread:" + i);
			System.out.println(t1);
		}
	}
}

class MyThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("User Thread:" + i);

		}
	}

}
