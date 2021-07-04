package recursions;

public class PrintDecreasingIncreasing {
	
	
	public static void pdi(int n)
	{
		if(n==0)
		{
			return;
		}
		
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args)
	{
		
		int n=5;
		
		
		pdi(n);
		
		/* 5
		   4
		   3
		   2
		   1
		   1
		   2
		   3
		   4
		   5
		*/
	}

}
