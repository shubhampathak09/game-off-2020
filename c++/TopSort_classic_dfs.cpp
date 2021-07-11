// TopSort using classic dfs

#include<bits/stdc++.h>
using namespace std;

vector<int>g[10001];

vector<int>visited(10001);

void dfs1(int src,stack<int>&s)
{
	
	visited[src]=true;
	
	for(auto x:g[src])
	{
		if(visited[x]==false)
		{
			dfs1(x,s);
		}
	}
	s.push(src);
}

void TopSort()   // global dfs
{
	
	int n,m;
	
	cin>>n>>m;
	
	stack<int>s;
	
	
	for(int i=1;i<=m;i++)
	{
		int a,b;
		cin>>a>>b;
		
		g[a].push_back(b);
	}
	
	
	for(int i=0;i<n;i++){
		
		if(visited[i]==false)
		{
			dfs1(i,s);
		}
		
	}
	
	while(!s.empty())
	{
		cout<<s.top()<<" ";
		s.pop();
	}
	
}

int main()
{
	
	TopSort();
	
}
