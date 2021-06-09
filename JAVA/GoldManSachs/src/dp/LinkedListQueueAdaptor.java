package dp;

import java.util.LinkedList;

public class LinkedListQueueAdaptor {

	//9
	public static class LLQueueAdaptor
	{
		
		
		LinkedList<Integer>list;
		
		public LLQueueAdaptor()
		{
			
			list=new LinkedList<>();
			
		}
		
		
		void add(int x)
		{
			list.addLast(x);
		}
		
		int  remove()
		{
			if(list.size()==0)
			{
			
				System.out.println("underflow");
				return -1;
			}
			return list.removeFirst();
		}
		
		int peek()
		{

			if(list.size()==0)
			{
			
				System.out.println("underflow");
				return -1;

			}
			
			return list.getFirst();
		}
	}
	
}
