#include<bits/stdc++.h>
using namespace std;
/*
How many numbers x are there in
the range a to b,
where the digit d occurs exactly k
times in x?
There may have several solutions
including number theory or
combinatorics,
ut let’s see how we can solve
this problem using digit dp.
*/


int dp[10][2][10];


int solve(string num,int pos,int tight,int cnt,int k,int d)
{
	if(cnt>k)
	return 0;
	
	if(pos==num.length())
	{
		if(cnt==k)
		return 1;
		else
		return 0;
	}
	
	if(dp[pos][tight][cnt]!=-1)
	return dp[pos][tight][cnt];
	
	if(tight==1)
	{
		int res=0;
		int nct=cnt;
		
		for(int i=0;i<=num[pos]-'0';i++)
		{
			if(i==num[pos]-'0')
			{
				if(i==d)
				{
			//res+=solve(num,pos+1,1,cnt+1,k,d);
			      nct=nct+1;
				 if(nct<=k)
				 res+=solve(num,pos+1,1,nct,k,d);  	
				}else
				{
		//			if(nct<=k)
					res+=solve(num,pos+1,1,nct,k,d);
				}
				 
			}
			else{
				
				if(i==d)
				{
					nct=nct+1;
				}
				
		//		if(nct<=k)
				res+=solve(num,pos+1,0,nct,k,d);
			}
		}
		return dp[pos][tight][cnt]=res;
	}
	else
	{
		int res=0;
		int nct=cnt;
		for(int i=0;i<=9;i++)
		{
			if(i==d)
			{
				nct=nct+1;
				 
		}
	  //  if(nct<=k)
		res+=solve(num,pos+1,0,nct,k,d); 
		}
		return dp[pos][tight][cnt]=res;
	}
}

int main()
{
	memset(dp,-1,sizeof(dp));
	
	int l=10;
	
	// 1 10 12 13 14 15 16 17 18 19 
	
	string ll=to_string(l);
	
	int ans=solve(ll,0,1,0,1,1);
	
	cout<<ans;
	
}
