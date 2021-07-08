package LL;

import LL.MidNode.ListNode;

public class MegeSortLinkedList {

	
	public static ListNode middle(ListNode head)
	{
		
		if(head==null||head.next==null)
			return head;
		
		ListNode slow=head;
		ListNode fast=head;
		
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	
	public static ListNode MergeTwo(ListNode l1,ListNode l2)
	{
		if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		
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
		
		if(c1==null)
			prev=c2;
		else
			prev=c1;
	
		
		return dummy.next;
	}
	
	
public static ListNode Merge(ListNode node)
{
	
	if(node==null||node.next==null)
		return node;
	
	//ListNode he=node;
	ListNode mid=middle(node);
	ListNode nhead=mid.next;
	
	mid.next=null;
	
	ListNode l1=Merge(node);
	ListNode l2=Merge(nhead);
	
	return MergeTwo(l1,l2);
}
	

public static void main(String[] args)
{
	ListNode head=new ListNode(10);
	head.next=new ListNode(2);
	head.next.next=new ListNode(5);
	
	ListNode temp=Merge(head);
	
	while(temp!=null)
	{
		System.out.println(temp.data);
	    temp=temp.next;
  	}
	
	// check why error
}
}
