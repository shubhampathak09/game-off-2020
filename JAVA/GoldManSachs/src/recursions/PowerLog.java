package recursions;

public class PowerLog {

	
	public static int power(int n,int x)
	{
		
	 if(x==0)
		 return 1;
	 
	 int ans=power(n,x/2);
	 
	 if(x%2==0)
	 {
		
		 return ans*ans;
	 }
		
	 else
	 {
		 return ans*ans*n;
	 }
	}
	
	public static void main(String[] args)
	{
		
		int n=5;
		
		int result=power(5,2);
		
		
		System.out.println(result);
		
		
		int result2=power(5,3);
		
		System.out.println(result2);
	}
	
}
