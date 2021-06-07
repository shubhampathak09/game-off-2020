#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int a[]={10,2,-2,-20,10};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	int currsum=0;
	
	int count=0;
	
	int target=-10;
	
	map<int,int>m;
	
	for(int i=0;i<n;i++)
	{
		
	currsum+=a[i];   
	
	 if(currsum==target)
 	 count++;
	
     	m[currsum]++;	 
		
	
	if(m.find(target-currsum)!=m.end())
	{
		count=count+m[currsum-target];
	}
		
	
	}
	cout<<count;
}
