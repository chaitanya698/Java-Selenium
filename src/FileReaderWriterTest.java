import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileWriter fws = new FileWriter("/Users/praveen/downloads/Test1.txt");

		String data = "Poojitha";

		char[] ch = data.toCharArray();

		fws.write(ch);

		System.out.println("Success.!");

		fws.close();

		FileReader fr = new FileReader("/Users/praveen/downloads/Test1.txt");

		fr.read(ch);
		String str = new String(ch);
		System.out.println(ch);
		System.out.println("Success.!");
		fr.close();

	}
}
