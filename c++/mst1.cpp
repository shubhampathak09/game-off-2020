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

//for(int i=1;i<n;i++)
//{
//  //  cout<<parent[i]<<" "<<i<<" ";
//	cout<<parent[i]<<" "<<i<<" ";
//    //cout<<g[i][parent[i]].first;
//	cout<<endl;
//}

int wt=0;
 

for(int i=1;i<n;i++)
{
	
	if(mst[i]==true)
	{
		cout<<parent[i]<<" "<<i<<" "<<g[i][parent[i]].second;
	    wt+=g[i][parent[i]].second;	
	    cout<<endl;
	}
	
}


cout<<"Total wt of spanning tree is "<<wt;

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

/*
9 14
0 1 4
0 7 8
1 2 8
1 7 11
2 3 7
2 8 2
2 5 4
3 4 9
3 5 14
4 5 10
5 6 2
6 7 1
6 8 6
7 8 7
018
1211
234
349
25-2147483392
560
6716779925
280
*/


/*
4 5
0 1 1
0 2 4
2 3 5
1 3 2
0 3 3
0 1
0 2
1 3
*/


// domt know
