package set1;

public class LargestSumContiguosArray {

	
	
	public static void main(String[] args)
	{
		
		
		int[] a= {-2,-3,4,-1,-2,1,5,-3};
		
		int n=a.length;
		
		
		int cursum=0;
		int maxsum=Integer.MIN_VALUE;
		
		
		for(int i=0;i<n;i++)
		{
			
			if(cursum>=0)
			{
				cursum=cursum+a[i];
			}
			else
				cursum=a[i];
			
		  maxsum=Math.max(cursum, maxsum);
		}
		
		
		System.out.println(maxsum);
	}
}
