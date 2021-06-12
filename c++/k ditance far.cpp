// print at k distance far from a node

#incliude<bits.stdc++.h>
using namespace std;

void printkdown(struct node*root,int k)
{
if(root==NULL||	k<0)
return;
	
if(k==0)
{
	cout<<root->data<<" ";
	
	}	
printkdown(root->left,k-1);
printkdown(root->right,k-1);	
}

bool findnodepath(struct node*root,int data,vector<int>&path)
{
	
	if(root==NULL)
	return;
	
	if(root->data==data)
	{
		path.push_back(root->data);
		return true;
	}
	bool left=findnodepath(root->left)
	if(left==true)
	{
		path.push_back(root->data);
		return true;
	}
	bool right=findnodepath(root->right)
	{
		path.push_back(root->data)
		return true;
	}
	return false;
}

int main()
{
	
	
	
	
}
