package Adobe;

import java.util.HashMap;
public class CountSubstringWithoutRepeatingCharacters {

	
	public static int solve(String s)
	{
		
		int count=0;
		
		int i=-1;
		int j=-1;
		HashMap<Character ,Integer>map=new HashMap<>();
		
		while(true)
		{
			boolean f1=false;
			boolean f2=false;
			while(i<s.length()-1)
			{
				i++;
				char ch=s.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				if(map.get(ch)==2)
				{
					break;
				}else
				{
					//int len=(i-j);
					count+=(i-j);
				}
				f1=true;
				
			}
			while(j<i)
			{
				j++;
				char ch=s.charAt(j);
				map.put(ch, map.get(ch)-1);
				
				if(map.get(ch)==1)
				{
					count+=(i-j);
					break;
				}
				f2=true;
			}
			
			if(f1==false&&f2==false)
				break;
		}
		
		
		return count;
		
	}
	
	public static void main(String[] args)
	{
		
		String s="abba";
		int ans=solve(s);
		
	
		System.out.println(ans);
		
		
		
	}
	
}
