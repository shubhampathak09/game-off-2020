#include<bits/stdc++.h>
using namespace std;

vector<int>g[100001];
bool visited[100001];

struct par
{
	
	int i;
	int dist;
	
	par(int i,int dist)
	{
		this->i=i;
		this->dist=dist;
	}
	
};
int solve(int src,int dest)
{
	int dist=0;
	
	queue<par>q;
	
	visited[src]=0;
	
	q.push(par(src,0));
	
	while(!q.empty())
	{
		
		auto fr=q.front();
		
		if(fr.i==dest)
		return fr.dist;
		
		q.pop();
		
		for(auto x:g[fr.i])
		{
			if(visited[x]==false)
			{
				visited[x]=true;
				
				
				q.push(par(x,fr.dist+1));
			}
			
		}
		
	}
	return -1;
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
	visited[i]=false;
	
int ans=-1;
 ans=solve(1,n);
 
 cout<<ans;

cout<<endl;


cout<<"Computers on valid route would be:-"<<ans+1;	
}
