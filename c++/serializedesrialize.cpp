#include<bits/stdc++.h>
using namespace std;

struct node{
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

void serialize_tree(node *root,FILE *fp)
{
	
	
	if(root==NULL)
	{
		fprintf(fp,"%d",-1);
		return;
	}
	
	fprintf(fp,"%d ",root->data);
	serialize_tree(root->left,fp);
	serialize_tree(root->right,fp);
}

// deserialize_tree

void inorder(struct node*root)
{
    //cout<<root->data;
	
	if(root==NULL)
	return;
	
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
	
}

struct node* deserialize(FILE *fp)
{
	
	int value;
 
	if(!fscanf(fp,"%d",&value)||value==-1)
	{
	return NULL;	
	}
	
	node *root=new node(value);
	
	root->left=deserialize(fp);
	root->right=deserialize(fp);
	
	return root;
}
int main()
{
	
//	
//	node*root;
//	root1=insert(root1,1);
//	//...


    node*root=new node(5);
    root->left=new node(3);
    root->right=new node(6);
    
    FILE *f=fopen("serialize_deserialize.txt","w");
    
	
	serialize_tree(root,f);
	fclose(f);
	
	
	
	f=fopen("serialize_deserialize.txt","r");
	
	struct node*root2=deserialize(f);

	
	inorder(root2);
	
		
	//cout<<root2->data;
	
	
	
	
}

// desrialzie?

