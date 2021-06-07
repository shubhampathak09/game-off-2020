package dp;

import java.util.Collections;

 

public class ReverseWordByWords {

	
	
	public static String reverse(String in)
	{
		StringBuilder sb=new StringBuilder();
		
		sb.append(in);
		
		int mid=in.length()/2;
		
		for(int i=0;i<mid;i++)
		{
			  // gg
		}
		
		
		return "";
	}
	
	public static void main(String[] args)
	{
	
		
		String s="cat and mice and rat and car";
		
		String[] p=s.split(" ");
		System.out.println(p.length);
		
		String res="";
		for(int i=0;i<p.length;i++)
		{
			
			 StringBuilder s1=new StringBuilder();
			
			 s1.append(p[i]);
			 
			 s1.reverse();
			 
			 res+=s1+" ";
			 //System.out.print(s1+" ");
		}
	  
		String s2="geeeeks";
		
		s2=s2.substring(0,s2.length()-1)+""+"z";
		
		System.out.println(s2);
		
		System.out.println(res);
	}
	
}
