package dp;

public class PermutationWithSpaces {

	
	public static void print(String inp,String op,int index)
	{
		if(index==inp.length())
		{
			System.out.println(op);
			return;
		}
		
		char x=inp.charAt(index);
		String op1=op;
		String op2=op;
		op1=op1+x;
		op2=op2+" "+x;
		print(inp,op1,index+1);
		print(inp,op2,index+1);
	}
	
	public static void main(String[] args)
	{
		
		print("abc","a",1);
		
	}
	
}
