package dp.TestCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DigitDpClassical {
	
	// 8digts
	static int[][][] dp=new int[10][2][74];
	
	
	static void fill_all(int[][][] dp,int s,int p,int q)
	{
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<p;j++)
			{
				for(int k=0;k<q;k++)
					dp[i][j][k]=-1;
			}
		}
	}
	
	static int g(String num,int pos,int tight,int sum)
	{
		if(pos==num.length())
		{
			return sum;
		}
		else if(dp[pos][tight][sum]!=-1)
		{
			return dp[pos][tight][sum];
		}
		else if(tight==1)
		{
			int res=0;
			
			for(int i=0;i<=num.charAt(pos)-'0';i++)
			{
				if(i==num.charAt(pos)-'0')
				{
					res+= g(num,pos+1,1,sum+i);
				}else
				{
				res+= g(num,pos+1,0,sum+i);	
				}
			}
			
			return dp[pos][tight][sum]=res;
		}
		else
		{
			int res=0;
			for(int i=0;i<=9;i++)
			{
				res+=g(num,pos+1,0,sum+i);
			}
			
			return dp[pos][tight][sum]=res;
		}
		 
	}
	
	
	public static void main(String[] args)
	{
		
		int l=2;
		int r=9;
		l=l-1;
		
		String a=""+l;
		String b=""+r;
		
	//	Arrays.fill(dp, -1);
		fill_all(dp,10,2,74); 
		int ans1=g(a,0,1,0);
		fill_all(dp,10,2,74);
	//	Arrays.fill(dp, -1);
		
		int ans2=g(b,0,1,0);
		
         System.out.println(ans2-ans1);
         
	}

}
// wtf 428?? 
//fixed