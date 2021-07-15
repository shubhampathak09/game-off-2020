#include<bits/stdc++.h>
using namespace std;


int dp[10][2];

int g(string num,int pos,int tight,int n)
{
	
if(pos==num.length())
{
//	cout<<n<<endl;
	return 1;
}
	
if(dp[pos][tight]!=-1)
return dp[pos][tight];	
	
if(tight==1)
{
	int number=n;
	int ct=0;
	for(int i=0;i<=num[pos]-'0';i++)
	{
		number=number*10+i;
		if(i==num[pos]-'0')
		{
			ct+=g(num,pos+1,1,number);
		}else
		{
			ct+=g(num,pos+1,0,number);
		}
		
	}
	
	return dp[pos][tight]=ct;
	}	
	else
	{
		
		int number=n;
		int ct=0;
		
		for(int i=0;i<=9;i++)
		{
			number=number*10+i;
			ct+=g(num,pos+1,0,number);
		}
		
		return dp[pos][tight]=ct;
	}
}

int main()
{
	
	
	
}
