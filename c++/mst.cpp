// prims mst

#include<bits/stdc++.h>
using namespace std;

int find_min(int key[],bool mst[])
{
	
	int min=INT_MAX;
	int min_index=-1;
	
	for(int i=0;i<5;i++)
	{
		if(mst[i]==false&&key[i]<min)
		{
			min=key[i];
			min_index=i;
		}
	}
	return min_index;
}

void solveMST(int g[][5],bool mst[],int key[],int parent[])
{

	

	
	for(int c=0;c<5;c++)
	{
		
		int u=find_min(key,mst);
		
		mst[u]=1;
		
		for(int i=0;i<5;i++)
		{
			
			if(g[u][i]&&mst[i]==false&&g[u][i]<key[i])
			{
				
				key[i]=g[u][i];  // finding the minimum edge key
				parent[i]=u;
			}
		}
	}
	
	int wt=0;
	for(int i=1;i<5;i++)
	{
		
		
		cout<<"Parent: "<<parent[i]<<" "<<"Source: "<<i<<"edge wt: "<<g[parent[i]][i];
		cout<<endl;
		wt+=g[parent[i]][i];
	}
	
	cout<<"Total wt is: "<<wt;
	
}

int main()
{
	
	int n=9;
	
	int g[5][5]={{0,2,0,6,0},{2,0,3,8,5},{0,3,0,0,7},{6,8,0,0,9},{0,5,7,9,0}};
	
    int parent[5];
	
	bool mst[5];
	int key[5];
	
	for(int i=0;i<5;i++)
	mst[i]=false;
	
	for(int i=0;i<5;i++)
	key[i]=INT_MAX;
	
	int src=0;
	
	key[0]=0;
		
	 
	
	parent[0]=-1;	
		
	solveMST(g,mst,key,parent);
	
	
	
}
