import java.io.FileInputStream;

public class FileInTest {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("/Users/praveen/downloads/test.txt");

		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);

		String data = new String(b);
		System.out.println(data);

		fis.close();

	}

}
