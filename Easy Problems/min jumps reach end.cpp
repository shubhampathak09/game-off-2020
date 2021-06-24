// min jumps to reach end

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	
	
	int arr[]={1,1,1,1,1,1,1,1,1,1};
	
	int n=sizeof(arr)/sizeof(arr[0]);
	
	int dp[n];
	
	dp[n-1]=0;
	
	
	for(int i=n-2;i>=0;i--)
	{
		
	  if(arr[i]>0)
	  {
	  	int mn=INT_MAX;
	  	for(int j=1;j<=arr[i];j++)
	  	{
	  		if(i+j<n)
	  	    mn=min(mn,dp[i+j]);	
		  }
		  if(mn!=INT_MAX)
		   dp[i]=1+mn;
		   else
		   dp[i]=INT_MAX;
	  }
		
	}
	
	if(dp[0]==INT_MAX)
	{
		cout<<"NO solution";
		return 0;
		
	}
	
	cout<<dp[0];
}


