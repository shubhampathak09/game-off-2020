package set1;

public class CyclicallyRotateArray {

	
	public static void main(String[] args)
	{
		
		
		int[] a= {1,2,3,4,5};
		
		
		int n=a.length;
		
		int temp=a[n-1];
		
	//	int k=1;
		
		//k=k%n;
		
		for(int i=n-1;i>=1;i--)
		{
			a[i]=a[i-1];
		}
		
		a[0]=temp;
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
