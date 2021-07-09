package LL;

public class EvenOddLinkedList {

	
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
	
	
	public static void display(ListNode curr)
	{
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static ListNode segregate(ListNode node)
	{
		
		ListNode dummyEven=new ListNode(-1);
		ListNode dummyOdd=new ListNode(-1);
		
		ListNode evenTail=dummyEven;
		ListNode oddTail=dummyOdd;
        
		
		ListNode curr=node;
		
		while(curr!=null)
		{
			if(curr.data%2==0)
			{
				evenTail.next=curr;
				evenTail=evenTail.next;
			}else
			{
				oddTail.next=curr;
				oddTail=oddTail.next;
			}
			curr=curr.next;
		}
		evenTail.next=dummyOdd.next;
		oddTail.next=null;
		
		return dummyEven.next;
	}
	
	public static void main(String[] args)
	{
		
		ListNode head=new ListNode(1);
		head.next=new ListNode(3);
		head.next.next=new ListNode(6);
		head.next.next.next=new ListNode(0);
		
		ListNode temp=segregate(head);
		
		display(temp);
		
	}
	
}
