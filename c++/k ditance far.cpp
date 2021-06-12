// print at k distance far from a node

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
//
//void printkdown(struct node*root,int k)
//{
//if(root==NULL)
//return;
//	
//if(k==0)
//{
//	cout<<root->data<<" ";
//	//return;
//	}	
//printkdown(root->left,k-1);
//printkdown(root->right,k-1);	
//}
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

bool findnodepath(struct node*root,int data,vector<node*>&path)
{
	
	if(root==NULL)
	return false;
	
	if(root->data==data)
	{
		path.push_back(root);
		return true;
	}
	bool left=findnodepath(root->left,data,path);
	if(left==true)
	{
		path.push_back(root);
		return true;
	}
	bool right=findnodepath(root->right,data,path);
	{
		path.push_back(root);
		return true;
	}
	return false;
}

int main()
{
	
	
	struct node*root=new node(1);
	root->left=new node(2);
	root->right=new node(3);
	
	vector<node*>path;
	
	int no=3;
	
	bool ans=findnodepath(root,no,path);
    
    int distance=1;
    
    printkleveldown(root,distance);
   cout<<ans;    
//
//    if(path.size()!=0&&ans==true)
//	{
//		
//		int k=dist;
//		
//       	for(int i=0;i<=dist;i++)
//       	{
//       		auto temp=path[i];
//       		
//       		printkdown(temp,k-i);
//       	//	k=k-1;
//       		cout<<endl;
//		   }
//		
//		 } 	
//	for(int i=0;i<path.size();i++)
//	{
//		cout<<path[i]<<" ";
//	}
	
}


// strange'

