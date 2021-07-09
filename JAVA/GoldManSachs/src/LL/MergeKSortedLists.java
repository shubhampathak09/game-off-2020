package LL;

public class MergeKSortedLists {

	
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
	
	
	public static ListNode MergeTwoSortedList(ListNode l1,ListNode l2)
	{
		if(l1==null||l2==null)
		{
			if(l1==null)
				return l2;
			else
				return l1;
			
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
			}
			else
			{
				prev.next=c2;
				c2=c2.next;
			}
			prev=prev.next;
		}
		if(c1==null)
			prev.next=c2;
		else if(c2==null)
			prev.next=c1;
			
		
		return dummy.next;
	}
	
	
	
	public static ListNode merge(ListNode[] lists,int si,int ei)
	{
		if(si>ei)
			return null;
		
		if(si==ei)
			return lists[si];
		
		
		int mid=(si+ei)/2; // s1+)ei-s1/2(
		
		ListNode l1=merge(lists,si,mid);
		ListNode l2=merge(lists,mid+1,ei);
		
		return MergeTwoSortedList(l1,l2);
		
	}
	
	
	public static void main(String[] args)
	{
		
		// put your input here
		
		
		ListNode[] lists=new ListNode[4];
		
		ListNode h1=new ListNode(1);
		h1.next=new ListNode(5);
		lists[0]=h1;
		
		
		ListNode h2=new ListNode(20);
		h2.next=new ListNode(100);
		lists[1]=h2;
		
		ListNode h3=new ListNode(-6);
		h3.next=new ListNode(22);
		lists[2]=h3;
		
		ListNode h4=new ListNode(50);
		h4.next=new ListNode(60);
		lists[3]=h4;
		
		
		ListNode temp=merge(lists,0,3);
		
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}

		
	
		
		//ListNode temp=MergeTwoSortedList(h1,h2);
		
//		while(temp!=null)
//		{
//			System.out.println(temp.data);
//			temp=temp.next;
//		}
//	}
	
	//fixexd eas return prev in mergetwo which should be dummy .next
	// sometrhing incorrect
		// watch over me goddess it will good show
}
}
