// gas stations

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	int gas[]={6,3,7};
	int cost[]={4,6,3};
	
	int n=3;
	
	for(int i=0;i<n;i++)
	{
		
		int total=0,stopcount=0,j=i;
		
		while(stopcount<n)
		{
			total+=gas[j%n]-cost[j%n];
			
			if(total<0)
			return -1;
			
			stopcount++;
			j++;
		}
		
		if(stopcount==n&&total>0)
		{
		cout<<i;
		return i;
	}
	}
	
	return -1;
	
	
	
}
