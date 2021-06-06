package dp;

public class PrintKLengthSubSets {

	public static int count;
	
	public static void solve(Character[] ch,int i,String out,int k)
	{
		
		
		if(out.length()==k)
		{
			count++;
			System.out.println(out);
			return;
		}
		// one subtle change
		if(i==ch.length )  // out.length()==k
		{
		//	count++;
		//	System.out.println(out);
			return;
		}
		// make choice for i character
		String s1=out;
		String s2=out;
		
		s1=s1+ch[i];
		solve(ch,i+1,s1,k); // choose i th character
		solve(ch,i+1,s2,k);  // dont chose
	}
	
	public static void main(String[] args)
	{
		
		Character[] ch= {'a','b','c','d'};
		
		String out="";
		
		int k=2;
		
		int i=0;
		
		solve(ch,i,out,k);
		
		System.out.println(count);
		
		
	}
	
}
