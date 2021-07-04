package recursions;

public class Power {

	
	public static int power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		int xo=power(x,n-1);
		int nx=xo*x;
		
		return nx;
		
	}
	
	public static void main(String[] args)
	{
		int n=5;
		
		System.out.println(power(n,2));
		
		
	}
	
}
