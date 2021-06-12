package dp;

import java.util.HashMap;

public class LongestSubstringNonrepeatedChar {

	public static void main(String[] args)
	{
		
		String s1="abbacbcdbadbdbbdcb";
		
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		
		int i=-1;
		int j=-1;
		int ans=0;
		
		
		
		
		while(true)
		{

			boolean flag1=false;
			boolean flag2=false;	
			
			while(i<s1.length()-1)
			{
				i++;
				char ch=s1.charAt(i);
				 
				map.put(ch, map.getOrDefault(ch, 0)+1);
				
				if(map.get(ch)==2)
				{
					break;
				}else
				{
					int len=i-j;
					if(ans<len)
						ans=len;
				}
				
				flag1=true;
			}
			
			// release
			
			while(j<i)
			{
				j++;
				char ch=s1.charAt(j);
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==1)
				{
					break;
				} 
			flag2=true;
		}
			
		if(flag1==false&&flag2==false)
		{
			break;
		}
			
		
	}
		
	
System.out.println(ans);
		
	}
	
}
