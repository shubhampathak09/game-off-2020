package dp;

import java.util.HashSet;
import java.util.Iterator;

public class PrintUniqueSubsets {

	public static HashSet<String>hs;
	
	public static void solve(String inp,int start,String out,int k)
	{
		if(start==inp.length())
		{
			hs.add(out);
			return;
		 
		}
//		
//		if(out.length()==k)
//{
//	hs.add(out);
//	return;
//}
		
		char x=inp.charAt(start);
		String s1=out;
		String s2=out;
		
		s2=s2+x;
		solve(inp,start+1,s1,k);
		solve(inp,start+1,s2,k);
	}
	
	public static void main(String[] args)
	{
		
		hs=new HashSet<>();
		
		String in="xyx";
		
		String out="";
		
		int k=2;
		
		int start=0;
		
		solve(in,start,out,k);
		
		System.out.println(hs.toString());
		
		
//		Iterator<String> it=hs.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.print(it.next()+"");
//			 
//		}
	}
	
}
