// smallest subarray with sum greater than given value

#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	
	int tsum=51;
	
	int a[]={1,4,45,6,0,19};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	int minlen=n+1;
	
	
	int start=0;
	int end=n-1;
	
	int csum=0;
	// fiuck
	
 while(end<n)
 {
 	
 	while(csum<=tsum&&end<n)
 	{
 		csum+=a[end];
 		end++;
	 }
 	
 	while(csum>tsum&&start<n)
 	{
 		
 		if(end-start+1<minlen)
 		minlen=end-start+1;
 		
 		
 		csum=csum-a[start];
 		start++;
	 }
 }
		
		// release
	
	

	cout<<minlen;
	
}
