// duplicates

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={1,2,3,4,3,6,6,6,1,6};
	
	
	int n=sizeof(a)/sizeof(a[0]);
	map<int,int>mp;
	
	
	for(int i=0;i<n;i++)
	{
		 
		mp[a[i]]++;
 
	}
	
	map<int,int>::iterator it;
	
	for(it=mp.begin();it!=mp.end();++it)
	{
		if(mp[it->first]>1)
		{
			cout<<it->first;
			cout<<endl;
		}
	}
}
