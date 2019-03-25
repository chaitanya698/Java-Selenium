import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Daddy");
		hm.put(1, "Mummy");
		hm.put(2, "Chaitanya");
		hm.put(3, "Poojitha");
		hm.put(4, "Malli");

		System.out.println(hm.get(4));
		System.out.println(hm);

		Set<?> sn = hm.entrySet();
		Iterator<?> it = sn.iterator();

		while (it.hasNext()) {

			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}

	}

}
