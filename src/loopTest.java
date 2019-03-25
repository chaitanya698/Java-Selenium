
public class loopTest {

	public static void main(String[] args) {

		int i = 0, j = 0;
		int n = 4;

		for (i = 0; i <= n; i++)

		{
			System.out.println("outer loop started" + i);
			for (j = 0; j <= i; j++) {
				System.out.println("inner loop" + j);
			}
			System.out.println("outer loop ended" + i);

		}

	}
}
