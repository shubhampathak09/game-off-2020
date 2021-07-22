package AbstractFactoryMethodModel;

public class ServerFactory implements ComputerAbstractFactory {

	
	public String cpu;
	public String ram;
	public String hdd;
	
	
	public ServerFactory(String cpu,String ram,String hdd)
	{
		this.cpu=cpu;
		this.ram=ram;
		this.hdd=hdd;
	}
	
	
	
	public Computer createComputer()
	{
		return new Server(ram,hdd,cpu);
	}
}
