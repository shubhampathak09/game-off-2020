package LL;

public class UnfoldLinkedList {

	
	public static class ListNode
	{
		int data;
		ListNode next;
		
		ListNode(int data)
		{
			
			this.data=data;
			this.next=null;
		}
       
	}
	
	public static ListNode getMiddle(ListNode head)
	{
		ListNode slow=head;
		ListNode fast=head;
		
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	public static ListNode reverse(ListNode head)
{

		ListNode prev=null;
		ListNode curr=head;
		ListNode temp=null;
		
		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			
		}
		
		return prev;
}	
	
	
	public static ListNode unfold(ListNode head)
	{
		
		if(head==null||head.next==null)
			return head;
		
		ListNode firsthead=head;
		ListNode secondhead=head.next;
		
		ListNode c1=firsthead;
		ListNode c2=secondhead;
        
		ListNode f1=null;
		ListNode f2=null;
		
		while(c2!=null&&c2.next!=null)
		{
			 
			ListNode f=c2.next;
			
			c1.next=f;
			c2.next=f.next;
			
			 c1=c1.next;
			 c2=c2.next;
			
		}
		c1.next=null;
		c2=reverse(secondhead);
		
		
	    c1.next=c2;
	    
	    
		
		return firsthead;
	}
	
	public static void main(String[] args)
	{
		// check thr test code here
		
	}
	
}
