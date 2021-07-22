package Adobe;


import java.util.*;

public class PrintAllUniqueSubstringsWithoutRepeatingCharacters {

	
	public static void solve(String s)
	{
		
		int n=s.length();
		
		HashSet<String>set=new HashSet<>();
		HashMap<Character,Integer>map=new HashMap<>();
		
		
		int i=-1;
		int j=-1;
		
		
		while(true)
		{
			boolean f1=false;
			boolean f2=false;
			
			while(i<n-1)
			{
				
				i++;
				char ch=s.charAt(i);
				map.put(ch, map.getOrDefault(ch, 1)+1);
				if(map.get(ch)==2)
				{
					break;
				}else {
					// iterate from j+1 to i, and store all possible substring, (i-j) substringd
					for(int k=j;k<=i;k++)
					{
						set.add(s.substring(k+1,i+1));
					}
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
					set.add(s.substring(j,i+1));
					break;
				}
				f2=true;
			}
			
			if(f1==false&&f2==false)
				break;
		}
		
		
		System.out.println(set);
		
	}
	// dammit
	public static void main(String[] args)
	{
		
		String s="abba";
		
		solve(s);
		
		
	}
	
}
// some inaccuracies
