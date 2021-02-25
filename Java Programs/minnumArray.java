
public class minnumArray {

	public static void main(String[] args) {

		int ar1[][] = new int[2][3];
		ar1[0][0] = 1;
		ar1[0][1] = 2;
		ar1[0][2] = 3;
		ar1[1][0] = 4;
		ar1[1][1] = 5;
		ar1[1][2] = 6;
		int max = ar1[0][0];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (ar1[i][j] > max) {
					max = ar1[i][j];

				}

			}

		}
		System.out.println(max);
	}
}
