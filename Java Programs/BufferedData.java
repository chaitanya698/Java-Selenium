import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedData {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data");

		String str1 = br.readLine();

		System.out.println("Enter same data");

		int val = br.read();

		System.out.println(str1);

		System.out.println(val);

	}

}
