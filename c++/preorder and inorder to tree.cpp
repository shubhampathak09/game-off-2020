// preorder inorder -> get tree

#include<bits/stdc++.h>
using namespace std;

struct node
{
		node(int data)
	{
		this->data=data;
		left=NULL;
		right=NULL;
	}
	
    int data;
    
	node *left;
	node*right;
	
	

};

node*create_tree_preorder_inorder(int &pre_indx,int st,int end,int pre[],map<int,int>mp)
{
	if(st>end)
	{
		return NULL;
	}
	
	node*root=new node(pre[pre_indx]);
	
	int idx=mp[pre[pre_indx]];
	pre_indx=pre_indx+1;
	root->left=create_tree_preorder_inorder(pre_indx,st,idx-1,pre,mp);
	
	 root->right=create_tree_preorder_inorder(pre_indx,idx+1,end,pre,mp);
	 
	 return root;
	
}  

void inorder(struct node*root)
{
	if(root==NULL)
	{
		return;
	}
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
	
}

int main()
{
	
	
	int in[]={3,1,4,0,5,2};
	int pre[]={0,1,3,4,2,5};
	
	map<int,int>mp;
	
	// values vs index in inorder
	
	for(int i=0;i<6;i++)
	{
		mp[in[i]]=i;
	}
	
	int pre_indx=0;
	
	node*root=create_tree_preorder_inorder(pre_indx,0,5,pre,mp);
	
	inorder(root);
}
