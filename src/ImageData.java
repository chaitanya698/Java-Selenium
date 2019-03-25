import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageData {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("//Users/praveen/downloads/Test.jpg");
		int size = fis.available();

		byte[] b = new byte[size];

		fis.read(b);

		FileOutputStream fos = new FileOutputStream("/Users/praveen/downloads/Img.jpg");

		fos.write(b);

		System.out.println("Success.!");

		fos.close();
		fis.close();

	}

}
