// count unival nodes

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

int countunival(struct node* root)
{
	if(root->left==NULL&&root->right==NULL)
	return 1;
	
	if(root->left==NULL&&root->right!=NULL&&root->data==root->right->data)
	return 2;
	
	if(root->right==NULL&&root->left!=NULL&&root->data==root->left->data)
	return 2;
	
	int univalleft=countunival(root->left);
	int univalright=countunival(root->right);
	
	if(root->data==root->left->data&&root->data==root->right->data)
	return 1+univalleft+univalright;
	else
	return univalleft+univalright;
}
int main()
{
	
	
	struct node*root=new node(0);
	root->left=new node(1);
	root->right=new node(0);
	
	root->right->left=new node(1);
	root->right->right=new node(0);
	
	root->right->left->left=new node(1);
	root->right->left->right=new node(1);
	
	
	cout<<countunival(root);
	
	
}
