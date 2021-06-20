#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	int a[]={1,15,10};
	
	int k=6;
	
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	sort(a,a+n);
	
	int minel;
	int maxel;
	
	int result=a[n-1]-a[0];
	
	for(int i=1;i<=n-1;i++)
	{
		maxel=max(a[i-1]+k,a[n-1]-k);
		minel=min(a[0]+k,a[i]-k);
		result=min(result,maxel-minel);
	}
	
	cout<<result;
	
}
