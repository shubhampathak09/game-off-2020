// kruskal

#include<bits/stdc++.h>
using namespace std;

struct edge
{
	
	int src;
	int dest;
	int wt;
	
	edge(int src,int dest,int wt)
	{
		this->src=src;
		this->dest=dest;
		this->wt=wt;
	}
};


vector<edge*>g(10001);

vector<int>parent(10001);

//
bool cmp(edge *e1,edge *e2)
{
	if(e1->wt<e2->wt)
	{
		return true;
	}else
	return false;
}

int main()
{
	
	
	
	int n,m;
	cin>>n>>m;
	
	
	for(int i=1;i<=m;i++)
	{
		int a,b,c;
	
		cin>>a>>b>>c;
			g[i-1]=new edge(a,b,c);
//		g[i-1].src=a;
//		g[i-1].dest=b;
//		g[i-1].wt=c;
		
	}
	
	sort(g.begin(),g.begin()+m,cmp);  //yeppppp
	
	
	for(int i=0;i<m;i++)
	{
		cout<<g[i]->src<<" "<<g[i]->dest<<" "<<g[i]->wt;
		cout<<endl;
	}
}
