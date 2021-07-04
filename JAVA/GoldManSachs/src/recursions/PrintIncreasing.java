package recursions;

public class PrintIncreasing {
	
	
	public static void printInc(int n)
	{
		if(n==0)
		{
			return;
		}
		
		printInc(n-1);
		
		System.out.println(n);
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		int n=5;
		
		// 1
		//2
		//3
		//4
		//5
		
		
		printInc(n);
	}

}
