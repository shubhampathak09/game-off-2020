// unidrected graph

// no back edge

#include<bits/stdc++.h>
using namespace std;

vector<int>g[101];

bool visited[101];


bool dfs(int i,int parent)
{
	
	visited[i]=1;
	
	for(auto x:g[i])
	{
		
		if(x==parent)
		continue;
		
		else if(visited[x]==false)
		{
			dfs(x,i);
		}
		else
		{
			// cycle
			return true;
		}
	}
	return false;
	
}

bool checkcyle(int n)
{
	
	for(int i=0;i<n;i++)
	{
		visited[i]=false;
	}
	
	for(int i=0;i<n;i++)
	{
		if(dfs(i,-1))
		return true;
	}
	return false;
}

int main()
{
	
	
	
}
