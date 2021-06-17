package dp;

import java.util.HashMap;

public class HighestFrequency {
	
	public static void main(String[] args)
	{
		
		
		String s1="abracadabra";
				
				int n=s1.length();
		
			//	int mx=Integer.MIN_VALUE;
				
		HashMap<Character,Integer>hm=new HashMap<>();
		
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				
				if(hm.containsKey(ch)==true)
				{
					int currfreq=hm.get(ch);
					hm.put(ch, currfreq+1);
				//	mx=Math.max(mx, currfreq+1);
				}
				else
				{
					hm.put(ch, 1);
					//mx=Math.max(mx, 1);
				}
			
					
				
			}
			
			int mxf=Integer.MIN_VALUE;
			char x=' ';
			for(char ch:hm.keySet())
			{
				
				if(hm.get(ch)>mxf)
				{
					mxf=hm.get(ch);
					x=ch;
				}
				
			}
		
			
			System.out.print(x+" "+mxf);
	}

}
