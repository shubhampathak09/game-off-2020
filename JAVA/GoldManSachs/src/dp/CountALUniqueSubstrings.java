package dp;

import java.util.HashMap;

public class CountALUniqueSubstrings {

	
	public static void main(String[] args)
	{
		
		int ans=0;
		
		int i=-1;
		int j=-1;
		
		String s="aabcbcdbca";
	 
		
		
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		while(true)
		{
			boolean flag1=false;
			boolean flag2=false;
			
			while(i<s.length()-1)
			{
				i++;
				char ch=s.charAt(i);
				
				map.put(ch,map.getOrDefault(ch,0)+1);
				
				if(map.get(ch)==2)
				{
					break;
				}else
				{
					ans+=i-j;
				}
				
				flag1=true;
			}
			
			while(j<i)
			{
				j++;
				char ch=s.charAt(j);
				map.put(ch, map.get(ch)-1);
				
				if(map.get(ch)==1)
				{
					ans+=(i-j);
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
