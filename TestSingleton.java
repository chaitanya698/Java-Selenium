package TestDemoPackage;

class  SingletonClassExample{
	
	private static SingletonClassExample testRef =null;
	
	private SingletonClassExample() {
		System.out.println("Object is Created.!");
		
	}
	
	public static SingletonClassExample getInstanceOfSingleton() {
		if(testRef ==null) {
			testRef = new SingletonClassExample();
			System.out.println(testRef.hashCode());
		}
		return testRef;
		
	}
	
}

public class TestClassSingleton{
	
	public static void main(String[]args) {
		SingletonClassExample first = SingletonClassExample.getInstanceOfSingleton();
		SingletonClassExample second = SingletonClassExample.getInstanceOfSingleton();
	}
}











