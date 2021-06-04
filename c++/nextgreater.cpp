#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	
	int a[]={2,13,1,5,6,8,9,10,0,11,12};
	
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	int ans[n];
	
	ans[n-1]=-1;
	
	stack<int>s;
	
	s.push(n-1);
    
	for(int i=n-2;i>=0;i--)
	{
		
		while(!s.empty()&&a[i]>a[s.top()])
		{
			s.pop();
		}
		if(s.empty())
		{
			ans[i]=-1;
		}
		else
		{
			ans[i]=a[s.top()];
		}
		s.push(i);
	}
	
	
	for(int i=0;i<n;i++)
	{
		cout<<ans[i]<<" ";
	}
}
