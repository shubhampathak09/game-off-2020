package dp;

import java.util.Stack;

public class LargestAreaHistogram {
	
	
	public static void main(String[] args)
	{
		
	Integer[] h= {1,8,6,2,5,4,8,3,7};
	
	int n=h.length;
	
	int[] left=new int[n];
	
	int[]right=new int[n];
		
	
	Stack<Integer>s=new Stack<>();
	
	
	left[0]=-1;
	right[n-1]=n;
	
	s.push(0);
	
	for(int i=1;i<n;i++)
	{
	
		while(s.size()>0&&h[i]<=h[s.peek()])
		{
			s.pop();
			
		}
		
		if(s.size()==0)
		{
			left[i]=-1;
			
		}
		else
		{
			left[i]=s.peek();
			
		}
		s.push(i);
	}
	
	
	while(s.size()>0)
	 {
		 s.pop();
	 }
	
	s.push(n-1);
	
     for(int i=n-2;i>=0;i--)
     {
    	 
    	 while(s.size()>0&&h[i]<=h[s.peek()])
    	 {
    		 s.pop();
    	 }
    	 if(s.isEmpty())
    	 {
    		 right[i]=n;
    	 }
    	 else
    	 {
    		 right[i]=s.peek();
    	 }
    	 s.push(i);
     }
	
	
     int ans=0;
     
     for(int i=0;i<n;i++)
     {
    	 ans=Math.max(ans, (right[i]-left[i]-1)*h[i]);
     }
     
     
     System.out.println(ans);
     
//	for(int x:left)
//	{
//		System.out.print(x+" ");
//	}
	}

	 
	 
	 
}
