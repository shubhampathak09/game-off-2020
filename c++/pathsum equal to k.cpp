// path sum equals k

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
		this->right=NULL;	}
};


bool haspathsum(struct node*root,int k)
{
	
	if(root==NULL)
	return 0;
	else
	{
		
		
		int subsum=k-root->data;
		
		bool ans=0;
		
		 if(root->left==NULL&&root->right==NULL)
		 {
		 	return subsum==0;
		 }
		 
		 if(root->left!=NULL)
		 {
		 	return ans||haspathsum(root->left,subsum);
		 }
		 
		 if(root->right!=NULL)
		 {
		 	return ans||haspathsum(root->right,subsum);
		 }
		 
		 return ans;
	}
	
}

int main()
{
	
 node *root = new node(10);
    root->left = new node(8);
    root->right = new node(2);
    root->left->left = new node(3);
    root->left->right = new node(5);
    root->right->left = new node(2);	
	
	
	int sum=21;
	
	cout<<haspathsum(root,0);
	cout<<haspathsum(root,21);
//	cout<<haspathsum(root,23);
	//cout<<ans;
	
	}
