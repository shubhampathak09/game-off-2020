package HashMapL2;

import java.util.HashMap;

public class ZeroSumSubaarray {
	
	
	public static void main(String[] args)
	{
		
		
		int[] arr= {4,1,0,2,3,4,5-5,-3,-1,-2,3,4,-3,4,-4,3};
		
		HashMap<Integer,Integer>map=new HashMap<>();
		
		
		int maxlen=0;
		
		int i=-1;
		
		int sum=0;
		
		map.put(sum, -1);
		
		while(i<arr.length-1)
		{
			i++;
			
			sum+=arr[i];
			
			if(map.containsKey(sum)==false)
			{
				map.put(sum, i);
			}else
			{
				int len=i-map.get(sum);
				if(len>maxlen)
					maxlen=len;
			}
		}
		
		System.out.println(maxlen);
	}

}
