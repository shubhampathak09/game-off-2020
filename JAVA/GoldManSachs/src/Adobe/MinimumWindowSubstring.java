package Adobe;

import java.util.HashMap;

public class MinimumWindowSubstring {
	
	
	
	public static  String solve(String s1,String s2)
	{
		
		
	//	String ans="";
		
		
		HashMap<Character,Integer>map2=new HashMap<>();
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}
		
		// store frqurncu
		int mct=0;
		int dmct=s2.length();
		
		
		HashMap<Character,Integer>map1=new HashMap<>();
		
		int i=-1;
		int j=-1;
		
		String ans1="";
		
		while(true)
		{
		//	System.out.println(1);
		    //acquire
			boolean flag1=false;
			boolean flag2=false;
			
			while(i<s1.length()-1&&mct<dmct)
			{
				i++;
				char ch=s1.charAt(i);
				map1.put(ch, map1.getOrDefault(ch, 0)+1);
				
				if(map1.getOrDefault(ch, 0)<=map2.getOrDefault(ch, 0))
				mct++;
				
				flag1=true;
			}
			// collect and release
			
			while(j<i&&mct==dmct)
			{
				// check the valid ans
				String pans=s1.substring(j+1,i+1);
			//	System.out.println(pans);
				if(ans1.length()==0||pans.length()<ans1.length())
				{
				//	System.out.println(ans1);
					ans1=pans;
				}
				
				j++;
				if(map1.get(s1.charAt(j))==1)
				{
					map1.remove(s1.charAt(j));
				}else
				{
					map1.put(s1.charAt(j), map1.get(s1.charAt(j))-1);
				}
				
				if(map1.getOrDefault(s1.charAt(j), 0)<map2.getOrDefault(s1.charAt(j), 0)) {
					mct--;
				}
				flag2=true;
				
			}
			
			if(flag1==false&&flag2==false)
				break;
		}
		
		return ans1;
		
	}
	
	public static void main(String[] args)
	{
		
		String s1="ADOBECODEBANC";
		
		String s2="ABC";
		
		System.out.println(solve(s1,s2));
		
	}

}
