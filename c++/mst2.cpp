#include<bits/stdc++.h>
using namespace std;

vector<vector<pair<int,int>>>g(10001);

struct edge
{
	
	int w;
	int to;
	
	edge()
	{
		w=INT_MAX;
		to=-1;
	}
};


void prim(int n)
{
	
	
	
	int total_weight=0;
	
	
	vector<bool>selected(n,false);
    
	vector<edge>min_edges(n);
	
	
	min_edges[0].w=0;
	
	for(int i=0;i<n;i++)
	{
		
		int v=-1;
		
		for(auto x:g[i])
		{
			if(selected[x.first]==0&&(v==-1||min_edges[x.first].w<min_edges[i].w))
			{
			 v=x.first;
			}
		}
		
		if(min_edges[v].w==INT_MAX)
		{
			cout<<"NO mst";
			exit(0);
		}
		
		selected[v]=true;
		
		total_weight+=min_edges[v].w;
	 
	    if(min_edges[v].to!=-1)
		cout<<v<<" "<<min_edges[v].to; 
	    
		
		for(int to=0;to<n;to++)
		{
			for(auto x:g[to])
			{
				if(x.second<min_edges[to].w)
				min_edges[to].w=x.second;
			}
		}
		 
	 }
	 
	 cout<<total_weight; 
	 	
} 

int main()
{
	
	int n,m;
	
	cin>>n>>m;
	
	
	for(int i=1;i<=m;i++)
	{
		
		int a,b,c;
		
		cin>>a>>b>>c;
	    g[a].push_back({b,c});
	    g[b].push_back({a,c});
		}
		
		prim(n);
		
		
	}
	
	
	//fuck it qiulm comnnew backj
	



