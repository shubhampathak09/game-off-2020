package dp;

public class NBitBinaryNumbers {

	
	public static int count;
	
	public static void solve(int n,int one,int zero,String out)
	{
		
		
		if(one+zero==n)
		{
			count++;
			System.out.println(out);
			return;
			
		}
	
		if(zero<one)
		{
			String out1=out;
			String out2=out;
			out2=out1+0;
			out1=out+1;		
			solve(n,one+1,zero,out1);
			solve(n,one,zero+1,out2);
		}
		else
		{
			String out1=out;
			out1=out+1;	
			solve(n,one+1,zero,out1);
		}
	}
	
	public static void main(String [] args)
	{
		
		solve(4,1,0,"1");
		
		
		System.out.println(count);
	}
	
}


