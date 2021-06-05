// max f array

#include<bits/stdc++.h>
using namespace std;

int maxarray(int a[],int n)
{
	if(n==1)
	{
		return a[0];
	}
	
	int element=a[n-1];
	return max(element,maxarray(a,n-1));
}

int main()
{
	
	int a[]={3,4,1,2,4,5,6};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	cout<<maxarray(a,n);
	
}
