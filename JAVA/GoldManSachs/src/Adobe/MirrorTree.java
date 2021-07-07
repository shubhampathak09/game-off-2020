package Adobe;

public class MirrorTree {

	
	
	
	public static class Node{
		
		Node left;
		Node right;
		
		int data;
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	
	
	public static void inorder(Node root)
	{
		
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static boolean checkMirror(Node root1,Node root2)
	{
		
		if(root1==null&&root2==null)
		return true;
		
		if(root1.data!=root2.data)
			return false;
		
		boolean checkMirrorLeft=checkMirror(root1.left,root2.left);
		boolean checkMirrorRight=checkMirror(root1.right,root2.right);
		
		return checkMirrorLeft&&checkMirrorRight;
	}
	
	public static void main(String[] args)
	{
		Node root1=new Node(1);
		
		root1.left=new Node(2);
		root1.right=new Node(3);
		root1.left.left=new Node(4);
		root1.left.right=new Node(5);
		
		
Node root2=new Node(1);
		
		root2.left=new Node(2);
		root2.right=new Node(3);
		root2.left.left=new Node(4);

		
		
		root2.left.right=new Node(5);

	
		boolean ans=checkMirror(root1,root2);
		
		
		System.out.println(ans);
	
	    
		
		inorder(root1);
	}
	
	
	
}
