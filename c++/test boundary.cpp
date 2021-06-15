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
}
//set<int>s;

bool notleaf(struct node*root)
{
	
	if(root==NULL)
	return 0;
	
	if(root->left==NULL&&root->right==NULL)
	return 0;
	else
	return 1;
}

printleftboundary(struct node*root)
{
	
	if(root==NULL)
	{
		
		return;
	}
	
//	s.insert(root->data);
	
	if(notleaf(root->left)&&root->left!=NULL)
	{
    cout<<root->left->data;	
	printleftboundary(root->left);
}

   if(root->left==NULL)
   {
   	if(notleaf(root->right))
   	{
   		cout<<root->right->data;
   		printleftboundary(root->right);
	   }
   }
}

void printrightboundary(struct node*root)
{
	
	if(root==NULL)
	{
		
		return;
	}
	
//	s.insert(root->data);
	
	if(notleaf(root->right))
	{
    cout<<root->right->data;	
	printleftboundary(root->left);
}

}

int main()
{
	
	
	
}
