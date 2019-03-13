package designpatterns.AbstractFactoryDesign;

public class Server extends Computer {

	private String ram;
	private String cpu;
	private String hdd;
	
	public Server(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	String getRAM() {
		return this.ram;
	}

	@Override
	String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

}
