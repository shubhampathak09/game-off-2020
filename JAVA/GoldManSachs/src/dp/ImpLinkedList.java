package dp;

public class ImpLinkedList {

	
	public static Node head;
	public static Node tail;
	public static int size;
	
	
	public static void display()
	{
		
	Node temp=head;
	
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
		
	}
	
	
	
	public static int getSize(Node head)
	{
		return size;
	}
	
	public static Node getHeadNode()
	{
		return head;
	}
	
	public static class Node
	{
		
		Node next;
		int data;
		
		Node(int data) {
			this.data=data;
			this.next=null;
		}
		
		
		public static void insert(int data)
		{
			
			Node last=head;
			
			if(last==null)
			{
				// head node
				last=new Node(data);
				last.next=null;
				size=size+1;
				head=last;
			}
			else
			{
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new Node(data);
			size=size+1;
			}
		}
		
		public static void removeFirst(Node node)
		{
			// 1- 2 3 4 5 6
			
			if(size==0)
			{
				System.out.println("Cant remove from an empty Linked List");
				return;
			}
			
			if(size==1)
			{
				head=null;
				size=size-1;
				display();
				return;
				
			}
			else
			{
				Node temp=head.next;
				head=null;
				head=temp;
				size=size-1;
				
				display();
				
				return;
			}
		}
		
		public static void main(String[] args)
		{
			
			
			//1. insertion
			
//			System.out.println(head);
//			System.out.println(size);
			
			insert(1);
			
//			System.out.println(head);
//			System.out.println(size);
			
			
			insert(2);
			
//			System.out.println(head);
//			System.out.println(size);
			
			insert(3);
			
			 
//			System.out.println(head);
//			System.out.println(size);
			
			// 2.
		    display();
		    
			
		    insert(6);
		    
		    insert(9);
		    
		    System.out.println();
		    
		    
		    System.out.println("Size of Linked List:-"+size);
			 
		    display();
		    
		    System.out.println();
		    
		    removeFirst(head);
		    
		    System.out.println();
		    
		    removeFirst(head);
		    
		    System.out.println(" Head is "+head.data+" size "+size);
		}
		
	}
	// 48 more to go
	
	// 3
	
	
}
