#include<bits/stdc++.h>
using namespace std;

int main(){
	
	int a[]={1,5,4,3};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	int l=0;
	
	int r=n-1;
	
	int maxwater=0;
	for(int i=0;i<n;i++)
	{
		
		if(a[l]>a[r])
		{
			int h=a[r];
	        maxwater=max(maxwater,h*(r-l));
			r--;		
		}
		else
		{
			int h=a[l];
			maxwater=max(maxwater,h*(r-l));
			l++;
		}
	}
	
	cout<<maxwater;
}
