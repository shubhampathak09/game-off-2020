package LL;

public class MergeTwoSortedLinkedList {

	
	public static class ListNode
	{
		
		ListNode next;
		int data;
		
		ListNode(int val)
		{
			this.data=val;
			this.next=null;
		}
	}
	
	public static ListNode merge(ListNode l1,ListNode l2)
	{
		
		if(l1==null||l2==null)
		{
			if(l1==null)
				return l2;
			else return l1;
		}
		
		ListNode dummy=new ListNode(-1);
		ListNode prev=dummy;
		
		ListNode c1=l1;
		ListNode c2=l2;
		
		while(c1!=null&&c2!=null)
		{
			if(c1.data<c2.data)
			{
				prev.next=c1;
				c1=c1.next;
			}else
			{
				prev.next=c2;
				c2=c2.next;
			}
			prev=prev.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args)
{
	

		// test code goes here
		
		
}
}