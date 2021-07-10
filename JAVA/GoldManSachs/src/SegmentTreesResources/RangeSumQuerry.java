package SegmentTreesResources;

public class RangeSumQuerry {

	
	static class SegTree{
		
		int leftmost;
		int rightmost;
		SegTree lChild,rChild;
		
		int sum;
		
		public SegTree(int leftmost,int rightmost,int[] arr)
		{
			this.leftmost=leftmost;
			this.rightmost=rightmost;
			
			
			if(leftmost==rightmost)
				sum=arr[leftmost];
			
			else
			{
			int mid=(leftmost+rightmost)/2;
			
			 lChild=new SegTree(leftmost,mid,arr);
			 rChild=new SegTree(mid+1,rightmost,arr);
			 
			 recalc();
			}
		}
		public void recalc()
		{
			if(leftmost==rightmost)
			{
				return;
			}
			sum=lChild.sum+rChild.sum;
		}
		
		public int rangeSum(int l,int r)
		{
			
			 if(l>rightmost||r<leftmost)
				 return 0;
			
			 if(leftmost>=l&&rightmost<=r)
				 return sum;
			 
			 return lChild.rangeSum(l, r)+rChild.rangeSum(l, r);
		}
		
	}
	
	public static void main(String[] args)
	{
		
		int[] a= {2,3,1,6,7,8,0,2};
		
		SegTree s=new SegTree(0,a.length-1,a);
		
		System.out.println(s.rangeSum(1, 2));
	}
	
}
