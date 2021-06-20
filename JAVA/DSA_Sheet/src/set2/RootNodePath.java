package set2;

import java.util.ArrayList;
import java.util.Collections;

public class RootNodePath {
	
	
	public static class node
	{
		int data;
		node left;
		node right;
		
		node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static ArrayList<Integer>path;
	
	public static  boolean find(node node,int data)
	{
		 
		if(node==null)
			return false;
		
		
		if(node.data==data)
		{
			
			path.add(node.data);
			return true;
		}
		
		boolean lc=find(node.left,data);
		if(lc!=false)
		{
			path.add(node.data);
			return true;
		}
		
		
		boolean rc=find(node.right,data);
		if(rc!=false)
		{
			path.add(node.data);
			return true;
		}
		
		
		return false;
	}
	
//	public static void rootNodePath(node root,int data,ArrayList<Integer>path)
//	{
//		
//
//	}

	
	public static void main(String[] args)
	{
		
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		
		
	root.left.left=new node(4);
	root.left.right=new node(5);
	
	root.right.left=new node(6);
	root.right.right=new node(7);
	
	path=new ArrayList<>();
	
	boolean ans=find(root,5);
	
	//fuck it
	Collections.reverse(path);
	
	System.out.print(path);
		
	
	
	}
}
