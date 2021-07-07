package Adobe;

public class CountNumnberofSetBits {

	
	public static void main(String[] args)
	{
		
		int x=13;
		int count=0;
		
		while(x!=0)
		{
		count+=(x&1);
		x=(x>>1);
		}
		System.out.println(count);
	}
	
}
