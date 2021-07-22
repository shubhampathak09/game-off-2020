//package BuilderPattern;
//
//public class Computer {
//
//	// required parameters
//	
//	private String HDD;
//	private String RAM;
//	
//	// optional paramters
//	
//	private boolean isGraphicsCardEnabled;
//	private boolean isBluetoothEnabled;
//	
//	public String getHDD()
//	{
//		return HDD;
//	}
//	
//	public String getRAM()
//	{
//		return RAM;
//	}
//	
//	public boolean isGraphicsCardEnabled()
//	{
//		return isGraphicsCardEnabled;
//	}
//	
//	public boolean isBluetoothEnabled()
//	{
//		return isBluetoothEnabled;
//	}
//	
//	private Computer(ComputerBuilder builder)
//	{
//		this.HDD=builder.HDD;
//		this.RAM=builder.RAM;
//		
//		
//		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
//		this.isBluetoothEnabled=builder.isBluetoothEnabled;
//	}
//}
