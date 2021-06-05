package dp;

 

public class SubarraySumWithSizeAtleastK {

	
	public static int findMaxSum(int a[], int k)
	{
		
		// returns max sum found in array with atleast k elements
		int n=a.length;
		
		int[] maxSumHere=new int[n];
		
		int currsum=0;
		for(int i=0;i<n;i++)
		{
			
			if(currsum>=0)
			{
				currsum+=a[i];
			}else
			{
				currsum=a[i];
			}
			maxSumHere[i]=currsum;
		}
		int windowSum=0;
		int maxWindowSumk=Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++)
		{
			windowSum+=a[i];
		}
		if(windowSum>maxWindowSumk)
		{
			maxWindowSumk=windowSum;
		}
		
		
		for(int j=k;j<n;j++)
		{
			windowSum+=a[j]-a[j-k];
			
			if(windowSum>maxWindowSumk)
			{
				maxWindowSumk=windowSum;
			}
		    if(maxSumHere[j-k]+windowSum>maxWindowSumk)
		    {
		    	maxWindowSumk=maxSumHere[j-1]+windowSum;
		    }
		}
		
		return maxWindowSumk;
	}
	public static void main(String[] args)
	{
		
		
     int[] a= {1,1,1,1,1,1};
     
     int k=2;
     
     int ans=findMaxSum(a,k);
     
     System.out.println(ans);
		
	}
	
	
	
}
