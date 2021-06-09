// rot oranges

#include<bits/stdc++.h>
using namespace std;


#define R 3
#define C 5

struct node
{
	int timerame;
	int x;
	int y;
	
	node(int x,int y,int timerame)
	{
		this->x=x;
		this->y=y;
		this->timerame=timerame;
	}
};

int dx[]={1,0,-1,0};
int dy[]={0,1,0,-1};

int main()
{
	
	int maxt=0;
	
	int mat[R][C]={{2,1,0,2,1},{1,0,1,2,1},{1,0,0,2,1}};
	
	queue<node>q;
	
	
	for(int i=0;i<R;i++)
	{
		for(int j=0;j<C;j++)
		{
			
			if(mat[i][j]==2)
			{
				q.push({i,j,0});
			}
			
		}
	}
	
	while(!q.empty())
	{
		
	 
			
			auto temp=q.front();
			q.pop();
			
			int curx=temp.x;
			int cury=temp.y;
			int curtime=temp.timerame;
			for(int k=0;k<4;k++)
			{
				int newx=curx+dx[k];
				int newy=cury+dy[k];
				
				if(newx>=0&&newx<R&&newy>=0&&newy<C)
				{
					if(mat[newx][newy]==1)
					{
						mat[newx][newy]=2;
						maxt=max(maxt,curtime+1);
						q.push(node(newx ,newy,curtime+1));
					}
				}
				
							}
		
	}
	
	
	for(int i=0;i<R;i++)
	{
		for(int j=0;j<C;j++)
		{
			
			if(mat[i][j]==1)
			{
				cout<<"Not possible to rot all oranges";
				return 0;
			}
			
		}
	}
	
	cout<<"Time to Rot all oranges is.."<<maxt;
	cout<<endl;
	
	
}
