package dp;

import java.util.HashMap;


public class SmallestSubstringConatiningAllUniqueCharacters {

	
	public String solve(String s1,String s2)
	{
		String ans="";
		int len=0;
		
		
		
		return ans;
		
	}
	
	public static void main(String[] args)
	{
		
		
		int len=0;
		
		String s1="bbacacdcbbcaadcdca";
		
		HashMap<Character,Integer>map2=new HashMap<>();
		
		HashMap<Character,Integer>map1=new HashMap<>();
		
        for(int i=0;i<s1.length();i++)
        {
        	char x=s1.charAt(i);
        	
        	map2.put(x, map2.getOrDefault(x, 1));
        	
        
        	
        }
        int dlength=map2.size();
		int clength=0;
		
		int i=-1;
		int j=-1;
		
		 boolean f1=false;
		 boolean f2=false;
		 
		while(true)
		{
		
		while(i<s1.length()-1&&map1.size()<map2.size())
		{
		
			i++;
			char ch=s1.charAt(i);
			map1.put(ch, map1.getOrDefault(ch,0)+1);
			 
		    f1=true;		
		}
		
		while(j<i&&map1.size()==map2.size())
		{
			
			
			int pans=(i-j);
			
			if(pans<len||len==0)
				len=pans;
			
			j++;
			char ch=s1.charAt(j);
			
			if(map1.get(ch)==1)
			{
				map1.remove(ch);
			}else
				map1.put(ch, map1.get(ch)-1);
			
			
			f2=true;
		}
		
		if(f1==false&&f2==false)
		{
			break;
		}
		
		}
		
		System.out.println(len);
		
	}
	
}
