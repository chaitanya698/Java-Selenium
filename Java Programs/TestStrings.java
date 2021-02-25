
public class TestStrings {

	public static void main(String[] args) {

		String s1 = "chaitanya";
		String s2 = "chaitanya";

		// String s2 = new String("Hello");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s2.concat(" annangi"));
		System.out.println(s2.charAt(4));
		System.out.println(s1.substring(0, 6));
		String arr[] = s1.split("t");
		System.out.println(arr[0]);
		// System.out.println(s2.split("/", 3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.replaceAll("t", "T"));
	}
}
