package dp;

import java.util.HashMap;

public class CountSubArrays {

	public static void main(String[] args)
	{
		
		
		int[] a= {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		
		int n=a.length;
		
		int currsum=0;
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			
		currsum+=a[i];
		if(currsum==0)
			count=count+1;
		
		if(hm.containsKey(currsum)==false)
		{
			hm.put(currsum,1);
		}
		else
		{
			count=count+hm.get(currsum);
			hm.put(currsum, hm.get(currsum)+1);
		}
		// please dry run later
		
		}
		
		System.out.println(count);
		
	}
	
}
