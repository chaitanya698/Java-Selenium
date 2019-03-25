import java.io.FileInputStream;

public class WordCount {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("/Users/praveen/downloads/test.txt");

		int size = fis.available();
		byte[] b = new byte[size];

		fis.read(b);
		String st = new String(b);
		System.out.println(st.matches("chaitanya"));
		String[] str = st.split("Chaitanya");
		System.out.println("No of words is:" + str.length);

	}

}
