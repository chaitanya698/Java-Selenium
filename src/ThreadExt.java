
class ThreadEx2 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("User Thread");
		}

	}
}

public class ThreadExt {

	public static void main(String[] args) throws InterruptedException {

		ThreadEx2 tex = new ThreadEx2();

		tex.start();

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread");
		}

	}

}
