import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Emp name:");
		String ename = sc.nextLine(); // next() reads only one word and nextLine() reads a complete line
		System.out.println("Enter Emp no:");
		int eno = sc.nextInt();
		System.out.println("Enter emp address");
		String eadd = sc.next();
		System.out.println("Enter Emp Sal:");
		float esal = sc.nextFloat();

		System.out.println("Emp details:");

		System.out.println(ename);
		System.out.println(eno);
		System.out.println(eadd);
		System.out.println(esal);

		sc.close();
	}

}
