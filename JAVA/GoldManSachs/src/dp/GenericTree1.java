package dp;

import java.util.ArrayList;
import java.util.Stack;

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
	
	public static void traverse(Node node)
	{
		
		System.out.println("Node pre "+node.data);
		
		for(Node child:node.chidren)
		{
			System.out.println("Edge pre "+node.data+" -> "+child.data);
			traverse(child);
			System.out.println("Node post "+child.data);
			System.out.println(" Edge post "+node.data+" -> "+child.data);
		}
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
		
		System.out.println(root.getSize(root));
		
		System.out.println("Max value is -> "+root.getMax(root));
		
		System.out.println("Height of generic tree: "+root.height(root));
		
		root.traverse(root);
	}
}
