// rotate a matrix by 90

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[3][3]={{1,2,3,},{4,5,6},{7,8,9}};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
	


// after rotate


int temp[3][3];
	int n=3;

for(int j=n-1;j>=0;j--)
{
	for(int i=0;i<=n-1;i++)
	{
		temp[i][j]=a[n-1-j][i];
	}
}
	
cout<<"......"<<endl;
	
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		cout<<temp[i][j]<<" ";
	}
	cout<<endl;
	}	
}
