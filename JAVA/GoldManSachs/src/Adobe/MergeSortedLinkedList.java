package Adobe;

public class MergeSortedLinkedList {

	
	public static class ListNode
	{
		
		int val=0;
		ListNode next=null;
		ListNode(int val)
		{
			this.val=val;
		}
	}
		
		public static ListNode MergeTwoLists(ListNode l1,ListNode l2) throws Exception
		{
			if(l1==null||l2==null)
				return l1!=null ? l1:l2;
			
			ListNode c1=l1;
			ListNode c2=l2;
			
			ListNode dummy=new ListNode(-1);
			ListNode prev=dummy;
			
			while(c1!=null&&c2!=null)
			{
				if(c1.val<c2.val)
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
			if(l1==null)
				prev.next=c2;
			else
				prev.next=c1;
			
			return dummy.next;
		}
		
	
	
	
	public static void main(String[] args) throws Exception
	{
		
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(5);
		l1.next.next=new ListNode(100);
		
		
		ListNode l2=new ListNode(-1);
		l2.next=new ListNode(10);
		l2.next.next=new ListNode(50);
		
		ListNode l3=MergeTwoLists(l1,l2);
		
		while(l3!=null)
		{
			System.out.print(l3.val+" ");
		  l3=l3.next;
		}
		
	}
	
}
