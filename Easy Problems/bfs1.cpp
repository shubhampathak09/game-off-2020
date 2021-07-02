// wondev woman
// concepts involved
// flood fill Minmax Simulation
//Vornoi Diagrams
// WW Post Mortem
// reCurse Blog
// PostMortem
//board games

// bfs

#include<bits/stdc++.h>
using namespace std;


vector<int>g[10001];




void bfs(int source,int v)
{
	queue<int>q;
	
	bool visited[v];
	
	
	for(int i=0;i<v;i++)
	visited[i]=false;
	
	q.push(source);
	visited[source]=false;
	
	while(!q.empty())
	{
		
		int nd=q.front();
		
		cout<<nd<<endl;
		
		q.pop();
		
		
		for(auto x:g[nd])
		{
			
			if(visited[x]==false)
			{
				q.push(x);
				visited[x]=true;
			}
		}
		
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
	
	
	bfs(1,n);
	
	
// end of code
 
 } 
