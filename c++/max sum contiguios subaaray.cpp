// max sum contiguos subarray

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={-2,1,-3,4,-1,2,1,-5,4};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	int csum=0;
	int ovsum=INT_MIN;
	
	for(int i=0;i<n;i++)
	{
		
		if(csum>=0)
		{
			csum+=a[i];
		}
	 	else
	 	csum=a[i];
	 	
	 	if(csum>ovsum)
	 	{
	 		ovsum=csum;
		 }
	}
	
	
	cout<<ovsum;
}
