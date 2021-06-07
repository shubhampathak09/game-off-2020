#include<bits/stdc++.h>
using namespace std;

int main()
{
	
int mat[3][3]={{1,2,3},{4,5,6},{7,8,9}};


for(int i=0;i<3;i++)
{
	for(int j=0;j<i;j++)
	{
		int temp=0;
		temp=mat[i][j];
		mat[i][j]=mat[j][i];
		mat[j][i]=temp;
	}
	}	
	// took the transpose of matrix
	// now rever each row
	
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<1;j++)
		{
			
			int temp=mat[i][j];
			mat[i][j]=mat[i][3-j-1];
			mat[i][3-j-1]=temp;
			
		}
	}
	
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cout<<mat[i][j]<<" ";
		}
		cout<<endl;
	}
	
}
