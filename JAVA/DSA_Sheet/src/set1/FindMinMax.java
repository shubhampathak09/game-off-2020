package set1;

public class FindMinMax {

	
	public static void main(String[] args)
	{
		
		
	   int[] a= {3,4,1,5,6,0,-1,9,2,-2,10};
	   
	   int n=a.length;
	   
	   int min=Integer.MAX_VALUE;
	   int max=Integer.MIN_VALUE;
	   
	   //int n=a.length;
	   
		for(int i=0;i<n;i++)
		{
		
			if(a[i]<min)
			{
				min=a[i];
				}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
	   
		System.out.println("Minimum value is.."+min);
		System.out.println("Maximum value is.."+max);
		
	}
	
}
