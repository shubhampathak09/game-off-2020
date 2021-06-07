// maxdistance

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={36,8,10,3,2,80,30,33,1};
	
	
	int n=sizeof(a)/sizeof(a[0]);
	
	int mx=INT_MIN;
	
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[j]-a[i]>=0)
			{
				mx=max(mx,j-i);
			}
		}
	}
	
	cout<<mx;
}
