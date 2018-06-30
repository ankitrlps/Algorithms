package designpatterns;

public class SingletonClassExample {

	private static SingletonClassExample singleTon;

	private SingletonClassExample() {
	}

	public static SingletonClassExample getInstance() {
		if (singleTon == null) {
			singleTon = new SingletonClassExample();
		}
		return singleTon;
	}
}
