#include<bits/stdc++.h>
using namespace std;


struct node*a(node*list1,node*list2)
{
	
	
	list1=reverse(list1);
	
	list2=reverse(list2);
	
	node*dummy=new node(-1);
	
	node*curr=dummy;
	
	int carry=0;
	
	while(list1!=NULL&&list2!=NULL)
	{
		
		
		int sum=list1->data+list2->data+carry;
		
		curr->next=new node(sum%10);
		
		if(sum>=10)
		carry=sum/10;
		else
		carry=0;
		
		curr=curr->next;
		list1=list1->next;
		list2=list2->next;
	}
	
	while(list1!=NULL)
	{
		int sum=list1->data+carry;
		
		curr->next=new node(sum%10);
		
		if(sum>=10)
		carry=sum/10;
		else
		carry=0;
		
		curr=curr->next;
		list1=list->next;
	}
		while(list2!=NULL)
	{
		int sum=list2->data+carry;
		
		curr->next=new node(sum%10);
		
		if(sum>=10)
		carry=sum/10;
		else
		carry=0;
		
		curr=curr->next;
		list2=lis2->next;
	}
	struct node*d1=dummy->next;
	
	dummy->next=NULL;
	
	return reverse(d1);
	//return()
}

int main()
{
	
	struct node*list1=new node(1);
	
	list1->next=new node(2);
	
	list1->next->next=new node(3);
	
	struct node*list2=new node(4);
	
	list2->next=new node(5);	
	
	struct node*a=add(list1,list2);
	
	
	
}
