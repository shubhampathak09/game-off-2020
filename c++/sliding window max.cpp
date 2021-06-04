#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	int ar[]={1,2,3,1,4,5,2,3,6};
	
	int k=3;
	
	int n=sizeof(ar)/sizeof(ar[0]);
	
	int nge[n];
	
	nge[n-1]=n;
	
	stack<int>s;
	
	s.push(n-1);
	
	for(int i=n-2;i>=0;i--)
	{
		
	  while(s.size()>0&&ar[i]>ar[s.top()])	
	
		  {
		  	
		  	s.pop();
		  	
		  }
		  if(s.size()==0)
		  {
		  	nge[i]=n;
		  }
		  else
		  nge[i]=s.top();
		
		s.push(i);
		
		}
		
//		for(int i=0;i<n;i++)
//		{
//			cout<<nge[i]<<" ";
//			}
			
			int j;
			for(int i=0;i<=n-k;i++)
			{
				 j=i;
				
				//int rtindx=nge[i];
				
				while(nge[j]<i+k)
				{ 
					 
					  j=nge[j];
				}
				 
				cout<<ar[j]<<" ";
			}
				
}

// fml

