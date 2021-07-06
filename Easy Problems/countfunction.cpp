// max student check

#include<bits/stdc++.h>
using namespace std;


int main()
{
	
	int a[]={10,20,30,40};
	
	int n=sizeof(a)/sizeof(a[0]);
	
	int k=3;
	
	int count=1;
	
	int sum=0;
	
	for(int i=0;i<n;i++)
	{
		sum+=a[i];
//		cout<<sum<<endl;
		if(sum>30)
		{
	//		cout<<sum<<endl;
			count=count+1;
			if(count>k)
			{
				cout<<count;
			}
			
			sum=a[i];
			cout<<sum;
		}
	}
	cout<<count;
}
