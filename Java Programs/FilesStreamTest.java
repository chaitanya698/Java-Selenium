import java.io.FileOutputStream;

public class FilesStreamTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("/Users/praveen/downloads/test.txt");

		String data = "Chaitanya"; // file don't exist and fos will create a file and add this data

		byte[] b = data.getBytes();
		fos.write(b);

		System.out.println("Success.!");

		fos.close();

	}

}
