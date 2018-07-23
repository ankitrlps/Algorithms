package designpatterns.AbstractFactoryDesign;

public class TestDesignPattern {
	public static void main(String[] args) {
		testPattern();
	}
	
	private static void testPattern() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "1 TB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("10 GB", "100 GB", "2.4 GHz"));
		
		System.out.println("PC Configs: " + pc);
		System.out.println("Server Configs: " + server);
	}
}
