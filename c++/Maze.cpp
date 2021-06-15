#include<bits/stdc++.h>
using namespace std;
//sed

int dx[]={1,0,-1,0};
int dy[]={0,1,0,-1};

bool solve(vector<vector<int>>maze,int srcx,int srcy,int destx,int desty)
{
	
	
	int n=maze.size();
	int m=maze[0].size();
	
	//cout<<n<<m;
		int visited[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				visited[i][j]=0;
			}
		}
		
	   
	   queue<pair<int,int>>q;
	   q.push({srcx,srcy});
	   
	   while(!q.empty())
	   {
	   	
	   	pair<int,int>top=q.front();
	   	q.pop();
	   	int curx=top.first;
	   	int cury=top.second;
	   	
	   	if(curx==destx&&cury==desty)
	   	return true;
	   	
	   	visited[curx][cury]=1;
	
	   	for(int i=0;i<4;i++)
	   	{
	   		
	   		int newx=curx+dx[i];
	   		int newy=cury+dy[i];
	   	//	cout<<newx<<newy<<" ";
	   		
	   		while(maze[newx][newy]!=1&&newx>=0&&newx<n&&newy>=0&&newy<m)
	   		{
	   			newx=newx+dx[i];
	   			newy=newy+dy[i];
	   		//	cout<<1;
			   }
			   if(visited[newx-dx[i]][newy-dy[i]]!=1)
			   q.push({newx-dx[i],newy-dy[i]});
		   }
		   
	   	
	   }
	   
	   
	   return false;
	   
	
	
}

	

	
	int main()
	{
		
     vector<vector<int>>maze={{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
	 
	int startx=0;
	int starty=4;
	
	int destx=4;
	int desty=4 ;
	 		
		
	bool ans=solve(maze,startx,starty,destx,desty); 	
	
	
	
	cout<<ans;
	
	}
	



