// subset sum problem

#include<bits/stdc++.h>
using namespace std;

int solve(int arr[],int n,int sum)
{
	
	int dp[n+1][sum+1];
	
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=sum;j++)
		{
			
			if(i==0&&j==0)
			dp[i][j]=1;
			else if(i==0)
			dp[i][j]=0;
			else if(j==0)
			dp[i][j]=1;
			else if(arr[i-1]<=j)
			dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
			else
			dp[i][j]=dp[i-1][j];
		}
	}
	return dp[n][sum];
 } 
 
 
 int main()
 {
 	
 	
 int arr[]={3,34,4,12,5,2};
 
 int n=6;
 
 
 int sum=9;
 
 
 cout<<solve(arr,n,sum);	
 	
 }
