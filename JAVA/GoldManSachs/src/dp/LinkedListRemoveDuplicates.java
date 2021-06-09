package dp;

import java.util.LinkedList;

public class LinkedListRemoveDuplicates {

	
	public static void main(String[] args)
	{
		
		LinkedList<Integer>l=new LinkedList<Integer>();
		
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(2);
		l.addFirst(2);
		l.addFirst(2);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addFirst(4);
		l.addFirst(4);
		l.addFirst(5);
		l.addFirst(6);
		l.addFirst(6);
		l.addFirst(7);
		
        
		
		LinkedList<Integer>res=new LinkedList<Integer>();
		
		res.addLast(l.getFirst());
		l.removeFirst();
		
		for(int i=1;i<l.size();i++)
		{
			
		if(res.getLast()==l.getFirst())
		{
			l.removeFirst();
		}
		else
		{
			res.addLast(l.getFirst());
			l.removeFirst();	
		}
		
		}
		
		
		for(int i:res)
		{
			System.out.print(i+" ");
		}
		
	}
	
}
// fuck

//14
