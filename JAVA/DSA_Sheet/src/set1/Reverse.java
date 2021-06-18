package set1;

public class Reverse {

	
	public static void main(String[] args)
	{
		
		
		int[] a= {3,1,2,4,5,9,0,1};
		
		int n=a.length;
		
		System.out.println("Before reversing");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println();
		
		System.out.println("After reversing");
		
		int mid=n/2;
		
		for(int i=0;i<mid;i++)
		{
			
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
}
