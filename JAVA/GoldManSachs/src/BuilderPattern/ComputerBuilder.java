//package BuilderPattern;
//
//public static class ComputerBuilder {
//
//	
//	private String HDD;
//	private String RAM;
//	
//	private boolean isGraphicsCardEnabled;
//	
//	private boolean isBluetoothEnabled;
//	
//	
//	public ComputerBuilder(String hdd,String ram)
//	{
//	this.HDD=hdd;
//	this.RAM=ram;
//	}
//	
//	
//	public ComputerBuilder setBluetoothEnabled(boolean isBletoothEnabled)
//	{
//		this.isBluetoothEnabled=isBletoothEnabled;
//		
//		return this;
//	}
//	
//	public Computer build()
//	{
//		return new Computer(this);
//	}
//	
//}
