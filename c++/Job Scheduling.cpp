// job assignment problem

#include<bits/stdc++.h>
using namespace std;

int cost[21][21];

int dp[21][1<<21];

int solve(int i,int mask,int n)
{
	// ith job to jt person and i to N
	// 0 to N-1 base case
	
	if(i==n)
	{
		return 0;
	}
	
	if(dp[i][mask]!=-1)
	return dp[i][mask];
	
	int ans=INT_MAX;
	
	for(int j=0;j<n;j++)
	{
		if(mask&(1<<j))
		{
			ans=min(ans,cost[j][i]+solve(i+1,mask^(1<<j),n));
		}
	}
	return dp[i][mask]=ans;
}


int main()
{
	
	int t=1;
	
	while(t--)
	{


 	memset(dp,-1,sizeof(dp));
 	
	int n;
    
	cin>>n;
	
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			cin>>cost[i][j];
		}
	}
		
	int result=solve(0,(1<<n)-1,n);
	
	cout<<result;
	
	// ans=13
	
	//Nice....:-)
}
}

/*
4
9 2 7 8
6 4 3 7
5 8 1 8
7 6 9 4
*/
