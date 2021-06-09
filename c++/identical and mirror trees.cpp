// check if mirror trees

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

bool checkidentical(struct node*root1,struct node*root2)
{
	if(root1->data!=root2->data)
	return false;
	
	if(root1==NULL&&root2==NULL)
	return true;
	
	if(root1==NULL||root2==NULL)
	return false;
	
	
	
	bool left=checkidentical(root1->left,root2->left);
	bool right=checkidentical(root1->right,root2->right);
	
	if(left&&right)
	return true;
	else
	return false;
}

bool ismirror(struct node*root1,struct node*root2)
{
	
	if(root1->data!=root2->data)
	return false;
	
	if(root1==NULL&&root2==NULL)
	return true;
	
	if(root1==NULL||root2==NULL)
	return false;
	
	
bool check1=checkidentical(root1->left,root2->right);
bool check2=checkidentical(root1->right,root2->left);

return check1&&check2&&root1->data==root2->data;	
}

int main()
{
	
	
	
	struct node*root1=new node(1);
	root1->left=new node(3);
	root1->right=new node(2);
	root1->right->left=new node(5);
	root1->right->right=new node(4);
	
	struct node*root2=new node(1);
	root2->left=new node(2);
	root2->right=new node(3);
	root2->left->left=new node(4);
	root2->left->right=new node(5);
	root2->right=new node(3);
	
	
	cout<<ismirror(root1,root2);
	
}
