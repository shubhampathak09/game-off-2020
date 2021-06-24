// duplicates in array of N+1 integers

#include<bits/stdc++.h>
using namespace std;

#define N 3


int dx[]={0,-1,-1,-1,0,1,1,1};
int dy[]={1,1,0,-1,-1,-1,0,1};

char grid[N][N]={{'G','I','Z'},{'U','E','K'},{'Q','S','E'}};

vector<string>dict={"GEEKS","FOR","QUIZ","GO"};

bool find_dict(string word)
{

for(auto x:dict)
{
	if(x==word)
	return true;
}
	return false;	
}

void findwords(int i,int j,char grid[N][N],string &str,bool visited[N][N])
{
visited[i][j]=true;	

str.push_back(grid[i][j]);	
//cout<<1;

//cout<<str<<endl;

if(find_dict(str)==true)
{
//	cout<<1;
	cout<<str<<endl;
//	return;
}
	
for(int k=0;k<8;k++)
{
	int newi=i+dx[k];
	int newj=j+dy[k];
	
	if(newi>=0&&newi<N&&newj>=0&&newj<N&&visited[newi][newj]==false)
	{
     findwords(newi,newj,grid,str,visited);		
		
	}
}
str.pop_back();
visited[i][j]=false;	
}



int main()
{
	
	bool visited[N][N];
	
	for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			visited[i][j]=false;
		}
	}
	
	
	string str="";
	
	
 
	
	
	for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			 findwords(i,j,grid,str,visited);
		}
	}
}
