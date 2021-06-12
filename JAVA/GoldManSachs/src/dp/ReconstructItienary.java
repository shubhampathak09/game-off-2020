package dp;

import java.util.HashMap;
import java.util.Scanner;

public class ReconstructItienary {

	
	//<string bs boolean>
	public static void main(String[] args)
	{
		int n;
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		 
		HashMap<String,String>map=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{ 
			String s1=s.next();
			String s2=s.next();
			
			map.put(s1, s2);
		
		 }
		
		
		HashMap<String,Boolean>psrc=new HashMap<>();
		// find src
		for(String src:map.keySet())
		{
			 String dest=map.get(src);
			 psrc.put(dest, false);
			 
			 if(psrc.containsKey(src)==false)
			 {
				 psrc.put(src, true);
			 }
		}
		
		
		String osrc="";
		
		for(String pot:psrc.keySet())
		{
			Boolean val=psrc.get(pot);
			if(val==true)
			{
				osrc=pot;
				break;
			}
		}
		
		while(true)
		{
			
			if(map.containsKey(osrc)==true)
			{
				System.out.print(osrc+" -> ");
				osrc=map.get(osrc);
				
			}else
			{  System.out.print(osrc+" ->.");
				break;
			}
			
		}
		
	}
}
