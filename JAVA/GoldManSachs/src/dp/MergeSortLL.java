
// 13 and 12 combine
package dp;

import java.util.LinkedList;

public class MergeSortLL {
	
	
	
	
	public static LinkedList<Integer>mergeTwoLL(LinkedList<Integer>l1,LinkedList<Integer> l2)
	{
		
		LinkedList<Integer>res=new LinkedList<>();
		
		while(l1.size()!=0&&l2.size()!=0)
		{
			
			
			if(l1.getFirst()<l2.getFirst())
			{
				res.addLast(l1.getFirst());
				l1.removeFirst();
			}
			else
			{
				res.addLast(l2.getFirst());
				l2.removeFirst();
			}
		}
		
		while(l1.size()!=0)
		{
			res.addLast(l1.getFirst());
			l1.removeFirst();
		}
		while(l2.size()!=0)
		{
			res.addLast(l2.getFirst());
			l2.removeFirst();
		}
		return res;
	}
    
	
	public static void main(String[] args)
	{
		
		LinkedList<Integer>l1=new LinkedList<>();
		LinkedList<Integer>l2=new LinkedList<>();
		
		l1.addLast(1);
		l1.addLast(2);
		l1.addLast(90);
		
		l2.addLast(0);
		l2.addLast(35);
		l2.addLast(200);
		
		LinkedList<Integer>result=new LinkedList<>();
		
		result=mergeTwoLL(l1,l2);
		
		
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
	}
}
