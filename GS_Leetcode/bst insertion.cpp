#include<bits/stdc++.h>
using namespace std;


struct node
{
	int data;
	node*left;
	node*right;
	node(int data)
	{
		this->data=data;
		left=NULL;
		right=NULL;
	}
};



node*constructbst(struct node*root,int data)
{
	
if(root==NULL)
{
	return new node(data);
	}	
	
if(root->data>data)
{
	root->left=constructbst(root->left,data);
	}	
else
{
	root->right=constructbst(root->right,data);
	}	
	
	
	return root;
}


void inorder(node*root){
	
	if(root==NULL)
	return;
	
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

int main()
{
	
	
	struct node*root=NULL;
	
	
	 root=constructbst(root,10);
	
	root=constructbst(root,5);
	
	root=constructbst(root,20);
	
	root=constructbst(root,30);
	
	root=constructbst(root,12);
	
	inorder(root);
}
