package Adobe;

public class GenerateParanthesis {
	
	
	public static void generate(String ans,int opn,int cls)
	{
		if(opn==0&&cls==0)
		{
			System.out.println(ans);
			return;
		}
	    
		
		if(opn!=0)
		{
			String temp=ans;
			temp=temp+'(';
			generate(temp,opn-1,cls);
		}
		if(opn<cls)
		{
			 String temp=ans;
			 temp=temp+')';
			generate(temp,opn,cls-1);
		}
	}
	
	public static void main(String[] args)
	{
		
		int n=3;
		int opn=n;
		int cls=n;
		String ans="";
		
		generate(ans,opn,cls);
		
	}

}
