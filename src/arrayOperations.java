
public class arrayOperations {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 3;
		int[][] array = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = i * j;
			}

			for (int i1 = 0; i1 < rows; i1++) {
				for (int j = 0; j < cols; j++) {

					System.out.format("%d", array[i1][j]);

				}
			}
		}
	}
}
