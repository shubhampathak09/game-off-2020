package dp;

public class MCM {

	
	public static int solve(int[] p,int i,int j)
	{
		if(i==j)
			return 0;
		
		int ans=Integer.MAX_VALUE;
		
		for(int k=i;k<=j-1;k++)
		{
		int temp=solve(p,i,k)+solve(p,k+1,j)+p[i-1]*p[k]*p[j];
		ans=Integer.min(ans, temp);
		}
		return ans;
		
	}
	
	public static void main(String[] args)
	{
		
		int[] p= {40,20,30,10,30};
		
		
		int n=p.length;
		
		int ans=solve(p,1,n-1);
		
		System.out.println(ans);
	}
}
