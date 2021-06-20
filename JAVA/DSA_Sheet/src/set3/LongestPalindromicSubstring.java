package set3;

public class LongestPalindromicSubstring {

	
	
	public static void main(String[] args)
	{
		
		
		String s="abccbc";
		
		int mxlen=Integer.MIN_VALUE;
		
		int[][]dp=new int[s.length()][s.length()];
		
		
		for(int g=0;g<s.length();g++)
		{
			for(int i=0,j=g;j<s.length();i++,j++)
			{
				if(g==0)
					dp[i][j]=1;
				else if(g==1)
				{
					if(s.charAt(i)==s.charAt(j))
						dp[i][j]=1;
					else
						dp[i][j]=0;
				}else
				{
					if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1)
						dp[i][j]=1;
					else
						dp[i][j]=0;
				}
			
				if(dp[i][j]==1)
				{
					int len=g+1;
					if(len>mxlen)
						mxlen=len;
				}
			}
			
			
	}
		
		
		System.out.println(mxlen);
		
	}
	
}
