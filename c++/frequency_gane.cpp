// Frquency game

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	int a[]={2,2,5,50,50,1};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	map<int,int>mp;
	
	
	for(int i=0;i<n;i++)
	{
		mp[a[i]]++;
	}
	
	
	map<int,int>::iterator it;
	
	int minf=INT_MAX;
	int mx=INT_MIN;
	for(it=mp.begin();it!=mp.end();++it)
	{
		if(it->second<=minf)
		{
			minf=it->second;
			if(mx<it->first)
			{
				mx=it->first;
			}
		}
	}
	
	cout<<mx<<endl;
}
