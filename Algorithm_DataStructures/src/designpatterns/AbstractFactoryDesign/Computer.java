package designpatterns.AbstractFactoryDesign;

public abstract class Computer {
	abstract String getRAM();
	abstract String getCPU();
	abstract String getHDD();
	
	@Override
	public String toString() {
		return "RAM: " + this.getRAM() + " || CPU: " + this.getCPU() + " || HDD: " + this.getHDD();
	}
}
