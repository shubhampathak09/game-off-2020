package dp;

import java.util.*;

public class KClosestPointsFromOrigin {

	public static class Pair implements Comparable<Pair>
	{
		
		int first;
		int second;
		int distance;
		
		Pair(int first,int second)
		{
			
			
			this.first=first;
			this.second=second;
			
			this.distance=first*first+second*second;
			
		}
		
		
		public int compareTo(Pair p)
		{
			
	return this.distance-p.distance;
			
		}
	}
	
	public static void main(String[] args)
	{
		
		
		int[][] arr= { new int[] {1,3},new int[] {-2,2}};
		
		PriorityQueue<Pair>pq=new PriorityQueue<>();
		
	//	int k=1;
		
		for(int i=0;i<arr.length;i++)
		{
			 
				int x=arr[i][0];
				int y=arr[i][1];
				
				 
				Pair p=new Pair(x,y);
				pq.add(p);
				
			//	pq.remove();
			
		}
	
		System.out.println(pq.size());
		
//		while(!pq.isEmpty())
//		{
//			
//			Pair p=pq.remove();
//			System.out.println(p.first+" "+p.second);
//		}
		
//		while(pq.size()>0)
//		{
//			Pair p=pq.remove();
//			System.out.println(p.first+" "+p.second);
//		}
		int k=1;
		
		int count=0;
		
		System.out.println("First "+ k+" closest points are as follows..");
		while(pq.size()>0&&count<k)
		{
			Pair p=pq.remove();
		System.out.println(p.first+" "+p.second);
		count=count+1;
		
		}
	}
	
}
