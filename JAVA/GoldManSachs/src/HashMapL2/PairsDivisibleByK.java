package HashMapL2;

import java.util.HashMap;

public class PairsDivisibleByK {
	
	
	
	public static void main(String[] args)
	{
		
		
		int[] arr= {10,11,23,45,6,7,8,1,9,10};
		
		
		int k=7;
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		
		for(int val:arr)
		{
			int rem=val%k;
			
			hm.put(rem, hm.getOrDefault(rem, 0)+1);
			
		}
		
		
		for(int val:arr)
		{
			int rem=val%k;
			
			if(rem==0)
			{
				
				if(hm.get(rem)%2!=0)
				{
					System.out.println("All pair frequency not divivible by K");
					return;
				}
			}else if(2*rem==k)
			{
				
				if(hm.get(rem)%2!=0)
				{
					System.out.println("All pair frequency not divisble by K");
					return;
				}
				
			}else
			{
				int fq=hm.get(rem);
				int ofq=hm.getOrDefault(k-rem,0);
				
				if(fq!=ofq)
				{
					System.out.println("All pair not divisble by given K");
					return;
				}
			}
		}
		
		System.out.println("All pair frequency divivble by k");
		
		return;
	}

}
