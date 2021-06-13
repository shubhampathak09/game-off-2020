// BT to DL

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



void binary_tree_dll(node*root,node* &head,node* &prev)
{
	
	if(root==NULL)
	{
		return;
	}
	
	binary_tree_dll(root->left,head,prev);
	if(prev==NULL)
	{
		head=root;
		prev=root;
	}
	else
	{
		root->left=prev;
		prev->right=root;
		prev=root;
	}
	binary_tree_dll(root->right,head,prev);
}
int main()
{
	
	
node*head=NULL;
node*prev=NULL;	
	
	struct node*root=new node(1);
	root->left=new node(2);
	root->right=new node(3);
	
	binary_tree_dll(root,head,prev);
	
node*temp=head;

while(temp!=NULL)
{
	cout<<temp->data<<" ";
	temp=temp->right;
	}	
	
}

// perfect
