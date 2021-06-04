package dp;

import java.util.*;

public class InfixEvaluation {

   public static int precedence(char op)
    {
    	
    	if(op=='+') {
    		return 1;
    	}else if(op=='-')
    	{
    		return 1;
    	}else if(op=='*')
    	{
    		return 2;
    	}else
    	{
    		return 2;
    	}
    }
	
   
   public static int operation(int v1,int v2,char opr)
   {
	   
	   if(opr=='+') {
		   
		return v1+v2;   
	   }else if(opr=='-') {
		   return v1-v2;
	   }else if(opr=='*')
	   {
		   return v1*v2;
	   }else
	   {
		   return v1/v2;
	   }
   }
	public static void main(String[] args)
	{
		
		String s="(10+2*6)";
		
		int n=s.length();
		
		Stack<Integer>opnd=new Stack<>();
		
		Stack<Character>opr=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			
			
			if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
			{
			 
				
					while(opr.size()>0&&opr.peek()!='('&&precedence(s.charAt(i))<=precedence(opr.peek()))
					{
						int v2=opnd.pop();
						int v1=opnd.pop();
						Character optr=opr.pop();
						int val=operation(v1,v2,s.charAt(i));
						opnd.push(val);
					}
					opr.push(s.charAt(i));
			}
			else if(s.charAt(i)=='(')
			{
				
				opr.push(s.charAt(i));
				
			}else if(s.charAt(i)==')')
			{
				
				while(opr.peek()!='(')
				{
					char optor=opr.pop();
					int v2=opnd.pop();
					int v1=opnd.pop();
					int val=operation(v1,v2,optor);
					opnd.push(val);
				}
				opr.pop();
			}else if(Character.isDigit(s.charAt(i)))
			{
				opnd.push(s.charAt(i)-'0');
				
			}
		}
		
		while(opr.size()>0)
		{
			
			char optor=opr.pop();
			int v2=opnd.pop();
			int v1=opnd.pop();
			
			int val=operation(v1,v2,optor);
			
			opnd.push(val);
		}
		
		
	//	String infix="10+2*6";
		
		System.out.println(opnd.pop());
		
	}
	
}
// some mistakrs
