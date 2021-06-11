package dp;

import java.util.HashMap;

public class DeepCopyLinkedList {

	
	public static class Node
	{
		int data=0;
		Node next=null;
		Node random=null;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	public static Node copyRandomList(Node head)
	{
		HashMap<Node,Node>hm=new HashMap<>();
		Node curr=head;
		
		Node nhead=new Node(-1);
		
		Node prev=nhead;
		
		while(curr!=null)
		{
			
			prev.next=new Node(curr.data);
			
			hm.put(curr, prev.next);
			
			prev=prev.next;
			hm.put(curr, prev);
			curr=curr.next;
		}
		
		nhead=nhead.next;
		
		hm.put(null, null);
		curr=head;
		
		while(curr!=null)
		{
		
			Node copynode=hm.get(curr);
			 
			copynode.random=hm.get(curr.random);
			
			curr=curr.next;
		}
		
		return nhead;
	}
	
	public static void main(String[] args)
	{
		
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		
		
		Node head3=head;
		
		Node head2=copyRandomList(head);
		
		System.out.println(head);
		System.out.println(head3);
		
		System.out.println(head2);
		
	   Node temp=head2;
		
       while(temp!=null)
       {
    	System.out.println(temp.data);   
    	temp=temp.next;
       }
	}
	
}

