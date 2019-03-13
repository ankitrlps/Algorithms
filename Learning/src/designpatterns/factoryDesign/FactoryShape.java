package designpatterns.factoryDesign;

public class FactoryShape {
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circle") || shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}if(shape.equalsIgnoreCase("Rectangle") || shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("Polygon") || shape.equalsIgnoreCase("polygon")){
			return new Polygon();
		}
		return null;
	}
}
