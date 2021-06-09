//16

// replace every number with greatest on right

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={16,17,4,3,5,2};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	int great[n];
	
	great[n-1]=-1;
	
	for(int i=n-2;i>=0;i--)
	{
		
		great[i]=max(a[i+1],great[i+1]);
		
		}
		
		for(int i=0;i<n;i++)
		{
			cout<<great[i]<<" ";
			}	
}
