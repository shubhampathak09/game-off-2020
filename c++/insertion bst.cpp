
//18
// insert and search in bst

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


struct node*insert(struct node* root,int val)
{
	
	
	if(root==NULL)
	{
		return new node(val);
	}
	
	if(val>root->data)
	root->right=insert(root->right,val);
	else
	root->left=insert(root->left,val);
	return root;
}

void inorder(struct node*root)
{
	if(root==NULL)
	return;
	
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}


bool search(int key,struct node*root)
{
	if(root==NULL)
	return false;
	
	if(key==root->data)
	{
		return true;
	}
	bool found=false;
	if(key>root->data)
	{
		found=found||search(key,root->right);
	 } 
   if(key<root->data)
   {
   	found=found||search(key,root->left);
   }
   
   return found;
}

int main()
{
	
	
	struct node*root=NULL;
	
	root=insert(root,5);
	
	root=insert(root,3);
	
	root=insert(root,6);
	
	root=insert(root,8);
	
	root=insert(root,1);
	
	inorder(root);
	
	cout<<search(8,root);
	
	cout<<endl;
	
	
	cout<<search(0,root);
	
	
	
}
