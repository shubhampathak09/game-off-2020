package LL;

import java.util.HashMap;

public class CloneLinkedListNextAndRandomPointers {

	
    	
	public static class Node
	{
		int data;
		Node next;
		Node random;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String[] args)
	{
		
		HashMap<Node ,Node>map=new HashMap<>();
		Node head=new Node(1);
		head.next=new Node(2);
		
		
		Node curr=head;
		
		Node nhead=new Node(-1);
		
		Node prev=nhead;
		
		while(curr!=null)
		{
			prev.next=new Node(curr.data);
			
			map.put(curr, prev.next);
			
			prev=curr;
			curr=curr.next;
		}
	    nhead=nhead.next;
	    
	   
	    Node c1=head;
	    Node c2=nhead;
	    while(c1!=null)
	    {
	    	c2.random=map.getOrDefault(c1.random, null);
	    	c1=c1.next;
	    }
	    
	    // cloned
	    
	    
	    //to check
	    
	    System.out.println(head);
	    
	    System.out.println(nhead);
	}
	
}
