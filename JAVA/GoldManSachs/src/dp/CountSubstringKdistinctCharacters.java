package dp;

import java.util.HashMap;

public class CountSubstringKdistinctCharacters {

	
	
	public static void main(String[] args)
	{
		
//		
//		
//		int k=3;
//		
//		String s="abcbaa";
//		
//		
//		int count=0;
//		
//		int i=-1;
//		int j=-1;
//		
//		HashMap<Character,Integer>map=new HashMap<>();
//		
//		
//		
//		while(true)
//		{
//			boolean flag1=false;
//			boolean flag2=false;
//			
//			while(i<s.length()-1)
//			{
//				i++;
//				char x=s.charAt(i);
//				map.put(x, map.getOrDefault(x, 0)+1);
//				
//				if(map.size()>k)
//				{
//					break;
//				}else if(map.size()==k)
//				{
//					count+=(i-j);
//				}
//				 
//				flag1=true;
//			}
//			while(j<i)
//			{
//				
//				j++;
//				char x=s.charAt(j);
//				if(map.get(x)==1)
//					map.remove(x);
//				else
//				map.put(x, map.get(x)-1);
//				
//				if(map.size()==k)
//				{
//					count+=(i-j);
//					break;
//				}
//				
//				flag2=true;
//			}
//			
//			
//			if(flag1==false&&flag2==false)
//			{
//				break;
//			}
//		}
//		
//		
//		System.out.println(count);
//	}
		

		
		// slightly differnet approach to be followed here
		
}
}