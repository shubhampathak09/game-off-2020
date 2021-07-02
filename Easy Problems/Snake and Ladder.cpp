// Snake and Ladder

#include<bits/stdc++.h>
using namespace std;

struct node
{
	int v;
	int dist;
	
	
};

int getMinMoves(int move[],int N)
{
	
	// if nove==-1 then no snake
	// other wise go to move[x]
	
	bool visited[N];
	
	for(int i=0;i<N;i++)
	{
		visited[i]=false;
	}
	
	queue<node>q;
	visited[0]=true;
	q.push({0,0});
	
	node qt;
	
	while(!q.empty())
	{
		
		qt=q.front();
		
		if(qt.v==N-1)
		break;
		
		q.pop();
		
		for(int j=qt.v+1;j<=qt.v+6;j++)
		{
			if(j>=0&&j<N)
			{
			
			if(visited[j]==false)
			{
				
				visited[j]=1;
				
				if(move[j]==-1)
				q.push({j,qt.dist+1});
				else
				q.push({move[j],qt.dist+1});
			}
			
		}
	}
		
	}
	
	
	return qt.dist;
}


int main()
{
	
	
	int N=30;
	
	int moves[N];
	
	for(int i=0;i<N;i++)
	moves[i]=-1;


    moves[2]=21;
    moves[4]=7;
    moves[10]=25;
    moves[19]=28;
    
    moves[26]=0;
    moves[20]=8;
    moves[16]=3;
    moves[18]=6;
	
	
	int ans=getMinMoves(moves,N);
	
	cout<<ans;
}
