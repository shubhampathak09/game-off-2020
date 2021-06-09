// merge two sorted linked list

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

node* merge(node *head1,node*head2)
{
	
	
	if(head1==NULL)
	return head2;
	else if(head2==NULL)
	return head1;
	
	struct node*head3=new node();
	
	int left=0;
	int right=0;
	
	struct node*temp=NULL;
	while(head1!=NULL&&head2!=NULL)
	{
	//	struct node*temp=new node();
		
		if(head1->data<head2->data)
		{
			temp->data=head1->data;
			head1=head1->next;
			 
		}
		else
		{
			temp->data=head2->data;
			head2=head2->next;
		    
		}
		
		temp->next=new node();
	}
	
}

int main()
{
	
	struct node*head1=new node(10);
	head1->next=new node(20);
	head1->next->next=new node(30);
	head1->next->next->next=new node(40);
	head1->next->next->next->next=new node(50);
	
	struct node*head2=new node(7);
	head2->next=new node(9);
	head2->next->next=new node(12);
	head2->next->next->next=new node(35);
	head2->next->next->next->next=new node(50);
	head2->next->next->next->next->next=new node(60);
	
	
}
