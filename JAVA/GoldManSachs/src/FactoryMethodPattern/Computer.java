package FactoryMethodPattern;

public abstract class Computer {

	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	
	@Override
	public String toString()
	{
		
		return "RAM= "+getRAM()+", HDD= "+this.getHDD()+", CPU= "+this.getCPU();
		
	}
	
}
