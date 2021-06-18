package set1;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxMin {
	
	
	public static void main(String[] args)
	{
		
		
		int[] a= {7,10,4,3,20,15};
		
		int n=a.length;
		
		PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		int k=2;
		
		for(int i=0;i<n;i++)
		{
		    while(pq.size()<=k)
		    {
		    	pq1.add(a[i]);
		    	pq.add(a[i]);
		    }
			if(pq.size()>k)
				pq.remove();
			
			if(pq1.size()>k)
				pq1.remove();
		}
		
		 //System.out.print(pq);
	   // peek will have kth largesr element
		int ans=pq.peek();
		
		System.out.println(ans);
		
		int ans1=pq1.peek();
		
		System.out.println("Kth Min Element in heap:-"+ans1);
}

}
