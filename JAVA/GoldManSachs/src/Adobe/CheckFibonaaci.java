package Adobe;

import java.util.HashMap;

public class CheckFibonaaci {
	
//	
//	public static int[] dp=new int[100001];
//	
//	public static int check(int n)
//	{
//		
//		
//		if(n==1||n==0)
//			return n;
//	
//		if(dp[n]!=-1)
//			return dp[n];
//		
//		return dp[n]=check(n-1)+check(n-2);
//		
//			
//		
//	}
//    
//	public static boolean checkFib(int n)
//	{
//		
//		if(n==0||n==1)
//		return true;
//		
//		int first=check(n-1);
//		int second=check(n-2);
//		
//		if(first+second==n)
//			return true;
//		else
//			return false;
//	}
//	
//	public static void main(String[] args)
//	{
//		
//		//int n=8
//				
//		for(int i=0;i<dp.length;i++)
//			dp[i]=-1;
//		
//		 
//		check(10000);
//		
//		
//		
//	}
	
//	public static boolean check(int n)
//	{
//		
//		
//		if(n==0||n==1)
//			return true;
//		
//		
//		boolean prev1=check(n-1);
//		boolean prev2=check(n-2);
//		
//		return (prev1&&prev2);
//	}
//	
//	public static void main(String[] args)
//	{
//		System.out.println(check(5));
//		
//		System.out.println(check(4));
//	}
	public static int[] dp=new int[100001];
	public static HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();;
	
	public static void genrate()
	{
		 
		dp[0]=0;
		dp[1]=1;
		
        hm.put(0, 1);
   		hm.put(1, 2);
	 
		
		for(int i=2;i<=100000;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
			hm.put(dp[i], i+1);
		}
		
		
	}
	
	public static int getIndex(int n)
	{
		int x=hm.getOrDefault(n,-1);
		return x;
		
	}
	
	public static boolean check(int n)
	
	{
		
	//	int index=getIndex(n);  // -1
	    
		if(hm.containsKey(n)==true)
			return true;
		else
			return false;
	 
	}
	
	
	public static void main(String[] args)
	{
		
		genrate();
		
		System.out.println(check(41));
	}
	
	// simple solution 5n*n+4 || 5*n*n-4 is perfect square then and only then number is fibonacci
	
}
