package recursions;

public class LastIndex {
	
	public static int lastIndex(int[] arr,int index,int x)
	{
		if(index==arr.length)
		{
			return -1;
		}
		
		int ele=-1;
		
		if(arr[index]==x)
		ele=index;
		
		ele=Math.max(ele, lastIndex(arr,index+1,x)); 
		
		return ele;
	}
	public static void main(String[] arg)
	{
		
		int [] arr= {2,4,6,9,8,0,2,1};
		
		
		int ans=lastIndex(arr,0,8);
		
		System.out.println(ans);
	}

}
