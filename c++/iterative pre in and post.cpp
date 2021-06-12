// iterative preordder postorder and inorder

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
		left=NULL;
		right=NULL;
	}
};

struct nodepair
{
	struct node*no;
	int state;
	
	nodepair(node*no,int state)
	{
		this->no=no;
		this->state=state;
	}
};


void inord(node*root)
{
	if(root==NULL)
	return;
	inord(root->left);
	cout<<root->data<<" ";
	inord(root->right);
}


int main()

{
	
	
	
	struct node*root=new node(1);
	
	root->left=new node(2);
	
	root->right=new node(3);
	
	root->left->left=new node(4);
	
	root->right->right=new node(5);
	
    //stack<int>st;
			
	stack<nodepair*>st;
	
	st.push(new nodepair(root,1));
	
	// 1->pre orser
	//2->inorder
	//3->post order
	
	string preorder="";
	string inorder="";
	string postorder="";
	
	
	while(!st.empty())

{
	
	nodepair* temp=st.top();
	
 
	
	
	if(temp->state==1) // preorder
	{
		preorder+=to_string(temp->no->data)+" ";
		temp->state=temp->state+1;
		if(temp->no->left!=NULL)
		{
			st.push(new nodepair(temp->no->left,1));
		}
	}else if(temp->state==2)
	{
		inorder+=to_string(temp->no->data)+" ";
		temp->state++;
		if(temp->no->right!=NULL)
		{
			st.push(new nodepair(temp->no->right,1));
		}
	}else
	{

		postorder+=to_string(temp->no->data)+" ";
		st.pop();
	}
			}
				
				cout<<inorder<<endl;
				cout<<preorder<<endl;
				cout<<postorder<<endl;		
	 
	 //inord(root);
	 
}

