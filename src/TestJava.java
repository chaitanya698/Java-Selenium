
public class TestJava {

	static void isDivisibleByPrime(int n) {

		if (n % 2 == 0 && n % 3 == 0 && n % 11 == 0) {
			System.out.println("ELEVEN");
		} else if (n % 2 == 0 && n % 3 == 0) {
			System.out.println("THREE");
		} else if (n % 3 == 0 && n % 11 == 0) {
			System.out.println("ELEVEN");
		} else if (n % 2 == 0 && n % 11 == 0) {
			System.out.println("ELEVEN");
		} else if (n % 2 == 0) {
			System.out.println("TWO");
		} else if (n % 3 == 0) {
			System.out.println("THREE");
		} else if (n % 11 == 0) {
			System.out.println("ELEVEN");
		} else {
			System.out.println("-1");
		}
	}

	public static void main(String[] args) {
		isDivisibleByPrime(234);
	}
}
