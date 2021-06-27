#include<bits/stdc++.h>
using namespace std;

struct node
{
	int data;
	struct node*next;
	node(int data)
	{
		this->data=data;
	//	left=NULL;
	//	right=NULL;
	next=NULL;
	}
};


struct node*reverse(node*head)
{
	
	
	struct node*prev=NULL;
	struct node*curr=head;
	struct node*temp=NULL;
	
	while(curr!=NULL)
	{
		temp=curr->next;
		curr->next=prev;
		prev=curr;
		curr=temp;
	}
	return prev;
}
//
//struct node*add(node*head,int n)
//{
//	
//	head=reverse(head);
//	
//	
//	struct node*temp=head;
//	int sum=n+temp->data;
//	
//	int carry=sum/10;
//	
//	temp->data=sum%10;
//	
////	head=head->next;
//	
//	while(carry!=0&&head!=NULL)
//	{
//	 
//	sum=head->data+carry;
//	
//	head->data=sum%10;
//	
//	carry=sum/10;
//	head=head->next;	
//	}
//	
//	if(head==NULL&&carry!=0)
//	{
//		while(carry!=0)
//		{
//			head->data=new node(carry%10);
//		}   carry=carr
//	}
//	
//	return head;
//}


struct node*add(struct node*head,int n)
{
	
	int carry=n;
	
	
	
	head=reverse(head);
	
   struct node*outp=head;
	
	struct node*prev=NULL;
	
	int sum=0;
	
	while(head!=NULL)
	{
//		cout<<"Iteration .. "<<sum<<" "<<carry<<" "<<endl;
		sum=head->data+carry;
		head->data=sum%10;
//		cout<<head->data<<" "<<endl;
		carry=sum/10;
		prev=head;
		head=head->next;
		
	}
	
//	cout<<carry<<" "<<prev->data<<" "<<endl;
	while(carry!=0)
	{
		
		prev->next=new node(carry%10);
		prev=prev->next;
		carry=carry/10;
	}
	
	//cout<<outp->data;
	
	head=reverse(outp);
	
	//cout<<"....."<<head->data;
	//cout<<head->next->data;
	return head;
}

void printnode(struct node*head)
{
	
	struct node*temp=head;
	while(temp!=NULL)
	{
		cout<<temp->data<<" ";
		temp=temp->next;
	}
}

int main()
{
	
	struct node*head=new node(1);
	 head->next=new node(2);
	 head->next->next=new node(3);
	 
	// cout<<head->data<<endl;
	 
	// head=reverse(head);
	 
	// cout<<head->data;
	
	struct node*a=add(head,30);
	
	printnode(a);
//	cout<<a->next->data;
	//printnode(a);
	
	
	
	// mistake in unthinkable part
	// made mistake in print node was searching in my main function add fuck
	//gg
	//code fixed
	//gg?>
}
