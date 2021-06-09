// climb stairs
//20
#include<bits/stdc++.h>
using namespace std;

int dp[100001];

int climbstairs(int n)
{
	
	if(n==1||n==2)
	return n;
	
	if(dp[n]!=-1)
	return dp[n];
	
	int x=climbstairs(n-1);
	int y=climbstairs(n-2);
	
	return dp[n]=x+y;
}

int main()
{
	
	memset(dp,-1,sizeof(dp));
	cout<<climbstairs(4);
}
