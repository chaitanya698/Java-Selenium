
public class minmaxArray {

	public static void main(String[] args) {

		int ar2[][] = { { 3, 7, 9 }, { 7, 6, 10 }, { 13, 6, 91 } };

		int min = ar2[0][0];
		int mincol = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (ar2[i][j] < min) {
					min = ar2[i][j];
					mincol = j;

				}

			}

		}

		int k = 0;
		int max = ar2[0][mincol];
		while (k < 3) {
			if (ar2[k][mincol] > max) {
				max = ar2[k][mincol];

			}
			k++;

		}

		System.out.println(min);
		System.out.println(mincol);
		System.out.println(max);
	}

}
