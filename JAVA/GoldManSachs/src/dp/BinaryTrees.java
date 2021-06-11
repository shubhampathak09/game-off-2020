package dp;


import java.util.Stack;
public class BinaryTrees {
	
	
	public static class Node
	{
		
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right)
		{
			
			this.data=data;
			this.left=left;
			this.right=right;
			
		}
		
	}
	
	public static class Pair{
		Node node;
		int state;
		Pair(Node node,int state)
		{
			this.node=node;
			this.state=state;
		}
	}
	
	public static void display(Node node)
	{
		
		if(node==null)
			return;
		
		// node self
		String str="";
		
		str+=node.left==null ? "." :+node.left.data+"";
		str+=" <- "+node.data+" -> ";
		str+=node.right==null ? "." :+node.right.data+"";
		
		System.out.println(str);
		// display left
		
		display(node.left);
		
		
		// display right
		display(node.right);
	}
	
	public static int size(Node node)
	{
		if(node==null)
			return 0;
		
		int szleft=size(node.left);
		int szright=size(node.right);
		return szleft+szright+1;
		
		
	}
	
	public static int Sum(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		
		//int s=0;
		int leftsum=Sum(node.left);
		int rightsum=Sum(node.right);
		return leftsum+rightsum+node.data;
	}
	
	public static int maxval(Node node)
	{
		if(node==null)
		{
			return Integer.MIN_VALUE;
		}
		
		int mx=node.data;
		int mxleft=maxval(node.left);
		int mxright=maxval(node.right);
		mx=Math.max(mx, Math.max(mxleft, mxright));
		
		return mx;
	}
	
	 
	
	public static int height(Node node)
	{
		if(node==null)
			return -1;  // edges in case node 0;
		
		int hl=height(node.left);
		int hr=height(node.right);
		
		return Math.max(hl, hr)+1;
		
	}
	
	public static void main(String[] args)
	{
		
		
		Integer[] arr= {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		
		Stack<Pair>st=new Stack();
		
		Node root=new Node(arr[0],null,null);
		Pair rp=new Pair(root,1);
		
		
		st.push(rp);
		
		int indx=0;
		
		while(st.size()>0)
		{
			
			
			Pair top=st.peek();
			
			if(top.state==1)
			{
		     
				indx=indx+1;
				if(arr[indx]!=null)
				{
					Node ln=new Node(arr[indx],null,null);
					top.node.left=ln;
					
					 Pair lp=new Pair(ln,1);
					 st.push(lp);
				}
				else
				{
					top.node.left=null;
				}
				top.state=top.state+1;
				
			}else if(top.state==2)
			{
				indx=indx+1;
				if(arr[indx]!=null)
				{
					top.node.right=new Node(arr[indx],null,null);
					Pair lr=new Pair(top.node.right,1);
					st.push(lr); 
				}
				else
				{
					top.node.right=null;
				}
				top.state=top.state+1;
				
				
			}else
			{
				st.pop();
			}
		}
		
	    display(root);
		
		// display
		
		int sz=size(root);
		
		System.out.println(sz);
		
		System.out.println(Sum(root));
		
		
		System.out.println(maxval(root)); 
		
		
		System.out.println(height(root));
	}

}
