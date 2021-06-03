package dp;

import java.util.Arrays;

public class SubaarySort {

	
	public static int[] solve(int[] a)
	{
		
		int l=-1;
		int r=-1;
		int[] temp=a;
		
		Arrays.sort(temp);
		
		for(int i=0;i<a.length;i++)
		{
			
		if(temp[i]!=a[i])
		{
		l=i;
		break;
		}
		}
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(temp[i]+" "+a[i]);
			if(temp[i]!=a[i])
			{
				r=i;
				break;
			}
			
		}
		
		 int[] res= {l,r};
		 
		return res;
	}
	
	public static void main(String[] args)
	{
		
		
		int a[]= {1,2,3,4,5,8,6,7,9,10,11};
		
		
		int temp[]=a;
		
		
		 Arrays.sort(a);
	     for(int i=0;i<a.length;i++)
		 System.out.print(a[i]);
		 
		 System.out.println();
		 
		 for(int i:temp)
		 {
			 System.out.print(i);
		 }
	}
	
	
}
