// allocate minimum number of pages

#include<bits/stdc++.h>
using namespace std;

bool checkvalid(int pages[],int n,int k,int mid)
{
	
	int sum=0;
	
	int count=1;
	
	for(int i=0;i<n;i++)
	{
		sum=sum+pages[i];
		if(sum>mid)
		{
	      count=count+1;
		  sum=pages[i];		
		}
		if(count>k)
		return false;
	}
	
	return true;
}

int main()
{
	
int pages[]={12,34,67,90};

int n=sizeof(pages)/sizeof(pages[0]);

int sum=0;

int mx=0;

for(int i=0;i<n;i++)
{
mx=max(mx,pages[i]);
sum+=pages[i];
	
	}	
	
	
	int low=mx;
	int high=sum;
	
	int k=2;
	
	int ans=-1;
	
	while(low<=high)
	{
		int mid=(low+high)/2;
        
		if(checkvalid(pages,n,k,mid)==true)
		{
			ans=mid;
			
			high=mid-1;
				}		
	    
		else
		{
			
			low=mid+1;
			
			}	
	
	}
	
	cout<<ans;
}
