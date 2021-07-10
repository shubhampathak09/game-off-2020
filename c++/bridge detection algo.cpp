// bridges
// in time 
#include<bits/stdc++.h>
using namespace std;


vector<int>arr[100];

int in[101],low[101];
int vis[101];
int timer;

void dfs(int node,int par)
{
	
	vis[node]=1;
	in[node]=low[node]=timer;
	timer++;
	for(auto x:arr[node])
	{
		if(x==par)
		{
			continue;
		}
		
		if(vis[x]==true)
		{
			// backedge(minimise the low time)
			low[node]=min(low[node],in[x]);
		} 
		else
		{
		// forward edge
		dfs(x,node);
		 if(low[x]>in[node])
		 {
		 	cout<<node<<" "<<x<<endl;
		 }
		 low[node]=min(low[node],low[x]);
		 // bridge detection algo
	}
	}
}

int main()
{
	
	int n,m;
	
	cin>>n>>m;
	
	while(m--)
	{
	int x,y;
	cin>>x>>y;
	
	arr[x].push_back(y);
	arr[y].push_back(x);	
	

		
	}
		dfs(1,-1);
	// print the beidges in graph in console
	// rewind the algorithm
	// helpful in testing maxflow and minflows
}
