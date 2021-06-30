#include<bits/stdc++.h>
using namespace std;

vector<vector<int>>g(101);

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
	
	int sz=-1;
	
	for(int i=1;i<=n;i++)
	{
	if(g[i].size()==m-1)
	{
		sz=i;
		}	
	}
	
	cout<<sz;
	
}
