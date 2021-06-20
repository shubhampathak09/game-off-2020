// odd even houses
#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	 
 
	
	
	int n;
	cin>>n;
	
	map<int,int>houses;
	
	
	for(int i=1;i<=2*n-1;i=i+2)
	{
		
		houses[i]=(2*n)-i+1;
	}
	
	for(int i=2;i<=2*n;i++)
	{
		houses[i]=2*n-i+1;
	}
	
	int k;
	
	cin>>k;
	
	cout<<houses[k]<<endl;
	
	
}
	

