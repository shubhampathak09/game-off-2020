package recursions;

public class PrintEncodings {

	
	public static void printEn(String input,String result,int i)
	{
	    if(i==input.length())
	    {
	    	System.out.println(result);
	    	return;
	    }
		
		String out1=result;
		String out2=result;
		char fi=input.charAt(i);
		out1=fi+out1;
		
		String si=input.substring(i,i+2);
		out2=si+out2;
		
		printEn(input,out1,i++);
		
		if(i<=input.length()-2)
			printEn(input,out2,i++);
	}
	
	public static void main(String[] args)
	{
		
		
		printEn("123","",0);
		
	}
	
}
