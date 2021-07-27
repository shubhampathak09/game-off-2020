#include<bits/stdc++.h>
using namespace std;


vector<int>parent(101);


int find(int s)
{
	if(parent[s]==s)
	return s;
	
	return find(parent[s]);
	
	
}


void combine(int a,int b)
{
	
	int x=find(a);
	
	int y=find(b);
	
	
	if(x!=y)
	{
		parent[y]=x;
	}
	
	
}

int main()
{
	
	
	
	int n=5;
	
//	parent(n+1);
	
	for(int i=0;i<n;i++)
	{
		parent[i]=i;
	}
	
	// 1 2    
	// 2 3
	
	// 4 5
	
	
//	cout<<find(1)<<endl;
//	
//	cout<<find(2)<<endl;
	
	combine(1,2);
	combine(2,3);
	combine(4,5);
	
	
	
	cout<<find(4)<<endl;
	
	for(int i=1;i<=5;i++)
	cout<<parent[i]<<endl;
}
