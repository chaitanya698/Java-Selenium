
class ThreadEx1 {

	public static void main(String[] args) {

		ThreadTest2 ob1 = new ThreadTest2();
		ThreadTest2 ob2 = new ThreadTest2();
		ThreadTest2 ob3 = new ThreadTest2();

		ob1.setName("AAA");
		ob2.setName("BBB");
		ob3.setName("CCC");

		ob1.start();
		// ob2.start();
		// ob3.start();

		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}

class ThreadTest2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(500);

				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
