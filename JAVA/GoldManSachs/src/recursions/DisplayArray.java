package recursions;

public class DisplayArray {

	
	
	public static void display(int[] arr,int index)
	{
		
		if(index==arr.length)
		{
			return;
		}
		
		System.out.print(arr[index]+" ");
		display(arr,index+1);
		
	}
	
	public static void main(String[] args)
	{
	int[] arr= {3,1,2,4,5,6,7,9,0,1};
	
	display(arr,0);
	}
}
