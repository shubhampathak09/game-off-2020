package AbstractFactoryMethodModel;

public class Server extends Computer {

	public String cpu;
	public String hdd;
	public String ram;
	
	
	public Server(String ram,String hdd,String cpu)
	{
	
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	
	public String getCPU()
	{
		return this.cpu;
	}
	
	public String getHDD()
	{
		return this.hdd;
				
	}
	
	public String getRAM()
	{
		return this.ram;
	}
	
	
}
