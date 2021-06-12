package dp;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {


	public static void main(String[] args)
	{
		
		                      //    6
		int[] arr= {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		int[] a= {15,-2,0,-8,3,7,10,23};
		
		int n=a.length;
		
		int currsum=0;
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int mxlen=0;
		for(int i=0;i<n;i++)
		{
			currsum+=a[i];
			
			if(currsum==0)
			{
				mxlen=Math.max(mxlen, i+1);
			}
			
		 if(hm.containsKey(currsum)==false)
		 {
			 hm.put(currsum, i);
		 }
		 else
		 {
			 int previndex=hm.get(currsum);
			 int currindex=i;
			 mxlen=Math.max(mxlen, currindex-previndex);
		 }
		}
		
		
		System.out.println(mxlen);
	}
	
	
	
}

