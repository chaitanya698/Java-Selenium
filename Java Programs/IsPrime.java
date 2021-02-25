
public class IsPrime {

	static void isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % 1 == 0 || n % n == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {
		isPrime(2);
	}
}
