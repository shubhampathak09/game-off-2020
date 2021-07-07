package HashMapL2;

import java.util.HashMap;

public class CountOfZeroSumSubarray {

	
	public static void main(String[] args)
	{
		
		
		
		
		
		 
			
			
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int[] arr= {0,0,0,0};
		
		int sum=0;
		
		int i=-1;
		//hm.put(0, 1);
		
	    int count=0;
		while(i<arr.length)
		{
			i++;
			
			if(arr[i]==0)
			count++;
			
			sum+=arr[i];
			
			if(hm.containsKey(sum)==false)
			{
				
			hm.put(sum, 1);
		}else
		{
			hm.put(sum, hm.get(sum)+1);
			count=count+hm.get(sum);
		}
        
			
			
		}
		System.out.println(count);
	}
	
}


