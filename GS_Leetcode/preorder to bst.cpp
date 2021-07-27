

// process the arry

// auto x: pre
// buildnst(root,x);

//preroder traversal to bst

#include<bits/stdc++.h>
using namespace std;

struct node
{
	int data;
	struct node*left;
	struct node*right;

    node(int data)
    {
    	this->data=data;
    	left=NULL;
    	right=NULL;
	}
};

//
//int findindex(int x,vector<int>a)
//{
//	int c=-1;
//	for(int i=0;i<a.size();i++)
//	{
//		if(a[i]>x)
//		{
//			c=i;
//			return c;  
//		}
//	}
//	return c;
//}
//
//
//struct node*solve(vector<int>pre,int low,int high,node*root) //10 5 1 7 40 50  
//{
//	if(low>high)
//	{
//		return NULL;
//	}
//	
//	if(low==high){
//		return new node(pre[low]);
//	}
//	
//	if(root==NULL)
//	{
//		root=new node(pre[low]);
//	}else
//	{
//		int index=findindex(pre[low],pre);
//		root->left=solve(pre,low+1,index-1,root);
//		root->right=solve(pre,index,high,root);
//		
//		return root;
//	}
//	
//}


// o(nn)


node*buildbst(node*root,int ele){
	
	if(root==NULL)
	{
		return new node(ele);
		
	}
	
	if(root->data>ele)
	{
      root->left=buildbst(root->left,ele);		
	}
	else
	{
		root->right=buildbst(root->right,ele);
	}
	return root;
}

void inorder(node*root)
{
	if(root==NULL)
	return;
	
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

int main()
{
	
	
	// bst
	
	struct node*root=NULL;
	
	
//	root=buildbst(root,10);
	
	//root=buildbst(root,5);
	
//	root=buildbst(root,20);


    //cout<<root->right->data;
    
 	
	 vector<int>pre={10,5,1,7,40,50};
	
 
   // struct node*root=NULL;
    
		
    for(auto x:pre)
    {
    	root=buildbst(root,x);
	}
	
	
	inorder(root);
	
	//cout<<root->left->data;
	
	// nice
	
	return 0;
}
