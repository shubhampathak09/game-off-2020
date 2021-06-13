// count decodes

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	 string digit="121";
	 
	 
	int n=digit.length();
	
	int dp[n];
	
	dp[0]=1;
	
	
	for(int i=1;i<n;i++)
	{
		
		if(digit[i]=='0'&&digit[i-1]=='0')
		{
			dp[i]=0;
		}
		else if(digit[i]=='0'&&digit[i-1]!=0)
		{
			if(digit[i-1]=='1'||digit[i-1]=='2')
			
			dp[i]=(i>=2)? dp[i-2]:1;
			else
			dp[i]=0;
		}  else if(digit[i]!=0&&digit[i-1]!=0)
		{
			dp[i]=dp[i-1];
		 }else
		 {             // get last wo integer
		 	if(stoi(digit.substr(i-1,2))<=26)
		 	{   
			 if(i>=2) 
		 		dp[i]=dp[i-1]+dp[i-2];
		 		else
		 		dp[i]=dp[i-1]+1;
			 }else
			 dp[i]=dp[i-1];
		 }
		
	}
	
	cout<<dp[n-1];
}


