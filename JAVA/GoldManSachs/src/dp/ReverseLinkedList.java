package dp;

public class ReverseLinkedList {
	
	public static class Node
	{
		int data=0;
		Node next=null;
		Node(int data)
		{
			this.data=data;
			
		}
	}
	
	
	public static Node getNextToMiddle(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		fast=slow.next;
		slow.next=null;
		
		slow=head;
		
		return fast;
	}
	
	public static void printList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public static void main(String[] args)
	{
		
		Node head=new Node(1);
		head.next=new Node(5);
		head.next.next=new Node(6);
		head.next.next.next=new Node(5);
		head.next.next.next.next=new Node(1);
		
		printList(head);
		
		System.out.println();
	
		Node head2=getNextToMiddle(head);
		
		Node sec=reverse(head2);
		
		Node temp1=head;
		Node temp2=sec;
		
	
		while(temp2!=null)
		{
			if(temp1.data!=temp2.data)
			{   
				//System.out.print(temp1.data+" "+temp2.data);
				//System.out.println("Not Palindromic Linked List");
				return;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		
		
		
		System.out.println("Palindromic Linked List");
//		printList(head);
//		System.out.println();
//		printList(sec);
		
	}

	public static Node reverse(Node head)
	{
		Node prev=null;
		Node curr=head;
		 
		
		while(curr!=null)
		{
		 
			Node temp=curr.next;
	     	curr.next=prev;
	     	prev=curr;
	     	curr=temp;
	     	
		}
		
		return prev;
	}
}
