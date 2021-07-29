// bst insert

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
		this->left=NULL;
		this->right=NULL;
	}
};



struct node*insert(int data,struct node*root)
{
	if(root==NULL)
	{
		return new node(data);
	}
	
	
	if(data<root->data)
	{
		root->left=insert(data,root->left);
	}else
	root->right=insert(data,root->right);
	
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


bool search(struct node*root,int data)
{
   if(root==NULL)
   {
   	return 0;
	   }	
	
	if(data==root->data)
	{
		return true;
	}
	else
	{
	
    if(root->data<data)
    {
    	return search(root->right,data);
	}else
	return search(root->left,data);
}
}
int main()
{
	

struct node*root=NULL;

root=insert(10,root);
root=insert(5,root);
root=insert(35,root);
root=insert(40,root);


inorder(root);
	
	
cout<<search(root,35);

cout<<endl;



cout<<search(root,20);	


// cool
}
