package set3;

import java.util.ArrayDeque;

public class PrintLAllMinCostPaths {

	private static class Pair{
		
		int i;
		int j;
		String psf;
		
		Pair(int i,int j,String psf)
		{
			this.i=i;
			this.j=j;
			this.psf=psf;
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		int[][] a= {{2,6,1,1,3},{9,1,1,0,5},{0,7,5,2,0},{4,3,0,4,7},{2,0,1,4,1}};
		int [][]dp=new int[a.length][a[0].length];
		
		for(int i=dp.length-1;i>=0;i--)
		{
			for(int j=dp[0].length-1;j>=0;j--)
			{
				if(i==dp.length-1&&j==dp[0].length-1)
				{
					dp[i][j]=a[i][j];
				}else if(i==dp.length-1)
				{
				dp[i][j]=dp[i][j+1]+a[i][j];	
				}else if(j==dp[0].length-1)
				{
					dp[i][j]=dp[i+1][j]+a[i][j];
				}else
				{
					dp[i][j]=Math.min(dp[i+1][j], dp[i][j+1])+a[i][j];
				}
			}
		}
		
		System.out.println(dp[0][0]);
		
		ArrayDeque<Pair>queue=new ArrayDeque<>();
		
		queue.add(new Pair(0,0,""));
		
	//	System.out.println(dp.length+" "+dp[0].length);
		
		while(!queue.isEmpty())
		{
			//System.out.print(1);
			Pair rem=queue.removeFirst();
			
		//	System.out.println(rem.i+" "+rem.j+" "+rem.psf);
			
			if(rem.i==dp.length-1&&rem.j==dp[0].length-1)
			{
			//	System.out.println("Here");
			System.out.println(rem.psf);	
			}
			else if(rem.i==dp.length-1)  // Last row
			{
				queue.add(new Pair(rem.i,rem.j+1,rem.psf+"H"));
			}else if(rem.j==dp[0].length-1)
			{
				queue.add(new Pair(rem.i+1,rem.j,rem.psf+"V"));
			}else
			{
				if(dp[rem.i+1][rem.j]>dp[rem.i][rem.j+1])
				{
				queue.add(new Pair(rem.i+1,rem.j,rem.psf+"H"));
				
				}else if(dp[rem.i+1][rem.j]<dp[rem.i][rem.j+1])
				{
				queue.add(new Pair(rem.i,rem.j+1,rem.psf+"V"));	
				}else
				{
					queue.add(new Pair(rem.i+1,rem.j,rem.psf+"H"));
					queue.add(new Pair(rem.i,rem.j+1,rem.psf+"V"));	
				}
			}
		}
	}
	
}
