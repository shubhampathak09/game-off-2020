// finr node to root path

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

void printpath(vector<int>path)
{
	
	for(int i=0;i<path.size();i++)
	{
		cout<<path[i]<<" ";
	}
	cout<<endl;
}


bool find(struct node*root,int data,vector<int>path)
{
if(root==NULL)
return false;

path.push_back(root->data);  // i nee path from  root to node so push here

if(root->data==data)
{
	printpath(path);
	return true;
}

bool fndleft=find(root->left,data,path);
if(fndleft==true)
{
	return true;
}
bool fndright=find(root->right,data,path);
if(fndright==true)
{
	return true;
}

return false;	
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
	
    vector<int>path;
		
	bool ans=find(root,70,path);
	
	if(ans==false)
	{
		cout<<"no path";
	}
}

