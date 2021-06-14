package dp;

public class SumSubarray {

	
	
	public static void main(String[] args)
	{
		
		
		int[] a= {1,10,5,2,7};
		
		int k=9;
		
		int mn=Integer.MAX_VALUE;
		
		int n=a.length;
		
		
		//int k=10;
		int sum=0;
		
		int i=0;
		int j=0;
		
		int count=0;
		
		while(i<=j&&j<n)
		{
//			i++;
//			j++;
//			
			while(sum<=k&&j<n)
			{
				sum+=a[j];
				j++;
			}
			
			while(sum>k&&i<j)
			{
		     count=count+1;
		  //   System.out.print(j+" "+i);
		     mn=Math.min(j-i, mn);
		   //  System.out.print(sum+" ");
		    
		     sum=sum-a[i];
		     
		     i=i+1;
			}
		}
		
		// smallest subarray with sum greater than k
		System.out.println(count);
		System.out.println(mn);
		
	}
}
