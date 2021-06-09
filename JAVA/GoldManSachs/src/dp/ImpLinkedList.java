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
		
		public static void removeLast()
		{
		
			
			if(size==0)
			{
				System.out.println("List is empty cant remove");
				return;
			}
			
			if(size==1)
			{
				head=null;
				size=size-1;
				
			}
			else
			{
				Node secondlast=head;
				
				for(int i=1;i<=size-2;i++)
				{
					secondlast=secondlast.next;
				}
		        secondlast.next=null;
		        size=size-1;
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
		
		public static  int getFirst()
		{
			
			
			if(size==0)
			{
				System.out.println("No elements in Linked List");
				return -1;
			}
			
			return head.data;
			
		}
		
		public static void addFirst(int data)
		{
			
			Node temp=new Node(data);
			
			temp.next=head;
			head=temp;
			size=size+1;
		}
		
		public static  int getLast()
		{
			
			
			if(size==0)
			{
				System.out.println("No elements in Linked List");
				return -1;
			}
			
			Node temp=head;
			
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    
			return temp.data;
		}
		
		public static void addAtIndex(int index,int data)
		{
			
			if(index<0&&index>=size)
			{
				System.out.println("cant add at invalid index");
				return;
			}
			
			
			
			
			if(index==0)
			{
				// tryijng addition at first index
			  addFirst(data);
				
			}
			else
			{
		    Node temp=new Node(data);
            Node currnode=head;
            for(int i=1;i<=index-1;i++) // got index-1
            {
            	currnode=currnode.next;
            }
            Node currnextnode=currnode.next;
            currnode.next=temp;
            temp.next=currnextnode;
            
            size=size+1;
			}
		}
		public static int kthNodeFromEnd(int k)
		{
			
			Node slow=head;
			Node fast=head;
			
			for(int i=1;i<=k;i++)
			{   
				//System.out.println(i);
				fast=fast.next;
			//	System.out.println(fast);
			}
			
			while(fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next;
			}
			
			return slow.data;
		}
		
		public static int getAtIndex(int index)
		{
			if(size==0)
			{
				System.out.println("Linked List is Empty");
				return -1;
			}
			if(index<0||index>=size)
			{
				System.out.println("Invalid Index");
				return -1;
			}
			
			Node temp=head;
			for(int i=1;i<=index;i++)
			{
				
				temp=temp.next;
			}
			return temp.data;
		}
		
		public static int middle()
		{
			
			Node slow=head;
			Node fast=head;
			
			while(fast!=null&&fast.next.next!=null)
			{
				
				slow=slow.next;
				fast=fast.next.next;
				
			}
			return slow.data;
		}
		
		public static void reverse()
		{
			Node current=head;
		    Node prev=null;
		   // Node temp=current.next;
			while(current!=null)
			{
				
		    Node temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
			}
			head=prev;
		    
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
		    
		    
		    // 3
		    int val=getAtIndex(1);
		    
		    System.out.println(val);
		    
		    System.out.println(getFirst());
		    
		    System.out.println(getLast());
		    
		    
		    
		    //4
		    
		    
		    // add at first
		    
		    addFirst(9);
		    
		  
		    
		    display();
		    
		    System.out.println();
		    System.out.println(size);
		    
		    
		    //5 AddatIndex function
		    
		    addAtIndex(2,8);
		    
		    // 6 remove at index;
		    
		    System.out.println();
		    System.out.println(size);
		    display();
		    
		    System.out.println();
		    
		    removeLast();
		    
		    display();
		    
		    System.out.println();
		    
		   
		   // 7
//		   reverse();
//		   display();
		   
		   System.out.println();
		 
		   System.out.println(head.data);
		   
		  int ans=kthNodeFromEnd(2);
		   
		   
		   System.out.println(ans);
		   
		    // 8  removeAtIndex
		   
		   // now 41 more to gokthNodeFromEnd
		   
		   
		   
		   //cool
		   
		   // now 40 more question
		   
		   //11  find middle of linked list
		   
		   System.out.println("Middle of Linked list is: "+middle());
		   
		   
		   //12
		   
		   // merge two sorted linked lists
		   
		   
		}
		
	}
	// 48 more to go
	
	// 3
	
    //  int val=getAtIndex(2);	
      //8
	
	 //10
	 //kth node from end no iteratve or siz  int ans=kthNodeFromEnd(2);
	}
	

