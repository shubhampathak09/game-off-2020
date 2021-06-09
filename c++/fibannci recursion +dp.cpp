//19 

// fibonacci n value

#include<bits/stdc++.h>
using namespace std;

int dp[10001];

int fib(int n)
{
	
	if(n==1||n==0)
	{
		return n;
	}
	
	if(dp[n]!=-1)
	return dp[n];
	
	int x=fib(n-1);
	
	int y=fib(n-2);
	
	
	return dp[n]=x+y;
	
}

int main()
{
	int n=9;
	
		memset(dp,-1,sizeof(dp));
	
	cout<<fib(n);
	

	
}
