// SPOJ CSTREET
//apply the concept of mst learned here
//Input:
/*
1
2
5
7
1 2 1
2 3 2
2 4 6
5 2 1
5 1 3
4 5 2
3 4 3
*/
#include<bits/stdc++.h>
using namespace std;


vector<vector<pair<int,int>>>g(10001);


int getmin(int key[],int n)
{
	
	
	int mii=INT_MAX;
	
	int index=-1;
	
	for(int i=0;i<n;i++)
	{
		
		if(key[i]<mii)
		{
			mii=key[i];
			index=mii;
		}
		
	}
	
	return index;
}

int solveMST(vector<vector<pair<int,int>>>g,bool mst[],int key[],int parent[],int n)
{
	
	
	for(int count=1;count<=n-1;count++)
	{
		
		
		int u=getmin(key, n);
		
		if(u==-1)
		{
			cout<<"No such MST present";
			return -1;
			
		}
		
		mst[u]=1;
		
		for(auto x:g[u])
		{
			
			if(mst[x.first]==false&&x.second<key[x.first])
			{
				key[x.first]=x.second;
				parent[x.first]=u;
			}
		}
	}
	
	int wt=0;
	
	for(int i=1;i<n;i++)
	{
		
	 if(mst[i]==1)
	 {
	 	wt+=g[i][parent[i]].second;
	 }
		
	}
	
	return wt;
}
int main()
{
	
	int p;
	cin>>p;
	
	int n,m;
	
	cin>>n>>m;
	
	for(int i=1;i<=m;i++)
	{
		
		int a,b,c;
			cin>>a>>b>>c;
		g[a].push_back({b,c});
		g[b].push_back({a,c});
		
	}
     
	 int wt=0;
	 int parent[n];
	 parent[0]=0;
	 
	 bool mst[n];
	 
	 int key[n];
	 
	 for(int i=0;i<n;i++)
	 {
	 	key[i]=INT_MAX;
	 	
	 }
	 key[0]=0;
	 
	 
	int res= solveMST(g,mst,key,parent,n);
	 
	 
	 cout<<res*p<<endl;	
	
}
// to d0
// testing


//find correct apprpoach
