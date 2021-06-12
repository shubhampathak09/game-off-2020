package dp;

import java.util.HashMap;

 

public class EveryPairDivisibleByK {

	
	
	// think about the nature of remainders
	
	// kn+x  kn+(k-x) 
	
	
	// secind type numbers that leave zero remainder
	
	
	public static void main(String[] args)
	{
		
	// 10
		
		// 77 22 56 45 55 11 34 78 29 23
		
		int[] a= {9,56,25,72,44,80,36,96,71,55};
		
		int k=8;
		
 		// vreate  hashmap number vs freq
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		
		for(int i=0;i<a.length;i++)
		{
			int rem=a[i]%k;
		   if(hm.containsKey(rem)==true)
		   {
			   hm.put(rem, hm.get(rem)+1);
			   
		   }else
			   hm.put(rem, 1);
		}
		
		
		for(int val:a)
		{
			int rem=val%k;
			
			if(rem==0)
			{
				int fq=hm.get(rem);
				if(fq%2==1)
				{
					System.out.println(false);
					return;
				}
			}
				
			else if(2*rem==k)  // k=k/2
			{
			 int fq=hm.get(rem);
			 if(fq%2==1)
			 {
				 System.out.println(false);
				 return;
			 }
		 
			 }
		else
		{
			 int fq=hm.get(rem);
			 int ofq=hm.get(k-rem);
			 if(fq!=ofq)
			 {
				 System.out.println(false);
				 return;	
		}
			
	}
			
	}
	 System.out.println(true);
}
	
}
	
	

