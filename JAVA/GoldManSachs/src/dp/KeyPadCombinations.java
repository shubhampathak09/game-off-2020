package dp;


// 1. keypad combinations

import java.util.ArrayList;
public class KeyPadCombinations {
	
	public static String[] codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	 public static ArrayList<String>getKPC(String str)
	 {
		 
		 if(str.length()==0)
		 {
			 
			 ArrayList<String>br=new ArrayList<>();
			 br.add("");
			 
			 return br;
		 }
		 
		 
		 //764
		 
		 
		 char ch=str.charAt(0);
		 
		 ArrayList<String>remain=getKPC(str.substring(1));
		 ArrayList<String>finals=new ArrayList<>();
		 
		 for(int i=0;i<codes[ch-'0'].length();i++)
		 {
			 char chadd=codes[ch-'0'].charAt(i);
			 
			 for(String rs:remain)
			 {
				finals.add(chadd+rs); 
			 }
		 }
		 
		 return finals;
	 }
	public static void main(String[] args)
	{
		
		
		String key="346";
		
		ArrayList<String>combinations=getKPC(key);
		 
		int count=combinations.size();
		
		
		System.out.println(combinations);
		System.out.println(count);
	}

}
