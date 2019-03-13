package designpatterns.factoryDesign;

public class ShapeFromUser {
	public static void main(String[] args) {
		FactoryShape shapeFac = new FactoryShape();
		
		Shape shape1 = shapeFac.getShape("circle");
		shape1.shape();
		
		Shape shape2 = shapeFac.getShape("Polygon");
		shape2.shape();
		
		Shape shape3 = shapeFac.getShape("rectangle");
		shape3.shape();
	}
}
