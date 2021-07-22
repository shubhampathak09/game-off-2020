package AbstractFactoryMethodModel;

public class PCFactory implements ComputerAbstractFactory{

	
	public String cpu;
	public String ram;
	public String hdd;
	
	
	public PCFactory(String cpu,String ram,String hdd)
	{
		this.cpu=cpu;
		this.ram=ram;
		this.hdd=hdd;
	}
	
	public Computer createComputer()
	{
		return new PC(ram,hdd,cpu);
	}
	
}
