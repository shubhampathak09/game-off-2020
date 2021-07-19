package Adobe;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
	
	
	public static int solve(String s)
	{
		int ans=0;
		
		
		int i=-1;
		int j=-1;
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		while(true) {
		boolean flag1=false;
		boolean flag2=false;
		while(i<s.length()-1)
		{
			
			i++;
			char ch=s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			if(map.get(ch)==2)
			{
				break;
			}
			else
			{
				int len=i-j;
				if(len>ans)
				{
					ans=len;
				}
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
				break;
			}
			flag2=true;
			
		}
		if(flag1==false&&flag2==false)
			break;
		}
		
	
		return ans;
		
	}
	
		
	public static void main(String[] args)
	{
		String s="BBBB";
		
		int result=solve(s);
		
		System.out.println(result);
		
	}
	
	}
