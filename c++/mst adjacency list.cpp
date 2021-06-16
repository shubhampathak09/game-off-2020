#include<bits/stdc++.h>
using namespace std;

vector<vector<pair<int,int>>>g(1000);

int min_index(int key[],int n,bool mst[])
{
	
	
	int min_val=INT_MAX;
	int index=-1;
	
	for(int i=0;i<n;i++)
	{
		if(mst[i]==false&&key[i]<min_val)
		{
			min_val=key[i];
			index=i;
		}
	}
	return index;
}


void solvemst(vector<vector<pair<int,int>>>g,int keys[],bool mst[],int n,int parent[])
{
	
	
	
	
	for(int count=1;count<=n-1;count++)
	{
		
	int v=min_index(keys,n,mst);
	
	mst[v]=true;
	for(auto x:g[v])
	{
		if(mst[x.first]==false&&x.second<keys[x.first])
		{
			keys[x.first]=x.second;
			parent[x.first]=v;
		}
		
	}
}

for(int i=1;i<n;i++)
{
    cout<<parent[i]<<i<<g[parent[i]][i].second;
//	cout<<parent[i]<<" "<<i<<" "<<g[parent[i]][i]<<" ";
	cout<<endl;
}

}

void solve()
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
	
	int keys[n];
	
	for(int i=0;i<n;i++)
	{
		keys[i]=INT_MAX;
	}
	
	int parent[n];
	
	
	keys[0]=0;
	
	parent[0]=-1;
	
	bool mst[n];
	
	solvemst(g,keys,mst,n,parent);
	
}

int main()
{
	solve();
	
}
