package dp;

import java.util.LinkedList;

public class LinkedListStackAdaptor {
	
	 
	public static class LLStackAdaptor{
		
	
	LinkedList<Integer>list=new LinkedList<>();
	
	public LLStackAdaptor()
	{
		list=new LinkedList<>();
	}
	
	 int size()
	 {
		 return list.size();
	 }
	 
	 int top()
	 {
		return list.getFirst(); 
	 }
	
	 int pop()
	 {
		 if(size()==0)
		 {
			 System.out.println("Stack underflow");
			 return -1;
		 }
		 else
		return list.removeFirst(); 
	 }
	
	 void push(int x)
	 {
		list.addFirst(x); 
	 }
	}
	 
	public static void main(String[] args)
	{
		
		
		// we will make linked list behave as stack
		
		
		LLStackAdaptor ls=new LLStackAdaptor();
		
		ls.pop();
		
		int sz=ls.size();
		
		System.out.println(sz);
		
		
		ls.push(1);
		ls.push(4);
		ls.push(5);

		while(ls.size()>0)
		{
			System.out.print(ls.pop()+" ");
		}
		
	}
	

}
