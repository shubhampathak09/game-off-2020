package dp;

public class MaximumSumSubarraySizeK {

	
	public static void main(String[] args)
	{
		
		int[] arr= {100,200,300,400};
		
		int n=arr.length;
		
		
		int k=2;
		
		int count=0;
		
		int wsum=0;
		
		int maxsum=Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++)
		{
			wsum+=arr[i];
		}
		
		if(maxsum<wsum)
		{
			maxsum=wsum;
		}
		
		for(int i=k;i<n;i++)
		{
		wsum=wsum+arr[i]-arr[i-k];	 
		
		if(wsum>maxsum)
		{
			maxsum=wsum;
		}
	    
		
		}
 		
	    System.out.println(maxsum);
		
	}
 	
}
