package dp;

import java.util.HashMap;


public class LongestSubstringWithExactK {

	
	public static void main(String[] args)
	{
		
		
		int i=-1;
		int j=-1;
		
		String s="aabacbebebe";
		
		String ans="";
		
		HashMap<Character,Integer>map=new HashMap<>();
        
		int k=3;
		int len=0;
         		
		while(true)
		{
			
			boolean flag1=false;
			boolean flag2=false;
			while(i<s.length()-1)
			{
				
				i++;  // increase i
				char x=s.charAt(i); // get charact at
				map.put(x,map.getOrDefault(x, 0)+1);  // put in map
				
				if(map.size()>k)
				{
					break;
				}
				
				else if(map.size()==k)
				{  
					if(i-j>len)
				{
					ans=s.substring(j+1,i+1);
					len=i-j;
				}
			}else   // map.size()<k
			{
				continue;
			}
				flag1=true;
			}
			while(j<i)
			{
				
				j++;
				char x=s.charAt(j);
				
				if(map.get(x)==1)
		        map.remove(x);
				else
				{
					map.put(x, map.get(x)-1);
				}
				
				 if(map.size()==k)
				 {
					 if(i-j>len)
					 {
						 len=i-j;
						 ans=s.substring(j,i+1);
					 }
					 break;
					 
				 }
					
				 flag2=true;
				}
			
			if(flag1==false&&flag2==false)
				break;
			
			}
		
		
		   System.out.println(ans);
		}
		
	}
	

