package Adobe;

public class ProductMaxMin {

	
	public static void solve1(int[] arr1,int[] arr2)
	{
		
		int mx=arr1[0];
		int mn=arr2[0];
		
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]>mx)
				mx=arr1[i];
			
			if(arr2[i]<mn)
				mn=arr2[i];
						
		}
        
		
		System.out.println(mx*mn);
	}
	
	public static void main(String[] args)
	{
		int[] arr1= {5,7,9,3,6,2};
		int[] arr2= {1,2,6,-1,0,9};
		
		solve1(arr1,arr2);
	   // 23 more to go	
	}
}

