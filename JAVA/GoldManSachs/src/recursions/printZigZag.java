package recursions;

public class printZigZag {

	
	
	
	public static void  pzz(int n)
	{
	
		if(n==0)
		{
			return;
		}
		
		System.out.println("Pre"+n);
		pzz(n-1);
		System.out.println("In"+n);
		pzz(n-1);
		System.out.println("Post"+n);
		pzz(n-1);
	}
	
	public static void main(String[] args)
	{
		int n=2;
		
		// pre 2 
	//	pre 1
	//	in 1
	//	post 1
	//	in 2
	//	pre 1
	//	in 1
	//	post 1
	//	post 2
	//	pre 1
	//	in 1
	//	post 1
		
		pzz(n);
	}
	
}
