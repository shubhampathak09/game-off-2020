package LL;

public class PalindromeLinkedList {

	public static class LinkedList{
		
		int data;
		LinkedList next;
		LinkedList(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	public static LinkedList getMiddle(LinkedList head)
	{
		
		LinkedList slow=head;
		LinkedList fast=head;
		
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	public static LinkedList reverseLinkedList(LinkedList head)
	{
		
		LinkedList prev=null;
		LinkedList curr=head;
		LinkedList temp=null;
		
		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		
		return prev;
	}
	
	public static boolean check(LinkedList head)
	{
	if(head==null||head.next==null)
		return true;
		
	LinkedList mid=getMiddle(head);
	LinkedList nhead=mid.next;
	nhead=reverseLinkedList(nhead);
	
	LinkedList c1=head;
	LinkedList c2=nhead;
	
	boolean ret=true;
	while(c1!=null&&c2!=null)
	{
		if(c1.data!=c2.data)
		{
			ret=false;
		}
		c1=c1.next;
		c2=c2.next;
	}
	
	nhead=reverseLinkedList(nhead);
	mid.next=nhead; // fixing the ll
	
	return ret;
	}
	
	public static void main(String[] args)
	{
		
		LinkedList head=new LinkedList(1);
		
		head.next=new LinkedList(2);
		
		System.out.println(check(head));
	}
	
}
