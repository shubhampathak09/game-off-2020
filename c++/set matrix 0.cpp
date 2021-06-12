// predecessor succesor

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int mat[4][4]={{1,0,0,1},{0,0,1,0},{0,0,0,0}};
	
	cout<<"Initial"<<endl;
	
		for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<mat[i][j]<<" ";
		}
		cout<<endl;
	}
	int rowptr=0;
    int colptr=0;
    
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(mat[i][j]==1)
			{
				mat[i][0]=1;
				mat[0][j]=1;
			}
		}
	}
	cout<<endl;
	
	for(int i=1;i<4;i++)
	{
		for(int j=1;j<4;j++)
		{
			if(mat[i][0]==1||mat[j][0]==1)
			{
				mat[i][j]=1;
			}
		}
	}
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<mat[i][j]<<" ";
		}
		cout<<endl;
	}
	
}
 

