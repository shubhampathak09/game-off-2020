package dp;

public class EggDrop {

	
	public static int eggdrop(int n,int k,int[][] dp)
	{
		
		
		if(n==1)
			return k;
		
		if(k==1||k==0)
			return k;
		
		
		if(dp[n][k]!=-1)
		return dp[n][k];
		
		int res=Integer.MAX_VALUE;
		 
		for(int i=1;i<=k;i++)
		{
			int temp=1+Math.max(eggdrop(n-1,i-1,dp), eggdrop(n,k-i,dp));
			res=Math.min(res, temp);
		}
		
		return dp[n][k]=res;
	}
	
	public static void main(String[] args)
	{
		
		
		int n=2;
		int k=10;
		
		int[][] dp=new int[1000][1000];
		
		
		for(int i=0;i<1000;i++)
		{
			for(int j=0;j<1000;j++)
				
			 dp[i][j]=-1;
		}
		
		int ans=eggdrop(n,k,dp);
		
		System.out.println(ans);
		
	}
}
