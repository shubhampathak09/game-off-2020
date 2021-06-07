#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={1,2,4,6,3,7,8};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	int xorsum=0;
	
	
	for(int i=1;i<=8;i++)
	{
		xorsum^=a[i];
	}
	int xor1=0;
	for(int i=0;i<n;i++)
	{
		xor1^=a[i];
	}
	
	int res=xorsum^xor1;
	
	cout<<res;
	
}
