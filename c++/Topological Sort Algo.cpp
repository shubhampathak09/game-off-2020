#include<bits/stdc++.h>
using namespace std;

vector<int>g[1001];
vector<int>result;
vector<int>in(101);
void solve()
{
	
	int n,m;
	
	cin>>n>>m;
	
	for(int i=1;i<=m;i++)
	{
		int a,b;
		cin>>a>>b;
		g[a].push_back(b);
		in[b]++;
		
	}
	
	queue<int>q;
	
	for(int i=0;i<n;i++)
	{
		if(in[i]==0)
		{
			q.push(i);
		}
	}
	int c=0;
	
	while(!q.empty())
	{
	int fr=q.front();
	result.push_back(fr);
	q.pop();

	
	for(auto x:g[fr])
	{
		in[x]=in[x]-1;
		
		if(in[x]==0)
		q.push(x);
		}
		
			c++;	
	}
	
	if(c!=n)
	{
		cout<<c;
		cout<<"Cylce present or deadlock or unrechable state";
		return;
	}
	
	
		for(int i=0;i<result.size();i++)
		{
			cout<<result[i]<<" ";
		}
	
}
int main()
{
	
	
	solve();
}
