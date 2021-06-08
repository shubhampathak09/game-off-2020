// two sum problem

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={1,5,7,-1,5};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	sort(a,a+n);
	
	int l=0;
	int r=n-1;
	
	int target=6;
	
	for(int i=0;i<n;i++)
	{
	
	if(a[l]+a[r]==target)
	{
		cout<<l<<" "<<r<<endl;
		l++;
		r--; 	
	}
	else if(a[l]+a[r]>target)
	{
		r--;
	}
	else
	{
		l++;
	}
}
}
