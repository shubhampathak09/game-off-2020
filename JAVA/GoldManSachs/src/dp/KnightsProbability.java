package dp;

public class KnightsProbability {

	static int[] dx= {2,2,1,-1,-2,-2,-1,1};
	static int[] dy= {1,-1,2,2,1,-1,-2,-2};
	
	public static void sol(int r,int c,int n,int k)
	{
		
		
		double dp1[][]=new double[n][n];
		double dp2[][]=new double[n][n];
		
		dp1[r][c]=1;
		
		if(n==1)
		{
			System.out.println(dp1[r][c]);
			return;
		}
		
		for(int m=1;m<=k;m++)
		{
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					
					if(dp1[i][j]!=0)
					{
						
						
						for(int s=0;s<8;s++)
						{
							
							int nxi=i+dx[s];
							int nyi=j+dy[s];
							
							if(nxi>=0&&nxi<n&&nyi>=0&&nyi<n)
							{
								dp2[nxi][nxi]=  (dp1[i][j]/8.0);
							}
						}
												
						
					}
					
				}
			}
		     
			
			dp1=dp2;
			dp2=new double[n][n];
			
		}
		double tot=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//System.out.print(dp1[i][j]+" ");
				tot+=dp1[i][j];
			}
			System.out.println();
		}
		
		
		
		System.out.println("total probability that knight will remain on cheessboard is.."+tot);
	}
	
	public static void main(String[] args)
	{
		
		int n=1;
		
		int r=0;
		int c=0;
		
		int k=1;
		
		sol(r,c,n,k);
		
	}
	
}
