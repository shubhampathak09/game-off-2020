package dp;

public class LongestPalindromicSubstring {
	
	
	public static int lps(String s)
	{
		int ans=0;
		
		boolean[][] dp=new boolean[s.length()][s.length()];
//		
//		int starti=0;
//		int endi=0;
		
		for(int g=0;g<s.length();g++)
		{
			
			for(int i=0,j=g;j<s.length();i++,j++)
			{
				if(g==0)
				{
					dp[i][j]=true;
				}else if(g==2)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						dp[i][j]=true;
					}
					
				}else
				{
					if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true)
					{
						dp[i][j]=true;
					}
				}
				if(dp[i][j]==true)
				{
					if(ans>g+1)
					{
//			         starti=i;
//			         endi=j;
					}
					ans=Math.max(ans, g+1);
				}
			}
		}
		
//		System.out.println(s.substring(starti,endi+1));
		 
		return ans;
	}

	
	public static void main(String[] args)
	{
		
		String s="abcba";
		
		
		int result=lps(s);
		
		System.out.println(result);
	}
}
