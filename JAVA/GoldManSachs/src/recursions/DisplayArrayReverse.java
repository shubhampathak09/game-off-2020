package recursions;

public class DisplayArrayReverse {
	
	public static void displayReverse(int[] arr,int index)
	{
		if(index==arr.length)
		{
			return;
		}
		
		displayReverse(arr,index+1);
		System.out.print(arr[index]+" ");
	}
	
	
	public static void main(String[] args)
	{
		
		int[] arr= {3,1,2,4,5,6,7,9,0,1};
		
		displayReverse(arr,0);
	}

}
