package dp;

public class MaxSumTwoNonOverlappingSubarrays {

	
	public static void main(String[] args)
	{
		
		int[] a = {3,8,1,3,2,1,8,9,0};
		
		int n=a.length;
		
        int x=2;
        int y=3;
        
        int[] dp1=new int[n];
        
       
        
        int[] dp2=new int[n];
        	 
        		
        		
        dp1[0]=Integer.MIN_VALUE;		
		 
        int i=0;
        int j=0;
        
        int sum=0;
        while(j<dp1.length)
        {
        	if(j-i+1<=x)
        	{
        		sum=sum+a[j];
        		j=j+1;
        	
        	}
        	dp1[j]=sum;
        	sum=sum-a[i];
        	i++;
        	j++;
        	 
        }
        
        for(int k=0;k<dp1.length;k++)
        {
        	System.out.println(dp1[i]);
        }
	}
	
}
