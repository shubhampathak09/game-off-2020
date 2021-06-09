// find all indexes of occurence

#include<bits/stdc++.h>
using namespace std;


void printallindex(int a[],int l,int h,int x)
{
	
	if(l>h)
	{
		//cout<<l;
		return;
	}
	
	if(a[l]==x)
	{
		cout<<l<<endl;
	}
	
	printallindex(a,l+1,h,x);
}

int main()
{
	

int a[]={1,0,0,2,3,1,0,5,6,0,9,1,0};

int n=sizeof(a)/sizeof(a[0]);

int x=0;

printallindex(a,0,n-1,x);	
	
}
