package dp;

public class LongestCommonSubstring {
	
	
	
	public static void main(String[] args)
	{
		
		
		String s1="ababa";
		String s2="aba";
		
		int[][] dp=new int[s1.length()+1][s2.length()+1];
		
		
		int ovmax=0;
		
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				if(i==0||j==0)
				{
					dp[i][j]=0;
				}
				
				
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
					
					if(ovmax<dp[i][j])
					{
						ovmax=dp[i][j];
					}
					
				}
				else
				{
					dp[i][j]=0;
				}
			}
		}
		
		
		System.out.println(ovmax);
	}

}
