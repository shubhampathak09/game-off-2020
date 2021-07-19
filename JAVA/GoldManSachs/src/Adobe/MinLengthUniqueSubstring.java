package Adobe;

import java.util.HashMap;
import java.util.HashSet;

public class MinLengthUniqueSubstring {

	
	
	public static int solve (String s)
	{
		
		int n=s.length();
		
		
		String ans="";
		
		HashSet<Character>set=new HashSet<>();
		for(int i=0;i<n;i++)
			set.add(s.charAt(i));
		
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		int len=n;
		int i=-1;
		int j=-1;
		
		while(true)
		{
			boolean flag1=false;
			boolean flag2=false;
			
			while(i<n-1&&map.size()<set.size())
			{
				i++;
				Character ch=s.charAt(i);
				
				map.put(ch, map.getOrDefault(ch, 0)+1);
				
			   flag1=true;	
			}
			while(j<i&&map.size()==set.size())
			{
				int plen=(i-j);
				if(plen<len||ans=="")
				{
					len=plen;
					ans=s.substring(j+1,i+1);
				}
				j++;
				char ch=s.charAt(j);
				if(map.get(ch)==1)
				{
					map.remove(ch);
				}else
				{
					map.put(ch, map.get(ch)-1);
				}
				flag2=true;
			}
			
			if(flag1==false&&flag2==false)
			{
				break;
			}
			
		}
		
		System.out.println(ans);
		
		return len;
		
	}
	
	public static void main(String[] args) 
	{
		
		String s1="aabcbcdbca";
		
		int rs=solve(s1);
		
		System.out.println(rs);
		
		
	}
	
}
