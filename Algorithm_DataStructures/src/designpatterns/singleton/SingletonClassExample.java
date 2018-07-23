package designpatterns.singleton;

public class SingletonClassExample {
	
	private static SingletonClassExample singletonObj;
	
	private SingletonClassExample(){
		System.out.println("Creating an instance...");
	}
	
	public static SingletonClassExample getInstance(){
		if(singletonObj == null){
			return singletonObj = new SingletonClassExample();
		}
		return singletonObj;
	}
}