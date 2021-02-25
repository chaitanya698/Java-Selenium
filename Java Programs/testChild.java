
public class testChild extends testParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testParent tp = new testChild();
		tp.m1();
		tp.m2();
		testParent tp1 = new testParent();

		tp1.m1();
		tp1.m1();
		tp1.m2();

		testChild tc = new testChild();
		tc.m1();
		tc.m2();
	}

	@Override
	public void m1() {
		System.out.println("M1 of child");
	}

}
