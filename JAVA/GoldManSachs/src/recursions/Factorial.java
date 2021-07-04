package recursions;

public class Factorial {

	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		int result=fact(n-1);
		
		return n*result;
	}
	
	public static void main(String[] args)
	{
		
		
		int n=5;
		
		int ans=fact(n);
		
		System.out.println(ans);
	}
	
}
