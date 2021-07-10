package SegmentTreesResources;

import java.util.Random;

public class SegTreeDemo {

	
	public static void main(String[] args)
	{
		
		Random random=new Random(5);
		
		int T=100;
		
		for(int tt=0;tt<T;tt++)
		{
			
			int n=1+random.nextInt(10);
			int[] a=new int[n];
			
			for(int i=0;i<n;i++)
				a[i]=random.nextInt(10);
			
			SegTree st=new SegTree(0,n-1,a);
			
			int nQuerries=100;
			
			for(int qq=0;qq<nQuerries;qq++)
			{
				if(random.nextBoolean())
				{
					int l=random.nextInt(n);
					int r=random.nextInt(n);
					int ans=0;
					
					for(int i=l;i<=r;i++)
					{
						ans+=a[i];
					}	
						int stAns=st.rangeSum(l, r)+1;
						System.out.print("Sample Array:");
						for(int i=0;i<n;i++)
						{
							System.out.print(a[i]+" ");
						}
						System.out.println();
						System.out.print("Range Sum.. ");
						System.out.println("[ "+l+" "+r+" ]"+" ->"+" "+stAns);
						
						if(stAns!=ans)throw null;
						
						// TODO: query segtree
						
						
					
				}else
				{
					int index=random.nextInt(n);
					int newVal=random.nextInt(10);
					a[index]=newVal;
					
					st.pointUpdate(index, newVal);
					
				}
			}
		}
		
		System.out.println("All tests passed");
	}
	
	
	
	static class SegTree{
		
		int leftmost,rightmost;
		SegTree lChild,rChild;
		int sum;
		
		public SegTree(int leftmost,int rightmost,int[] a)
		{
			this.leftmost=leftmost;
			this.rightmost=rightmost;
			
			if(leftmost==rightmost)
			{
				sum=a[leftmost];
				
			}else
			{
				int mid=(leftmost+rightmost)/2;
				lChild=new SegTree(leftmost,mid,a);
				rChild=new SegTree(mid+1,rightmost,a);
				reCalc();
			}
			
		}
		public void reCalc()
		{
			if(leftmost==rightmost)
				return;
			sum=lChild.sum+rChild.sum;
		}
		
		public void pointUpdate(int index,int newVal)
		{
		if(leftmost==rightmost)
		{
			sum=newVal;
			return;
		}
		
		// Two Kids
		if(index<=lChild.rightmost) lChild.pointUpdate(index, newVal);
		else
			rChild.pointUpdate(index, newVal);
		
		
		reCalc();
		
		}
		
		public int rangeSum(int l,int r)
		{
			// entirely inside
			
			if(l>rightmost||r<leftmost)
				return 0;
			
			if(l<=leftmost&&rightmost<=r)
				return sum;
			
			// case 3 we dont know got to two children
			return lChild.rangeSum(l, r)+rChild.rangeSum(l, r);
		}
		
}
}
