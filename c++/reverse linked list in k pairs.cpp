// reverse linked list in k pairs

#include<bits/stdc++.h>

using namespace std;

struct node
{
	int data;
	node*next;
	node(int data)
	{
		this->data=data;
		this->next=NULL;
		
	}
};


node*reverse(node*head,int k)
{
	
	
	node*curr=head;
	node*prev=NULL;
	node*temp=NULL;
	
	int count=1;
	
	while(curr!=NULL&&count<=k)
	{
	temp=curr->next;
	curr->next=prev;
	prev=curr;
	curr=temp;
	count=count+1;	
	}
	// prev head and curr will be next
	
	if(curr!=NULL)
	{
		head->next=reverse(curr,k);
	}
     
    return prev; 
}

void printhead(node*head)
{
	struct node*curr=head;
	while(curr!=NULL)
	{
		cout<<curr->data<<" ";
		curr=curr->next;
	}
}
int main()
{
	
	node*head=new node(1);
	head->next=new node(2);
	head->next->next=new node(3);
	head->next->next->next=new node(4);
	 head->next->next->next->next=new node(5);
	 
	 
	 printhead(head);
	 cout<<endl;
	 
	 struct node*newhead=reverse(head,2);
	 
	 printhead(newhead);
	 
	// cool finally:p
}
