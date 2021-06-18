#include<bits/stdc++.h>
using namespace std;

int parent[100];

int find(int a,int parent[],int n)
{
	if(parent[a]<0)
	return a;
	
	return find(parent[a],parent,n);
	
}

void union_of(int a,int b,int parent[],int n)
{
	
	 parent[a]=parent[a]+parent[b];
	 parent[b]=a;
	 
}

int main()
{
	
	int n,m;
	
	cin>>n>>m;
	
//	int parent[n+1];
	
	for(int i=0;i<=100;i++)
	parent[i]=-1;
	
	for(int i=1;i<=m;i++)
	{
		
		int a,b;
		cin>>a>>b;
		a=find(a,parent,n);
		b=find(b,parent,n);
	    if(a!=b)
	    union_of(a,b,parent,n);
	}
	
   int rep=1;
	for(int i=1;i<n;i++)
	{
		if(parent[i]<0)
		{
			rep=rep*(-1*parent[i]);
		}
	}
	
	
	for(int i=1;i<=n;i++)
	{
		cout<<i<<" "<<parent[i]<<endl;
	}
	
	cout<<rep;
}

//fyuck it

// what a fucking problem
