// binary tree to bst


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

void inorder(node*root,vector<int>&temp)
{
	
	if(root==NULL)
	return;
	
	inorder(root->left,temp);
	temp.push_back(root->data);
	inorder(root->right,temp);
	
}

void inordertobst(struct node*root,vector<int>&temp,int &i)
{
	
	if(root==NULL)
	return;
	
	inordertobst(root->left,temp,i);
	root->data=temp[i];
	i++;
	inordertobst(root->right,temp,i);
}

int main()
{
	
struct node*root=new node(4);

root->left=new node(3);
root->right=new node(2);

vector<int>temp;

inorder(root,temp);


//cout<<temp.size();


sort(temp.begin(),temp.end());

//for(int i=0;i<temp.size();i++)
//{
//	cout<<temp[i]<<" ";
//	}	

int i=0;


 inordertobst(root,temp,i);
 
 
 // to check
}
