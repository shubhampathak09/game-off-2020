// cycle in undirected graph

#include<bits/stdc++.h>
using namespace std;


vector<int>g[10001];
vector<bool>visited(1000);

bool checkcycle(int src,int parent)
{
	
	
	visited[src]=true;
	
	for(auto x:g[src])
	{
		 if(visited[x]==false)
		 {
		 	if(checkcycle(x,src)==true)
		 	return true;
		 	 
		 }
		 else if(x!=parent)
		 {
		 	return true;
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
		g[b].push_back(a);
	}
	for(int u=0;u<n;u++)
	{
	
	 if(visited[u]==false)
	 {
	 	if(checkcycle(u,-1)==true)
	 	{
	 		cout<<"There is cycle in graph";
	 		return 0;
		 }
	 }
}

cout<<"No cycle";

}
