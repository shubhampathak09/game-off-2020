#include<bits/stdc++.h>
using namespace std;

int main()
{
	
	int n=150;
	int res=0;
	
	for(int i=5;i<=150;i=i*5)
	{
		res+=n/i;
//		cout<<res;
//		cout<<endl;
		
	}
	cout<<res;
}
