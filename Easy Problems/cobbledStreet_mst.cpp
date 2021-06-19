#include<bits/stdc++.h>
using namespace std;


struct edge{
	
	int a;
	int b;
	int w;
	
};



bool cmp(edge e1,edge e2)
{
	
	return e1.w<e2.w;
	
}

edge arr[300001];
int parent[10001];
edge result[300001];

int find(int a)
{
	
	if(parent[a]==-1)
	return a;
	
	return parent[a]=find(parent[a]); // path compression
	
	
	// return find(parent[a]);
}

void merge(int a,int b)
{
	int x=find(a);
	int y=find(b);
    
	parent[y]=x;	
}

int main()
{
	
	
	int t;
	cin>>t;
	
	while(t--)
	{
		
		
		int p,n,m,a,b,c;
		int wt=0;
		
		cin>>p>>n>>m;
		
		for(int i=1;i<=n;i++)
		parent[i]=-1;
		
		for(int i=1;i<=m;i++)
		{
			cin>>arr[i].a;
			cin>>arr[i].b;
			cin>>arr[i].w;
			
		}
		
		
		sort(arr,arr+m,cmp);
		
		for(int i=1;i<=m;i++)
		{
			
			a=find(arr[i].a);  //1
			b=find(arr[i].b);  //2
			
			if(a!=b)
			{
				merge(a,b);
				// make b into a b's parent is a
				wt+=arr[i].w;
				
				result[i].a=a;
				result[i].b=b;
				result[i].w=arr[i].w;
				
			}
			
		}
		
		
		cout<<wt*p;
		cout<<endl;
		
		
		cout<<"Printing the MST path.."<<endl;
		
		
		for(int i=1;i<=n-1;i++)
		{
			cout<<result[i].a<<" "<<result[i].b<<" "<<result[i].w<<endl; // slight variation
		}
		
	}
    // mst path +total weight+path compression	
}


// Sample I/O to pass:-
/*
1
2
5
7
1 2 1
2 3 2
2 4 6
5 2 1
5 1 3
4 5 2
3 4 3
12
*/
