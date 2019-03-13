package designpatterns.factoryDesign;

public interface Shape {
	default void shape(){
		System.out.println("Shape from interface...");
	}
}
