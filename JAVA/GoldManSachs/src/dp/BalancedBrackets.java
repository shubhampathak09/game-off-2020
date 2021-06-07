package dp;

import java.util.Stack;

public class BalancedBrackets {

	
	public static void main(String[] args)
	{
		
		
		String s="{{[]}}((()))";
		
		Stack<Character>st=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[')
			{
				
				st.push(s.charAt(i));
				
			}
			else
			{
				if(st.size()==0)
				{
					System.out.println("Not a Valid Expression");
					return;
				}
				
				if(ch==')')
				{
					if(st.peek()=='['||st.peek()=='{')
					{
						System.out.println("Invalid");
						return;
					}
					st.pop();
				}
				
				else if(ch=='}')
				{
					if(st.peek()=='('||st.peek()=='[')
					{
						System.out.println("Invalid");
						return;
					}
					st.pop();
				}
				else
				{
					if(st.peek()=='('||st.peek()=='{')
					{
						System.out.println("Invalid");
						return;
					}
					st.pop();
				}
			}
		}
		
		
		if(st.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
}
