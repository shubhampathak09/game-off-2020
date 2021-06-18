package set1;

public class DutchNationalFlag {
	
	
	
	public static void main(String[] args)
	{
		
		
		int[] a= {0,1,2,0,1,2};
		
		int n=a.length;
		
		
		int low=0;
		int mid=0;
		int high=n-1;
		int temp;
		while(mid<=high)// key thing to make sure switch happens again and again until sorted
		{
			
			switch(a[mid])
			{
			
			case 0:
				temp=a[mid];
				a[mid]=a[low];
				a[low]=temp;
			   
			    low++;
			    mid++;
			    break;
			    
			case 1:
				
			    mid++;
			    break;
			    
			case 2:
				 temp=a[high];
				 a[high]=a[mid];
				 a[mid]=temp;
				 high=high-1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
