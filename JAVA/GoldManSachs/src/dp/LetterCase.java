package dp;

public class LetterCase {

	public static void caseChange(String in,String out,int index)
	{
		
		
		if(index==in.length())
		{
			System.out.println(out);
			return;
		}
		
		char x=in.charAt(index);
		
		
		if(Character.isDigit(x)==false)
		{
		String op1=out;
		String op2=out;
		op1=op1+Character.toLowerCase(x);
		op2=op2+Character.toUpperCase(x);
		
		caseChange(in,op1,index+1);
		caseChange(in,op2,index+1);
		}
		else
		{
			String op1=out+x;
			caseChange(in,op1,index+1);
		}
	}
	
	public static void main(String[] args)
	{
		
		caseChange("a1b2","",0);
		
	}
	
}
