package dp;

import java.util.Stack;

public class NextGreaterElementRight {

	
	public static void main(String[] args)
	{
		
		int[] a= {2,5,9,3,1,12,6,8,7};
		
		int n=a.length;
		
		int[] ans=new int[a.length];
		
		
		Stack<Integer>st=new Stack();
		
		
		ans[n-1]=-1;
		
		st.push(a[n-1]);
		
		for(int i=n-2;i>=0;i--)
		{
			
			while(st.size()>0&&st.peek()<a[i])
			{
				
				st.pop();
				
			}
			if(st.size()==0)
			{
				ans[i]=-1;
				st.push(a[i]);
			}
			else
			{
				ans[i]=st.peek();
				st.push(a[i]);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}
	
	
	// sometimes index need to store
	
	//stock span
	//sliding window max
	
}
