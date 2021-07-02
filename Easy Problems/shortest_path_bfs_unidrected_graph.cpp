// shortest path in unidrected graph->bfs

#include<bits/stdc++.h>
using namespace std;


vector<int>g[10001];

bool visited[10001];


int dist[10001];

int parent[10001];

void cal_shortestpath(int src,int n,int dest=-1)
{
	
	dist[src]=0;
	parent[src]=-1;
	visited[src]=1;
	
	queue<int>q;
	q.push(src);
	while(!q.empty())
	{
		
		auto x=q.front();
		q.pop();
		
		for(auto e:g[x])
		{
			
			if(visited[e]==false)
			{
				visited[e]=true;
				q.push(e);
				parent[e]=x;
				dist[e]=dist[x]+1;
			}
		}
		
		
		if(dest!=-1)
		{
			
			// use the parent info
			
			int temp=dest;
			
			while(temp!=-1)
			{
				cout<<temp<<" ";
				temp=parent[temp];
			}
		//	cout<<src;
		}
		// done
	}
	
	// print path
	
	for(int i=0;i<n;i++)
	{
		cout<<"Shortet dist to node "<<i<<" "<<dist[i];
	}
	
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
		g[b].push_back(a);
	}
	for(int i=1;i<=n;i++)
	visited[i]=0;
	// single sourdce sp
}
