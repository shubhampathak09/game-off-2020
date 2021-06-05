// display array

#include<bits/stdc++.h>
using namespace std;

void display(int a[],int idx)
{
	if(idx==0)
	{
		cout<<a[idx];
		return;
	}
	
	int last=a[idx];
	
	
	display(a,idx-1);
	cout<<" "<<last;
}

int main()
{
	
	int a[]={3,4,5,1,2,3};
	
	int n=sizeof(a)/sizeof(a[0]);
	
   display(a,n-1);	
	
}
