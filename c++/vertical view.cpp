// vertical view of bt

#include<bits/stdc++.h>
using namespace std;


struct node
{
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this->data=data;
		this->left=NULL;
		this->right=NULL;
	}
};


void topview(struct node*root)
{
	
	
	queue<pair<node*,int>>q;
	map<int,int>mp;
	q.push({root,0});
	
	while(!q.empty())
	{
		
		auto temp=q.front();
		q.pop();
		int hd=temp.second;
		auto node=temp.first;
		
		if(mp.count(hd)==0)
		{
			mp[hd]=node->data;
		}
		if(node->left!=NULL)
		{
			q.push({node->left,hd-1});
		}
		if(node->right!=NULL)
		{
			q.push({node->right,hd+1});
		}
	}
	for(auto it:mp)
	{
		
		cout<<it.first<<" "<<it.second<<endl;
	}
	
	
}

void verticalview(struct node*root)
{
    int left=0;
    int right=0;
    
	map<int,int>mp;
	queue<pair<node*,int>>q;
	q.push({root,0});
	
	while(!q.empty())
	{
		
	   
	   auto temp=q.front();
	   
	   node* n=temp.first;
	   int hd=temp.second; 
		q.pop();
		
		mp[hd]=n->data;
		
		if(n->left!=NULL)
		{
			left=min(left,hd-1);
			q.push({n->left,hd-1});
		}
		if(n->right!=NULL)
		{
			right=max(right,hd+1);
			q.push({n->right,hd+1});
		}
	}
	int sum=0;
	for(auto it:mp)
	{
		cout<<it.first<<" "<<it.second<<endl;
		sum+=it.second;
	}
	cout<<sum;
	
	cout<<endl;
	
	cout<<right<<left<<endl;
	cout<<"max width if binaty tree is.."<<right-left;
}
int main()
{
	                                                       /*          1
	                            2      
	                       
						   
						                                      4    5  */
 struct node*root=new node(1);    
	root->left=new node(2);                     
	                                                            
	root->left->left=new node(4);
	
	root->left->right=new node(5);
	
	
	
	topview(root);
	cout<<"...";
	cout<<endl;
	verticalview(root);
}
