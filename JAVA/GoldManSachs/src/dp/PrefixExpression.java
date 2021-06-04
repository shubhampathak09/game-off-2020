package dp;

import java.util.Stack;

public class PrefixExpression {

	
	public static int operation(int v1,int v2,Character op)
	{
		
		if(op=='+') {
			return v1+v2;
		}
		else if(op=='-')
		{
			return v1-v2;
		}else if (op=='*') {
			return v1*v2;
		}else  {
			return v1/v2;
		}
		 
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		Stack<Integer>vs=new Stack<>();
		
		Stack<String>is=new Stack<>();
		
		Stack<String>ps=new Stack<>();
		
		
		String exp="53+82-*";
		
		
		for(int i=0;i<exp.length();i++)
		{
			
			Character ch=exp.charAt(i);
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
			{
				
				int v2=vs.pop();
				int v1=vs.pop();
				int val= operation(v1,v2,ch); 
				
				vs.push(val);
				
				
				String iv2=is.pop();
				String iv1=is.pop();
				
				String newx="("+iv1+ch+iv2+")";
				is.push(newx);
				
				

				String pv2=ps.pop();
				String pv1=ps.pop();
				
				String newy=ch+pv1+pv2; 
				ps.push(newy);
				
			}else
			{
				vs.push(ch-'0');
				is.push(ch+"");
				ps.push(ch+"");
				
				
			}
		}
		
		System.out.println(vs.pop());
		
		System.out.println(is.pop());
		
		System.out.println(ps.pop());
		
		
	}
}
