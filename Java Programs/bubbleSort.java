
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 9, 4, 7, 8 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]);
			System.out.print("\t");
		}
	}

}
