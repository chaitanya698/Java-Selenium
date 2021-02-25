
class Test1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("User Thread:" + i);

		}
	}
}

public class threadExample1 {

	public static void main(String[] args) {

		Test1 tt = new Test1();
		tt.start();
		System.out.println(tt.getName());
		System.out.println(tt.getPriority());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread:" + i);
		}

	}
}
