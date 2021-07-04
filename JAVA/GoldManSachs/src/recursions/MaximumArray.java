package recursions;

public class MaximumArray {

	
	public static int getmax(int[] arr,int indx)
	{
		
		if(indx==arr.length)
		{
			return Integer.MIN_VALUE;
		}
		
	    int f=arr[indx];
		int mx=getmax(arr,indx+1);
		return Math.max(f, mx);
		
		
	}
	
	public static void main(String[] args)
	{
		
		int[] arr= {100,0,1,2,3,4,99};
		
		System.out.println(getmax(arr,0));
		
	}
	
}
