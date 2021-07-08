package LL;

public class Fold {
	
	
	public static class LinkedList
	{
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
		
		if(head==null||head.next==null)
			return head;
	
		LinkedList slow=head;
		LinkedList fast=head;
		
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static LinkedList reverse(LinkedList head)
	{
		
		if(head==null||head.next==null)
			return head;
		
		LinkedList prev=null;
		LinkedList temp=null;
		LinkedList curr=head;
		while(curr!=null)
		{
			temp=curr.next;
		    curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	
	public static  LinkedList fold(LinkedList head)
	{
		
		LinkedList mid=getMiddle(head);
	    LinkedList nhead=mid.next;
	    mid.next=null;
	    nhead=reverse(nhead);
	    
	    LinkedList c1=head;
	    LinkedList c2=nhead;
	    LinkedList f1=null;
	    LinkedList f2=null;
	    
	    while(c1!=null&&c2!=null)
	    {
	    	f1=c1.next;
	    	f2=c2.next;
	    	
	    	c1.next=c2;
	    	c2.next=f1;
	    	
	    	c1=f1;
	    	c2=f2;
	    }
	    return head;
	}
	
	public static void main(String[] args)
	{
	
		LinkedList head=new LinkedList(1);
		head.next=new LinkedList(2);
		head.next.next=new LinkedList(3);
		head.next.next.next=new LinkedList(4);
		head.next.next.next.next=new LinkedList(5);
		
		LinkedList temp=fold(head);
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}

}
