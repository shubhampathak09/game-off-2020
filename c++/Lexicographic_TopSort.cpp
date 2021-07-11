// Lexicographic top sort
// SPOJ TOPOSORT
#include<bits/stdc++.h>
using namespace std;


vector<int>g[10001];

vector<int>res;

vector<int>in(10001);



void topsort_lex()
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
	
	priority_queue<int,vector<int>,greater<int>>pq;
	for(int i=1;i<=n;i++)
	{
		if(in[i]==0)
		pq.push(i);
	}
	int cnt=0;
	
	vector<int>result;
	
	while(!pq.empty())
	{
		int tp=pq.top();
		pq.pop();
		result.push_back(tp);
	    cnt++;
		
		for(auto x:g[tp])
		{
			in[x]--;
			if(in[x]==0)
			{
				pq.push(x);
			}
			}	
	}
	
	if(cnt!=n)
	{
		cout<<-1;
		return;
	}
	
	for(int i=0;i<result.size();i++)
	{
		cout<<result[i]<<" ";
	}
}

int main()
{
	
	topsort_lex();	
	
}



/*
8 9
1 4
1 2
4 2
4 3
3 2
5 2
3 5
8 2
8 6
1 4 3 5 7 8 2 6
-----------------
*/
