// standarad algo cycle detection directed graph

#include<bits/stdc++.h>

using namespace std;

vector<vector<int>>g(101);

bool iscycleutil(int i,bool *visited,bool *recstack)
{
	
	
	visited[i]=true;
	recstack[i]=true;
	
	for(auto x:g[i])
	{
		if(visited[x]==false)
		{
			return iscycleutil(x,visited,recstack);
		}
		else if(recstack[i])
		{
			return true;
		}
	}
	recstack[i]=false;
	return false;
}

bool iscycle(int v)
{
	
	
	bool recstack[v];
	bool visited[v];
	
	
	for(int i=0;i<v;i++)
	{
		recstack[i]=false;
		visited[i]=false;
	}
	
	
	for(int i=0;i<v;i++)
	{
		if(iscycleutil(i,visited,recstack))
		return true;
	}
	return false;
}
int main()
{
	
	// wrtie test case here
	
	//eg
	
	int n,m;
	
	cin>>n>>m;
	
	for(int i=1;i<=m;i++)
	{
		int a,b;
		cin>>a>>b;
		
		g[a].push_back(b);
	}
	
	
	int result=iscycle(n);
	
	cout<<result;
}
