// number of 1 bits

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	int n=1;
	
	//. right shift
	// 101>> 10
	int count=0;
	int i=0;
	while(n!=0)
	{
		if(n&1==1)
		count++;
		
		n=n>>1;
		
		 
	}
	
	cout<<count;
}