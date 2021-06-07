package dp;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

	
	public static void main(String[] args)
	{
		
		int t=5;
		
		while(t>0)
		{
		Stack<Character>st=new Stack<>();
		
		String s;
		
		Scanner in=new Scanner(System.in);
		
	    s=in.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)!=')')
			{
				st.push(s.charAt(i));
			}
			else
			{
			    
				if(st.isEmpty()==true||st.peek()=='(')
				{
					System.out.println("Duplicacy or inavlid");
				    return;
				}
				while(st.peek()!='(')
				{
					st.pop();
				}
				st.pop();
			}
				 
			}
		 
		if(st.isEmpty())
		{
			System.out.println("Balanced Paranttehses");
		}
		else
		{
			System.out.println("Additional Brackets Present");
		}
		
		t--;
		}
	}
}
