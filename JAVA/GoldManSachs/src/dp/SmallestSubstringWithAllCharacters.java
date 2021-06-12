package dp;

import java.util.HashMap;

public class SmallestSubstringWithAllCharacters {

	public static String solution(String s1,String s2)
	{
		
		String ans="";
		
		HashMap<Character,Integer>map2=new HashMap<>();
		
		
       		for(int i=0;i<s2.length();i++)
       		{
       			
       			char ch=s2.charAt(i);
       			map2.put(ch, map2.getOrDefault(ch,0)+1);
       			
       		}
       		
       		int cmatch=0;
       		int dmatch=s2.length();
       		
       		
       		HashMap<Character,Integer>map1=new HashMap<>();
       		
       		int i=-1;
       		int j=-1;
       		
       		while(true)
       		{
       			
       			boolean flag1=false;
       			boolean flag2=false;
       			
       			while(i<s1.length()-1&&cmatch<dmatch)
       			{
       				
       				i++;
       				char ch=s1.charAt(i);
       				map1.put(ch, map1.getOrDefault(ch,0)+1);
       				
       				if(map1.getOrDefault(ch, 0)<=map2.getOrDefault(ch, 0))
       				{
       					cmatch++;
       					
       				}
       				flag1=true;
       			}	
       			while(j<i&&cmatch==dmatch)
       				{
       					String pans=s1.substring(j+1,i+1);
       				     if(ans.length()==0||pans.length()<ans.length())
       				     {
       				    	 ans=pans;
       				     }
       				     
       				     // release
       				     
       				     j=j+1;
       				     char ch=s1.charAt(j);
       				     
       				     if(map1.get(ch)==1)
       				     {
       				    	 map1.remove(ch);
       				     }
       				     else
       				     {
       				    	 map1.put(ch, map1.get(ch)-1);
       				     }
       				     
       				     if(map1.getOrDefault(ch, 0)<map2.getOrDefault(ch, 0))
       				     {
       				    	 cmatch=cmatch-1;
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
       				
       				String s1="dbaecbbabdcaafbddcabgba";
       				
       				String s2="abbcdc";
       				
       				
       				String res=solution(s1,s2);
       				
       				
       				System.out.println(res);
       			}
       		
		
		 
		
	}
	
	

