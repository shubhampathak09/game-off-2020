#include<bits/stdc++.h>
using namespace std;

int dp[20][1<<20];

int cost[20][20];

// assumiong sale person start from city 1 and end city 1)(n^2*2^n)
// 2- 2
// 3-3

int solve(int i,int mask,int n)  // s==1 travel from city i and reach back to 1 min cost
{
	
	if(i==n-1)
	{
	return cost[n-1][1]; // cost[n-1][s]
		
	}
	
	if(dp[i][mask]!=-1)
	return dp[i][mask];
	
	int mincs=INT_MAX;
	for(int k=1;k<n;k++)
	{
		// k!=s in case source  if(k!=s)
		if(mask&(1<<k))
		{
		
		int cs=cost[1][k];   /// cost[s][k]  /// in case the stating city is s
	    mincs=min(mincs,cs+solve(i+1,mask^(1<<k),n));	
	}
	
	return dp[i][mask]=mincs;
	
		}
	
}

int main()
{
	
	memset(dp,-1,sizeof(dp));
	
	
	// test code here for city 1:->
	
//	int ans=INT_MAX:
		// renitianlize dp for each of taring soure cities
		//call this unction
		
		// ans=min(ans,solve())...this way to process
		// np hard problem
		
}
