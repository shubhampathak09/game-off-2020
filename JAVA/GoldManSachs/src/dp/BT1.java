package dp;

import java.util.LinkedList;
import java.util.Queue;

public class BT1 {
	
	
	public static class Node
	{
		int data;
		Node left;
		Node right;
	}

	public static Node newNode(int data)
	{
		Node node=new Node();
		node.data=data;
		node.left=null;
		node.right=null;
		
		return node;
	}
	
	
	public static void inorder(Node root)
	{
		
		if(root==null)
			return;
		
		inorder(root.left);
		
		System.out.print(root.data+" ");
		
		inorder(root.right);
		
	}
	
	public static void preorder(Node root)
	{
		
		if(root==null)
			return;
			
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
			
	}
	
	public static int maxDepth(Node root)
	{
		
		if(root==null)
			return 0;
		
		int lh=maxDepth(root.left);
		int rh=maxDepth(root.right);
		
		return 1+Math.max(lh,rh);
	}
	
	public static void postorder(Node root)
	{
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static int di=Integer.MIN_VALUE;
	
	public static int diameter(Node root)
	{
		
		if(root==null)
			return 0;
		
	    int ld=diameter(root.left);
	    int rd=diameter(root.right);
		int temp=Math.max(ld,rd)+1;
		int ans=Math.max(ld+rd+1, temp);
		di=Math.max(di, ans);
		return ans;
	}
	
	public static void ZigZagTraversal(Node root)
	{
		
	}
	
	public static void levelorder(Node root)  // review ??
	{
		
		 
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			
			int sz=q.size();
			
			for(int i=1;i<=sz;i++)
			{
				Node temp=q.remove();
				System.out.print(temp.data+" ");
				
				if(temp.left!=null)
					q.add(temp.left);
				
				if(temp.right!=null)
					q.add(temp.right);
			}
			System.out.println();
		}
		
		
	}
	
	// max sum from leaf to lead
	
	// max sum from node to node
	
	
	
	public static void main(String[] args)
	{
		
		Node root=newNode(1);
		root.left=newNode(2);
		root.right=newNode(3);
		root.left.left=newNode(4);
		root.left.right=newNode(5);
		root.right.right=newNode(6);
		
//		
//		inorder(root);
//		System.out.println();
//		postorder(root);
//		System.out.println();
//		preorder(root);
		
		System.out.println();
		
		System.out.println(maxDepth(root));
		
		
		diameter(root);
		//levelorder(root);
		System.out.println(di);
		
		levelorder(root);
	}
}
