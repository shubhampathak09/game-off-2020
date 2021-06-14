package dp;

import java.util.ArrayList;
import java.util.HashMap;

public class SecondMostRepeatedString {
	
	
	public static void main(String[] args)
	{
		
		ArrayList<String>ar=new ArrayList<>();
		
		
		ar.add("aaa");
		ar.add("aaa");
		
		ar.add("bb");
		ar.add("bb");
		ar.add("bb");
		
		ar.add("c");
	
		
		HashMap<String,Integer>hm=new HashMap<>();
		
		
		for(String s:ar)
		{
			hm.put(s, hm.getOrDefault(s,0)+1);
		}
		
		String most="";
		String secondmost="";
       
		int mf=0;
		int smf=0;
		
		for(String s:hm.keySet())
		{
			if(hm.get(s)>mf)
			{
				smf=mf;
				mf=hm.get(s);
				secondmost=most; 
				most=s;
				 
			}else if(smf<hm.get(s)&&hm.get(s)<mf)
			{
				smf=hm.get(s);
				secondmost=s;
			}
			else
			{
			//	no updates
			}
		}
		
		System.out.println(most);
		System.out.println(secondmost);
		
	}

}
