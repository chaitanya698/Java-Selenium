
public class overloadExample {

	public static void main(String[] args) {

		overloadExample ol = new overloadExample();
		ol.m1();
		ol.m1(1);
		ol.m1("c");

	}

	public void m1() {

		System.out.println("0 arg m1");
	}

	public void m1(int a) {
		System.out.println("integer arg method");

	}

	public void m1(String s) {
		System.out.println("String arg method");
	}
}
