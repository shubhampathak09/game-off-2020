package LL;

import LL.PalindromeLinkedList.LinkedList;

public class MidNode {

	
	public static class ListNode
	{
		ListNode next;
		int data;
		
		ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	
	
//	public static ListNode getmiddle(ListNode head)
//	{
//		
//		if(head==null||head.next==null)
//			return head;
//		
//		ListNode slow=head;
//		ListNode fast=head;
//		
//		while(fast.next!=null&&fast.next.next!=null)
//		{
//			slow=slow.next;
//			fast=fast.next.next;
//		}
//		
//		return slow;
//	}
	
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
	
	public static void main(String[] args)
	{
		
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
	//	head.next=new ListNode(3);
		
		
		System.out.println(getMiddle(head).data);
		}
	
}

//gg