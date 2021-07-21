// connect the connected componenst

#include<bits/stdc++.h>
using namespace std;


vector<vector<int>>g(100);

vector<int>lead(101);

vector<bool>visited(101);


void dfs(int src)
{
	
	visited[src]=1;
	
	for(auto x:g[src])
	{
		if(!visited[x])
		dfs(x);
	}
	
}


int cc=0;




int conectedcmp(int n){
	
	
	for(int i=0;i<n;i++)
	{
		if(visited[i]==false){
			
			cc++;
			lead.push_back(i);
			dfs(i);
		}
	}
    return cc;	
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


int ans=conectedcmp(n);	
	
	
cout<<ans<<endl;

	
for(int i=0;i<n-1;i++)
{
	cout<<i<<" "<<i+1;
	cout<<endl;
}

}
