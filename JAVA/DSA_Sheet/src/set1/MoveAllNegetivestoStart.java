package set1;

public class MoveAllNegetivestoStart {

	public static void main(String[] args)
	{
		
		
		int[] a= {-12,11,-13,-5,6,-7,5,-3,-6};
		int n=a.length;
		
		int start=0;
		int end=n-1;
		for(int i=0;i<n;i++)
		{
			
		if(a[i]<0)
		{
			a[start]=a[i];
			start=start+1;
		}
		else
		{
			a[end]=a[i];
			end=end-1;
		}
		
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
