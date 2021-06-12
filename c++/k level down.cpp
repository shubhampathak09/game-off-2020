// print k levels down

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

void printkleveldown(struct node*root,int k)
{
	if(root==NULL)
	return;
	
	if(k==0)
	{
		cout<<root->data<<" ";
	}
	
	printkleveldown(root->left,k-1);
	printkleveldown(root->right,k-1);
//	cout<<endl;
	
}

int main()
{
	
	
	struct node*root=new node(50);
	root->left=new node(25);
	root->right=new node(75);
	root->left->left=new node(12);
	root->left->right=new node(37);
	root->left->right->left=new node(30);
	root->left->right->right=new node(40);
	
	root->right->left=new node(62);
	root->right->right=new node(87);
	
	root->right->left->left=new node(60);
	
	root->right->left->right=new node(70);
	
	
	struct node*root1=new node(1);
	root1->left=new node(2);
	root1->right=new node(3);
	root1->left->left=new node(4);
	root1->left->right=new node(5);
	
	root1->right->left=new node(8);
    
	
	struct node*root3=new node(1);
	root3->left=new node(2);
	root3->right=new node(3);
	
		
	printkleveldown(root3,1);
}
