 //Tags
 /*CPCRC1C - Sum of Digits
#dynamic-programming
SPOJ
*/
 
 #include<bits/stdc++.h>
using namespace std;

int dp[8][2][80];


int g(string num,int pos,int tight,int sum)
{
	if(pos==num.length())
	{
		return sum;
	}
	 if(dp[pos][tight][sum]!=-1)
	{
		return dp[pos][tight][sum];
	}
//	int res=0;
	else if(tight==1)
	{
		int res=0;
	 
		
		for(int i=0;i<=num[pos]-'0';i++)
		{
			if(i==num[pos]-'0')
			res+=g(num,pos+1,1,sum+i);
			else
			res+=g(num,pos+1,0,sum+i);
		}
		return dp[pos][tight][sum]=res;
	}
	else
	{
		int res=0;
		for(int i=0;i<=9;i++)
		{
			res+=g(num,pos+1,0,sum+i);
		}
		return dp[pos][tight][sum]=res;
	}
//	return res;
}
int main()
{
	
	
	int l=0;;
	
	int r=0;
	
	
	while(l!=-1&&r!=-1)
	{
		cin>>l>>r;
		if(l==-1&&r==-1)
		break;
		
		l=l-1;
	string a=to_string(l);
	string b=to_string(r);
    
	
	memset(dp,-1,sizeof(dp));	
	int ans1=g(a,0,1,0);
	memset(dp,-1,sizeof(dp));
	int ans2=g(b,0,1,0);
	
	
	cout<<ans2-ans1;
	
	}
	
	
	
}
