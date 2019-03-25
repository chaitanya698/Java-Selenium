import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Chaitanya");
		hs.add("Poojitha");
		hs.add("Malli");
		hs.add("Daddy");
		hs.add("Mummy");

		Iterator<String> i = hs.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());

		}
	}
}
