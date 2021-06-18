package set1;

public class MinimiseDiffHeight {
	// one by one
	
	
	
	int solve(int[] a,int n)
	{
		
		
		
		return 0;
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		int[] a= {1,15,10};
		
		int k=6;
		
		int n=a.length;
		
		int min=a[0];
		int max=a[0];
		
		
		int newmin,newmax;
		for(int i=0;i<n;i++)
		{
		min=Math.min(a[i],min);
		max=Math.max(a[i], max);
		}
		
		int mindiff=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			
			int temp1=a[i]-k;
			
			int temp2=a[i]+k;
			
//			int oldmin=min;
//			int oldmax=max;
//			
			 newmin=Math.min(temp1, min);
			 newmax=Math.max(temp1, max);
			
			mindiff=Math.min(mindiff, newmax-newmin);
			
			newmin=Math.min(temp2, min);
			newmax=Math.max(temp2, max);
			
			mindiff=Math.min(mindiff, newmax-newmin);
		}
		
		System.out.println(mindiff);
		
//		System.out.println(min);
//		System.out.println(max);
	}

}
