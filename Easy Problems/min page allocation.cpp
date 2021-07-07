// min book allocation
#include<bits/stdc++.h>
using namespace std;

bool check(int a[],int mid,int n,int k)
{

int count=1;
int sum=0;

for(int i=0;i<n;i++)
{
	sum+=a[i];
	if(sum>mid)
	{
		count=count+1;
		
		if(count>k)
		return false;
		
		sum=a[i];
	}
	}
	return true;	
}

int solve(int a[],int low,int high,int n,int k)
{
	int an=-1;
	while(low<=high)
	{
	
	int mid=(low+high)/2;
	
	
	if(check(a,mid,n,k)==true)
	{
		an=mid;
		high=mid-1;
	}
	else
	{
		low=mid+1;
	}
}
	return an;
}

int main(){
	
	
		int a[]={12,34,67,90};
		
		int n=sizeof(a)/sizeof(a[0]);
		
		
		int mx=-1;
		int tot=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>mx)
			mx=a[i];
			tot+=a[i];
		}
	
	    int k=2;
	    
	    int ans=solve(a,mx,tot,n,k);
	    
	    cout<<ans;
	    
}
