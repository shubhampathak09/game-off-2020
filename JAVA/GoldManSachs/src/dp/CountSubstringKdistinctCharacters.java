package dp;

import java.util.HashMap;

public class CountSubstringKdistinctCharacters {

	
	
	 
		
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
		
		
	public static void removeInMap(HashMap<Character,Integer>map,char ch)
	{
		
		if(map.get(ch)==1)
		{
			map.remove(ch);
		}
		else
		{
			map.put(ch, map.get(ch)-1);
		}
	}
	
public static void main(String[] args)
{
	

	int ans=0;
	
	HashMap<Character,Integer>big=new HashMap<>();
	HashMap<Character,Integer>small=new HashMap<>();
	
	String s="";
	
	int is=-1;
	int ib=-1;
	int j=-1;

	int k=3;
	
	while(true)
	{
		boolean flag1=false;
		boolean flag2=false;
		boolean flag3=false;
		
		while(ib<s.length()-1)
		{
			ib++;
			char x=s.charAt(ib);
			big.put(x,big.getOrDefault(x, 0)+1);
			
			if(big.size()>k)
			{
				removeInMap(big,x);
				ib--;
				break;
			}
			flag1=true;
		}
		// tough question
		while(is<ib)
		{
			is++;
			char x=s.charAt(is);
			small.put(x, small.getOrDefault(x, 0)+1);
			
			if(small.size()==k)
			{
				removeInMap(small,x);
				is--;
				break;
			}
			flag2=true;
		}
		
		while(j<is)
		{
			if(big.size()==k&&small.size()==k-1)
			{
				ans+=ib-is;
			}
			
			j++;
			char ch=s.charAt(j);
			removeInMap(big,ch);
			removeInMap(small,ch);
			
			if(small.size()<k-1||big.size()<k)
			{
				break;
			}
			flag3=true;
		}
		
		if(flag1==false&&flag2==false&&flag3==false)
		{
			break;
		}
	}
	
	System.out.println(ans);
}

		 
		
		// need to revirw
// this problem
}
