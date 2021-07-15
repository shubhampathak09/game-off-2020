#include<bits/stdc++.h>
using namespace std;


int find(int i,vector<int>&parent)
{
	
	if(i==parent[i])
	return i;
	
	return find(parent[i],parent);
	
}

void union_(int a,int b,vector<int>&parent)
{
	
    a=find(a,parent);
    b=find(b,parent);
	
//	if(a!=b)
	parent[b]=a;
	
}

int main()
{
	
	// test code 
	// without pat compression
	
	
	
	int n;
	int m;
	
	cin>>n>>m;
	
	vector<int>parent(n+1);
	
	for(int i=1;i<=n;i++)
	{
		parent[i]=i;
	}
	
	for(int i=1;i<=m;i++)
	{
	int a,b;
	
	cin>>a>>b;
    
	if(a!=b)	
	union_(a,b,parent);
		
	}
	
	map<int,int>mp;
	for(int i=1;i<=n;i++)
	{
		mp[parent[i]]++;
	}
	int prod=1;
    
    for(int i=1;i<=n;i++)
    {
    	cout<<parent[i]<<endl;
	}
    
    map<int,int>::iterator it;
    
    for(it=mp.begin();it!=mp.end();it++)
    {
    	
    	cout<<it->second<<endl;
    	prod=prod*it->second;
	}
	cout<<prod;


// dont understsmd	

// fixed
// was assigning wrong parents in union and find recursion calls so the issue


}
