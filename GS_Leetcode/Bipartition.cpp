#include<bits/stdc++.h>
using namespace std;
// also friend paring is antoher great ex


vector<vector<int>>g(1001);

vector<int>color(101);

vector<bool>visited(101);

// 1 red  2  blue
int n,m;


bool dfs(int s,int c,int par)
{
	
	visited[s]=true;
	color[s]=c;
	
	for(auto x:g[s])
	{
		if(x==par)
		continue;
		
		
		if(color[x]==0)
		{
			if(color[s]==1)
			{
				if(!dfs(x,2,s))
				return false;
			}else
			{
				if(!(dfs(x,1,s)))
				return false;
			}
		}
		
		if(color[s]==color[x])
		return false;
	}
	return true;
	
}

bool color_all()
{
	
 
	
	for(int i=1;i<=n;i++)
	{
		if(!visited[i])
		{
			if(!dfs(i,1,-1))
			return false;
		}
		
	}
	
	return true;
}

int main()
{
	
	
	cin>>n>>m;
	
	
	for(int i=1;i<=m;i++)
	{
		int a,b;
		cin>>a>>b;
		
		g[a].push_back(b);
		g[b].push_back(a);
	}
	
	int ans=color_all();
	
	cout<<ans;
	
	
	// printing the sets
	
//	if(ans)
//	{
//	
//	for(int i=1;i<=n;i++)
//	{
//	
//	cout<<color[i]<<" "<<endl;
//		
//	}
	
	// cool
	
	
	
}

// Test Case 1

/*
7 7
1 2
1 3
2 4
4 3
3 5
5 6
6 7
*/

// Test case 2

/*
7 8
1 2
1 3
2 4
4 3
3 5
4 6
5 7
6 7
0
*/


