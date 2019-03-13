package designpatterns.singleton;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception {
		SingletonClassExample singObj1 = SingletonClassExample.getInstance();
		SingletonClassExample singObj2 = SingletonClassExample.getInstance();
		
		System.out.println("First Object... " + singObj1.hashCode());
		System.out.println("Second Object... " + singObj2.hashCode());
		
		//Reflection - violates singleton pattern
		Class testClass = Class.forName("designpatterns.singleton.SingletonClassExample");
		Constructor<SingletonClassExample> cons = testClass.getDeclaredConstructor();
		cons.setAccessible(true);
		SingletonClassExample singObj3 = cons.newInstance();
		System.out.println("Third Object... " + singObj3.hashCode());
	}
}
