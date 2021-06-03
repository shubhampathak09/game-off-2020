package dp;


import java.util.*;

public class MergeKSortedLists {

	
	public static class Pair implements Comparable<Pair>
	{
		
		int li;
		int di;
		int value;
		
		Pair(int li,int di,int value)
		{
			this.li=li;
			this.di=di;
			this.value=value;
		}
		
		public int compareTo(Pair p)
		{
			return this.value-p.value;
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		
     ArrayList<Integer>[] a=new ArrayList[5];
		
	//	int n=4;
		
		  for(int i=0;i<5;i++)
		  {
			   
			  a[i]=new ArrayList<Integer>();
			  
		  }
		  
		  
		  a[0].add(1);
		  a[0].add(2);
		  a[0].add(3);
		  a[0].add(4);
		  a[0].add(5);
		  a[0].sort(null);
		  
		  a[1].add(2);
		  a[1].add(7);
		  a[1].add(90);
		  a[1].add(-13);
		  a[1].add(4);
		  a[1].sort(null);
		  
		  
		  a[2].add(20);
		  a[2].add(71);
		  a[2].add(90);
		  a[2].add(-13);
		  a[2].add(40);
		  a[2].sort(null);
		  a[3].add(2);
		  a[3].add(0);
		  a[3].add(90);
		  a[3].add(-13);
		  a[3].add(400);
		  a[3].sort(null);
		  a[4].add(-3);
		  a[4].add(71);
		  a[4].add(90);
		  a[4].add(-13);
		  a[4].add(40);
		  a[4].sort(null);
		  
		  
		  // ArrayList Must Be Sorted it seems
		  
		  
		  PriorityQueue<Pair>pq=new PriorityQueue<>();
		  
		  for(int i=0;i<a.length;i++)
		  {
			  
			  for(int j=0;j<a[i].size();j++)
			  {
				  
				  
				  Pair p=new Pair(i,0,a[i].get(0));
				  pq.add(p);
			  }
		  }
		  
		  
		 // System.out.println(pq.peek().value);
		  
		  ArrayList<Integer>ar=new ArrayList<>();
		  
		  while(pq.size()>0)
		  {
			  
			  Pair p=pq.remove();
			  ar.add(p.value);
			  p.di=p.di+1;
			  
			  if(p.di<a[p.li].size())
			  pq.add(new Pair(p.li,p.di,a[p.li].get(p.di)));
                			  
			  
		  }
		  
//		  for(int i=0;i<a.length;i++)
//		  {
//			  
//			  for(int j=0;j<a[i].size();j++)
//			  {
//				  
//				  System.out.print(a[i].get(j)+" ");
//			  }
//			  System.out.println();
//		  }
//		  
		  
		  System.out.println(ar.toString());
		  
		  	}
}
	

