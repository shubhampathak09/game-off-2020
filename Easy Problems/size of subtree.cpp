#include<bits/stdc++.h>
using namespace std;

// size of each subtree

vector<int>g[10001];
int visited[10001];
int sz[10001];

void ssz(int src)
{
	visited[src]=1;
  //  int sz=0;
	int sum=0;
	
	int sz[src]=1;
	
	for(auto x:g[src])
	{
		if(visited[x]==0)
		{
			ssz(x);
		}
		 sum+=sz[x];
		 
		// sz[src]+=sz[x];
		}	
	sz[src]=1+sum;
	
	// no extra code
}

void solve()
{
	int n,m;
	
	cin>>n>>m;
	
	
	for(int i=1;i<=m;i++)
	{
		int a,b;
		
		cin>>a>>b;
	    g[a].push_back(b);
		g[b].push_back(a);	
	}
    
	
	int src=1;
		
	ssz(1);
	
	for(int i=1;i<=n;i++)
	{
		cout<<sz[i]<<endl;
	}
}
int main()
{

solve();	
	
	
}
