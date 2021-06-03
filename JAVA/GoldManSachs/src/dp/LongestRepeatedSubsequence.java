package dp;

public class LongestRepeatedSubsequence {
	
	
	public static void main(String[] args)
	{
		
		
		String s="aabb";
		
		
		String a=s;
		String b=s;
		int n=s.length();
		
		
		int[][] dp=new int[s.length()+1][s.length()+1];
		
		
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				
				if(i==0||j==0)
				{
					dp[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)&&i!=j)
				{
					dp[i][j]=1+dp[i-1][j];
				}
				else
					dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
			}
		}
		
		int res= dp[n][n];
		
		System.out.println(res);
	}

}
