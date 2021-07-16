// some randome algo 

// for detect cyle in directed graph

#include<bits/stdc++.h>
using namespace std;


// detect backedge

vector<int>g[100];
bool visited[100];
bool recstack[100];

bool dfs(int src,int parent)
{
	
	
	
	visited[src]=true;
	recstack[src]=1;
	
	for(auto x:g[src])
	{
		if(x==parent)
		continue;
		
		if(visited[x]==true)
		{
			
		return true;
		}
		else
		{
			return dfs(x,src);
		}
	}
	
	return false;
}

int main()
{
	
	int n,m;
	cin>>n>>m;
	
	for(int i=1;i<=m;i++)
	{
		int a,b;
		cin>>a>>b;
		g[a].push_back(b);
	}
	
	for(int i=0;i<n;i++)
	{
		if(visited[i]==0)
		{
			cout<<dfs(i,-1)<<endl;
		}
	  }  
	
//	bool ans=dfs(0);
	
	
//	cout<<ans;
}
