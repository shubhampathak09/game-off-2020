package dp;

public class testI {

	public void read()
	{
		System.out.println("this is testI");
	}
	
	public static void main(String[] args)
	{
	
		testc t =new testc();
		
		t.read();
		
	}
}
class testc extends testI
{
    	
	public void read()
	{
		  super.read();
		System.out.println("this is testc");
	}
	
}
