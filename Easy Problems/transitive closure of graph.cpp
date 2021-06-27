#include<bits/stdc++.h>
using namespace std;
#define V 4

int main()
{
	
	
	int g[V][V]={{1,1,0,1},{0,1,1,0},{0,0,1,1},{0,0,0,1}};
	
	int sol[V][V];
	
	
	for(int i=0;i<V;i++){
		for(int j=0;j<V;j++)
		{
			sol[i][j]=g[i][j];
		}
	}
	
	
	
for(int i=0;i<V;i++)
{
	for(int j=0;j<V;j++)
	{
		
		for(int k=0;k<V;k++)
		{
			
			sol[i][j]=sol[i][j]||(sol[i][k]&&sol[k][j]);
		}
	}
}




for(int i=0;i<V;i++)
{
	for(int j=0;j<V;j++)
	{
		
		cout<<sol[i][j]<<" ";
	}
	cout<<endl;
	
}


	
}   

