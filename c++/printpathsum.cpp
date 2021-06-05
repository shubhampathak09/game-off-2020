// root to leaf path sum

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


void printpathsum(struct node*root,int sum)
{
	
	
	if(root->left==NULL&&root->right==NULL)
	{
		
		cout<<sum+root->data;
		cout<<endl;
	}
	
	if(root->left!=NULL)
	{
		int sumd=sum+root->data;
		printpathsum(root->left,sumd);
	}
	
	if(root->right!=NULL)
	{
		int sumd=sum+root->data;
		printpathsum(root->right,sumd);
	}
}


int main()
{
	
struct node*root=new node(1);
root->left=new node(2);
root->right=new node(3);

int sum=0;

printpathsum(root,sum);	
	
	
}
