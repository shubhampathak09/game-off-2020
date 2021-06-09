// check if suuko config is valid or not

#include<bits/stdc++.h>
using namespace std;


bool checkrow(int a[][9],int row,int n)
{
	set<int>s;
	for(int i=0;i<9;i++)
	{
		if(s.find(a[row][i])!=s.end())
		{
			return false;
		}
		if(a[row][i]!=0)
		{
			s.insert(a[row][i]);
		}
		
	}
	return true;
	
}


bool checkcol(int a[][9],int col,int n)
{
	set<int>s;
	for(int i=0;i<9;i++)
	{
		if(s.find(a[i][col])!=s.end())
		{
			return false;
		}
		if(a[i][col]!=0)
		{
			s.insert(a[i][col]);
		}
	}
	return true;
}



bool checksubgrid(int a[][9],int row,int col)
{
	set<int>s;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(s.find(a[i+row][j+col])!=s.end())
			return false;
			
			if(a[i+row][j+col]!=0)
			s.insert(a[i+row][j+col]);
		}
		
	}
	
	return true;
}


bool checkvalid(int a[][9],int row,int col,int n)
{
	
	 if(checkrow(a,row,n)==true&&checkcol(a,col,n)==true&&checksubgrid(a,row-row%3,col-col%3)==true)
	 {
	 	return true;
	 }
	 return false;
}


int main()
{
int a[9][9]={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};


for(int i=0;i<9;i++)

for(int j=0;j<9;j++)
{
  if(!(checkvalid(a,i,j,9)))
  {
  	return false;
	  }	
}	
	
	cout<<"Valid suduko board";
}
 
