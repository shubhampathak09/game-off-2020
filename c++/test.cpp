/*
10001
00001

01110


1001

0110

1111
*/


//dp[i][j]-- sotres the count of i digit numner whose digit xor is j

//i 1 to 9for i+1 digits 



// FInd digits in l and R sum is equal to x

#include<bits/stdc++.h>
using namespace std;

int dp[10][2][92];

int g(string num,int pos,int tight,int sum,int x)
{
	
	if(pos==num.length())
	{
	 return sum;
	}
	
	if(dp[pos][tight][sum]!=-1)
	{
		return dp[pos][tight][sum];
	}
	if(tight==1)
	{
		
		int res=0;
		for(int i=0;i<=num[pos]-'0';i++)
		{
			if(i==num[pos]-'0')
			{
				res+=g(num,pos+1,1,sum+i,x);
			}else
			{
				res+=g(num,pos+1,0,sum+i,x);
			}
		}
		
		return dp[pos][tight][sum]=res;
	}
	else
	{
		int res=0;
		
		for(int i=0;i<=9;i++)
		{
			res+=g(num,pos+1,0,sum+i,x);
		}
		return dp[pos][tight][sum]=res;
	}
}

int main()
{
	
	int l=5;
	string ll=to_string(l-1);
	
	memset(dp,-1,sizeof(dp));
	
	int ans=g(ll,0,1,0,5);
	
	int r=11;
	
	string lq=to_string(r);
	
	memset(dp,-1,sizeof(dp));
	
	int ans2=g(lq,0,1,0,11);
	
	cout<<ans2-ans;
	
}
