package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public  class GenericTree1 {

	private static class Node
	{
	int data;
	
	ArrayList<Node>chidren=new ArrayList<>();
	
	
	public static int getMax(Node node)
	{
		
		
		int mx=Integer.MIN_VALUE;
		
		for(Node ch:node.chidren)
		{
			 int mchild=getMax(ch);
			 mx=Math.max(mchild, mx);
		}
		mx=Math.max(mx, node.data);
		return mx;
	}
	
	public static int getSize(Node node)
	{
		
		int sz=0;
		
		for(Node child:node.chidren)
		{
		sz+=getSize(child);	
		}
		sz=sz+1;
		
		return sz;
	}
	
	
	public static void levelorder(Node node)
	{
		
		
		Queue<Node>queue=new LinkedList<>();
		
		queue.add(node);
		
		while(!queue.isEmpty())
		{
			
			
			Node temp=queue.remove();
			System.out.print(temp.data+" ");
			
			for(Node child:temp.chidren)
			{
				queue.add(child);
			}
		}
		System.out.println(".");
	}
	
	
	public static Node Mirror(Node node)
	{
		
		
	//	ArrayList<Node>temp=root.chidren;
		
		for(Node child:node.chidren)
		{
			child=Mirror(child);
		}
			
//		for(int i=0;i<root.chidren.size();i++)
//		{
//			
//			int tem=root.chidren.get(i).data;
//			root.chidren.get(i).data=root.chidren.get(root.chidren.size()-1-i).data;
//			root.chidren.get(root.chidren.size()-1-i).data=tem;
//		}
		Collections.reverse(node.chidren);
	 
		return node;
	 
	}
	
	
	public static void zigzag(Node node)
	{
		
		
		Queue<Node>q=new LinkedList<>();
		
		
		q.add(node);
		
		int l=1;
		
		while(q.size()>0)
		{
			int sz=q.size();
			
			for(int i=1;i<=sz;i++)
			{
			    	
				Node temp=q.remove();
				System.out.print(temp.data+" ");
				if(l%2==0)
				{
					for(int i1=0;i1<temp.chidren.size();i1++)
					{
					q.add(temp.chidren.get(i1));
					}
				}
				else
				{
					for(int i1=temp.chidren.size()-1;i1>=0;i1--)
					{
						q.add(temp.chidren.get(i1));
					}
				}
			}
			l=l+1;
			System.out.println();
		}
	}// cool
	
//	public static void ZigZagLevelOrder(Node node)
//	{
//		
//		
//		//Deque<Node> q=new LinkedList<>();
//		Deque dq=new LinkedList<Node>();
//		dq.addFirst(node);
//		
//		int l=0;
//		while(!dq.isEmpty())
//		{
//			int sz=dq.size();
//			
//			for(int i=1;i<=sz;i++)
//			{
//			
//			Node temp=(Node) dq.removeFirst();
//			
//			System.out.print(temp.data+" ");
//			
//			if(l==0)
//			{
//				// enquer right to left
//				for(Node child:temp.chidren)
//				{
//					dq.addLast(child);
//				}
//				l=1;
//			}
//			else
//			{
//				for(Node child:temp.chidren)
//				{
//					dq.addFirst(child);
//				}
//				l=0;
//			}
//		}
//			System.out.println();
//		}
//	}
	
	
	
	
	public static void levelOrderLineWise(Node node)
	{
		
		Queue<Node>q=new LinkedList<>();
		
		q.add(node);
		
		while(q.isEmpty()==false)
		{
			int sz=q.size();
			
			for(int i=1;i<=sz;i++)
			{
				Node temp=q.remove();
				System.out.print(temp.data+" ");
				
				for(Node child:temp.chidren)
				{
					q.add(child);
				}
			}
			System.out.println();
		}
		
	}
	
	public static void traverse(Node node)
	{   
		// area=eulers left,on wasy deeep in recusrion
		// before going deep into recursion
		// eulers left
		// nodes pre area
		
		System.out.println("Node pre "+node.data);
		
	
		
		for(Node child:node.chidren)
		{
			// edge pre area
			System.out.println("Edge pre "+node.data+" -> "+child.data);
			traverse(child);
	//		System.out.println("Node post "+child.data);
			System.out.println(" Edge post "+node.data+" -> "+child.data);
		}
		System.out.println("Node Post Area "+node.data);
		// Node post area, after  resucrsion
		// on the way out of recursion
		// nodes post area-> Area 2
		// Eulers out of recusrion
		
	}
	
	public static int height(Node node)
	{
		
		int he=0;
		
		for(Node ch:node.chidren)
		{
			
			int cal=height(ch);
			he=Math.max(he, cal);
		}
		he=he+1;
		
		return he;
	}
	
	public static boolean find(int x,Node node)
	{
		
		if(node.data==x)
		{
			return true;
		}
		
		for(Node child:node.chidren)
		{
			if(find(x,child))
				return true;
		}
		
		return false;
	}
	
	public static Node linearize2(Node node)
	{
		if(node.chidren.size()==0)
			return node;
		
		Node lkt=linearize2(node.chidren.get(node.chidren.size()-1));
		
		while(node.chidren.size()>1)
		{
			Node nodeLast=node.chidren.remove(node.chidren.size()-1);
			Node secondLast=node.chidren.get(node.chidren.size()-1);
			
			Node slkt=linearize2(secondLast);
			
			slkt.chidren.add(nodeLast);
		}
		
		return lkt;
	}
	
	public static Node getTail(Node node)
	{
		while(node.chidren.size()>=0)
		{
			
			node=node.chidren.get(0);
		}
		
		return node;
	}
	
	public static void linearize(Node node)
	{
		
		
		for(Node child:node.chidren)
		{
			linearize(child);
		}
		
		while(node.chidren.size()>1)
		{
			Node last=node.chidren.remove(node.chidren.size()-1);
			Node secondlast=node.chidren.get(node.chidren.size()-1); 
			
			
			Node slt=getTail(secondlast);
			slt.chidren.add(last);
			
			
		}
	}
	
	public Node removeLeaf(Node node)
	{
		
		
		// temove the leave from children
		 for(int i=node.chidren.size()-1;i>=0;i--)
		 {
			 if(node.chidren.get(i).chidren.size()==0)
			 {
				 node.chidren.remove(i);			 }
		 }
	    
		for(Node child:node.chidren)
		{
			child=removeLeaf(child);
		}
		
		 
		 return node;
	}

	
	public void display(Node node)
	{
		 
		
		 String str=node.data+" -> ";
		
		 for(Node child:node.chidren)
		 {
			 str+=child.data+", ";
		 }
		 str+=".";
		 
		 System.out.println(str);
		 
		 System.out.println();
		 
		 for(Node ch:node.chidren)
		 {
			 display(ch);
		 }
	}
	
	public static void rootToNodePath(Node root,Node node,String path)
	{
		
		path=path+root.data;
		
		if(root.data==node.data)
		{
			
			System.out.println(path);
			return;
		}
		
		for(Node child:root.chidren)
		{
			rootToNodePath(child,node,path);
		}
		
		return;
	}
	
    
	
	
	public static void main(String[] args)
	{
		
		
		//int[] arr= {10,20,50,-1,60,-1,-1,30,70,80,110,-1,120,-1,-1,90,-1,90,-1,-1,40,100,-1,-1,-1};
		
		int[] arr= {10,20,-1,30,50,-1,60,-1,40,-1,-1};
		
        Node root=new Node();
		
		Stack<Node> st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]==-1)
		{
			st.pop();
		}else
		{
			Node t=new Node();
			t.data=arr[i];
			
			if(st.size()>0)
			{
				
				st.peek().chidren.add(t);
			
			}
			else
			{
				root=t;
			
			}
			st.push(t);
		}
			
		}
	
		
		root.display(root);
		
//		System.out.println(root.getSize(root));
//		
//		System.out.println("Max value is -> "+root.getMax(root));
//		
//		System.out.println("Height of generic tree: "+root.height(root));
		
//		root.traverse(root);
//		
//		
//		root.levelorder(root);
//		
//		
//		root.levelOrderLineWise(root);
//		
//		root.zigzag(root);
		
//		
//		Node miroot=root.Mirror(root);
//		
//		root.display(miroot);  // shit  use colections to rverse very imp concept to reverse
		
		
	//	root.removeLeaf(root);
		
		root.display(root);
		 
		
		//root.linearize(root);
		
		root.display(root);
		
		
		System.out.print(root.find(100,root));
		
		String path="";
		
		//Node node=new Node();
		System.out.println();
		
		root.rootToNodePath(root, root.chidren.get(1), path);
		
	}
}
}
