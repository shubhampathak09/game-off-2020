
#include<bits/stdc++.h>
using namespace std;

struct edge
{
	
	int a;
	int b;
	int w;
	
	
 } ;


edge ar[100001];

int parent[10001];


int find(int a)
{
	
if(parent[a]==-1)
return a;

return find(parent[a]);	
}


void merge(int a,int b)
{
	int x=find(a);
	int y=find(b);
	
	
    parent[y]=x;	
}

bool cmp(edge e1,edge e2)
{
	
	return e1.w<e2.w;
	
}

int main()
{
	
int n,m,a,b,w;

cin>>n>>m;


for(int i=1;i<=n;i++)
{
	parent[i]=-1;
}
	
 
 for(int i=0;i<m;i++)
 {
 	cin>>ar[i].a>>ar[i].b>>ar[i].w;
 	
 }
 
 
sort(ar,ar+m,cmp); 

int we=0;

//for(int i=0;i<m;i++)
//{
//	
//	cout<<ar[i].a<<" "<<ar[i].b<<" "<<ar[i].w;
//	cout<<endl;	
//}

for(int i=0;i<m;i++)
{
	
	a=find(ar[i].a);
	b=find(ar[i].b);
	
//	cout<<a<<b<<endl;
	
    if(a!=b)
    {
    	merge(a,b);
    	we+=ar[i].w;
	}
	
}
 
 cout<<we;
}
