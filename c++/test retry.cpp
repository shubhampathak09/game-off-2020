// retry
#include<bits/stdc++.h>
using namespace std;


int dp[10][2][10];

int g(string num,int pos,int tight,int cnt,int k,int d)
{
	
	
	if(cnt>k)
	return 0;
	
	if(pos==num.length())
	{
		
		if(cnt==k)
		{
		//cout<<
		return 1;
	}
		else
		return 0;
		
	}
	
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
					nct++;
				}
				if(nct<=k)
				res+=g(num,pos+1,1,nct,k,d);
			}else
			{
				if(i==d)
				{
					nct++;
				}
				if(nct<=k)
				res+=g(num,pos+1,0,nct,k,d);
			}
			
		}
		
		return dp[pos][tight][cnt]=res;
		
	}else
	{
		
		int res=0;
		int nct=cnt;
		
		for(int i=0;i<=9;i++)
		{
			if(i==d)
			nct++;
			
			if(nct<=k)
			res+=g(num,pos+1,0,nct,k,d);
		}
		
		return dp[pos][tight][cnt]=res;
	}
}

int  main()
{
	
	memset(dp,-1,sizeof(dp));
	
	
	int l=4;
	
	string ll=to_string(l);
	
	int k=1;
	int d=1;
	
	int ans=g(ll,0,1,0,k,d);
	
	cout<<ans;
	
	// 1 10 12 13 14 15 16 17 18 19 21
}

//f
